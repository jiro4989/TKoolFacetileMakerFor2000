package application.outputViewer;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

import javax.imageio.ImageIO;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import com.sun.jimi.core.JimiException;
import com.sun.jimi.core.util.ColorReducer;

/**
 * トリミングする際に利用される
 * x,y座標、拡大率とグリッドペイン上の行列番号、
 * パネルに表示する元になっている画像のBufferedImageを保持する拡張クラス。
 * @author jiro
 *
 */
public class MyImageView extends ImageView{
  private double x;
  private double y;
  private double rate;
  private final int column;
  private final int row;
  private BufferedImage originalImage;

  public MyImageView(int aColumn, int aRow) {
    this(null, 0, 0, 0, null, aColumn, aRow);
  }

  MyImageView(Image image, double aX, double aY, double aRate, String filePath, int aColumn, int aRow) {
    super(image);
    x = aX;
    y = aY;
    rate = aRate;
    column = aColumn;
    row = aRow;
    if (filePath != null) {
      try {
        originalImage = ImageIO.read(new File(filePath));
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }

  /**
   * 座標と拡大率、元になったイメージのみを更新する。
   * @param imageView
   */
  public void setImageInformation(MyImageView imageView) {
    x = imageView.x;
    y = imageView.y;
    rate = imageView.rate;
    originalImage = imageView.originalImage;
  }

  /**
   * タイル上にプレビューされていたイメージを
   * 実際にBuferedImageとして生成したパネル画像を返す。
   * @param list 
   * @param width ツクールのバージョンに対応したパネル幅
   * @return
   */
  public static BufferedImage makeTKoolFacetileImage(List<MyImageView> list, int width) {
    BufferedImage faceTileImage = new BufferedImage(width * 4, width * 4, BufferedImage.TYPE_INT_ARGB);
    Graphics2D g = (Graphics2D) faceTileImage.getGraphics();
    g.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BICUBIC);

    list.stream()
      .filter(Objects::nonNull)
      .filter(i -> Objects.nonNull(i.originalImage))
      .forEach(image -> {
        BufferedImage enlargedImage = makeEnlargedImage(image.originalImage, image.rate / 100);
        BufferedImage trimmingImage = enlargedImage.getSubimage((int) image.x, (int) image.y, width, width);
        int posX = (int) (image.column * width);
        int posY = (int) (image.row * width);
        g.drawImage(trimmingImage, posX, posY, null);
      });
    g.dispose();

    BufferedImage reducedImage = createQuantizedImage(faceTileImage, 24);

    return reducedImage;
  }

  private static BufferedImage createQuantizedImage(BufferedImage bImage, int maxColor) {

    try {

      // 減色
      ColorReducer reducer = new ColorReducer(maxColor);
      java.awt.Image reducedImage = reducer.getColorReducedImage(bImage);

      int width = (int) reducedImage.getWidth(null);
      int height = (int) reducedImage.getHeight(null);

      // BufferedImageへ変換
      BufferedImage newImage = new BufferedImage(width, height, BufferedImage.TYPE_3BYTE_BGR);
      Graphics g = newImage.createGraphics();
      g.drawImage(reducedImage, 0, 0, null);
      g.dispose();

      return newImage;

    } catch (JimiException e) {
      e.printStackTrace();
    }

    return null;

  }

  /**
   * 拡大した画像を返す。
   * @param image
   * @param rate
   * @return
   */
  private static BufferedImage makeEnlargedImage(BufferedImage image, double rate) {
    double width = image.getWidth();
    width *= rate;
    double height = image.getHeight();
    height *= rate;
    BufferedImage newImage = new BufferedImage((int) width, (int) height, BufferedImage.TYPE_INT_ARGB);

    Graphics2D g = newImage.createGraphics();
    g.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BICUBIC);
    g.scale(rate, rate);
    g.drawImage(image, 0, 0, null);
    g.dispose();

    return newImage;
  }

  int getColumn() {
    return column;
  }

  int getRow() {
    return row;
  }

  @Override
  public String toString() {
    return String.format("x: %1.1f, y: %1.1f, rate: %1.1f, column: %d, row: %d, originalImage: %s", x, y, rate, column, row, originalImage);
  }
}
