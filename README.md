# TKoolFacetileMaker2 マニュアル

- 作者           : 次郎(Jiro)
- 作成日         : 2016/07/16
- 最終更新日     : 2016/11/20
- 連絡先         : [避難所の一つ](http://ashelter.blog.fc2.com/)
- 実行ファイル名 : TKFM.jar
- 動作確認・開発環境
  - OS             : Windows7 64bit Home Premium, LinuxBean12.04
  - プロセッサ     : 3.50GHz Intel Core i7-4770K
  - メモリ         : 8GB RAM
  - Javaバージョン : 1.8.0-101

## 概要
このソフトは、RPGツクールMV・VXACEの表情差分ファイルを効率的に作成するためのソ
フトです。

本ソフトを利用する主な対象者は、立ち絵の差分は持っているけれど、ツクール規格に
は対応していないから自分で規格に合わせるのがめんどくさいと感じている方、自分で
立ち絵を描いたのはいいけれど、いちいちツクールの規格に合わせる作業をするのが面
倒と感じている方です。

簡易ですが画像の拡大縮小もできるので、ペイントソフトをいちいち開いたりしなくて
よいソフトです。

また、MV,VXACEと記載しているとおり、MV,VXACE両方の規格に合わせて出力することが
可能になっています。

## 使い方
1. TKFM.jarをダブルクリックします。Linux環境ではターミナルで"java -jar
   TKFM.jar"と入力してください。

2. ひとつのファイルにまとめたい表情差分をインポートします。画面左上のメニューの
   開くからまとめたいファイルを選択してください。画面左側のリストにファイル名が
   追加されていれば正常にインポートが完了しています。このファイルの追加はドラッ
   グアンドドロップでも行えます。

3. ファイルリストをクリックしてください。ファイルリストをクリックすると、画面右
   側の画像ビューワに選択した画像が表示されます。

4. 画像ビューワ中央のグリッドをマウスドラッグで移動してください。位置調整はキー
   ボードからも行えます。上下左右移動はWASD, 拡大率の調整はQ, Eで行えます。ま
   た、移動量や拡大率の増減量は、画像ビューワ下のコンボボックスで調節できます。

5. 位置が決まったら、パネルをクリックするか、一括挿入ボタンをクリックしてくださ
   い。一括挿入はキーボードからも行えます。数字キーを押していただくと、押した数
   字に対応したパネルから一括挿入がされます。

6. これでOKだと思うように調整できましたら、メニューから保存を選択してください。
   正常に保存されていることが確認できれば、作業は終了です。お疲れ様でした。

## ショートカットキー

    W：プレビューの画像を上にずらす。
    A：プレビューの画像を左にずらす。
    S：プレビューの画像を下にずらす。
    D：プレビューの画像を右にずらす。
    
    Q：プレビューの画像を縮小。
    E：プレビューの画像を拡大。
    
    1：プレビューパネルの1番からファイルを一括挿入する。
    2：プレビューパネルの2番からファイルを一括挿入する。
    3：プレビューパネルの3番からファイルを一括挿入する。
    4：プレビューパネルの4番からファイルを一括挿入する。
    5：プレビューパネルの5番からファイルを一括挿入する。
    6：プレビューパネルの6番からファイルを一括挿入する。
    7：プレビューパネルの7番からファイルを一括挿入する。
    8：プレビューパネルの8番からファイルを一括挿入する。

## 注意点・不具合など
- Javaをインストールしていない環境では動作しないと思います。そういった場合は
  Javaのインストール手順に従って、本ツールのバージョン以上のも のを使用してくだ
  さい。

- ファイル破損などが起きないよう慎重にデバッグを行っておりますが、個人製作とい
  うこともあり、確認がいたっていない部分も多いと思います。ファイルを扱う際はな
  るべく上書き保存などはしないで、バックアップをとって利用 してください。また、
  バグが確認されたら製作者ブログ、またはツクマテコミュニティの配布ページ で報告
  をしていただけると助かります。

## 利用規約
- 配布している素材を利用したことで発生した問題に対して、私は一切の責任を負いま
  せん。
- 著作権は私(次郎)が有しています。私が死亡して５０年経過するまで決して放棄する
  ことはありません。
- 再配布はお控えください。
- 利用規約を事前連絡なしに変更する場合があります。その場合は最新の規約が適用さ
  れるものとします。

### 補足
- 利用できる作品
  - ツクール用に作成しましたがツクール作品以外の素材作成が目的でも利用可能で
    す。
  - 有償作品、エロゲー、グロゲーでも利用可能です。
  - ゲーム作品以外でも利用可能です。

- 利用報告
  - readmeへの記載はしなくても結構です。
  - 使用報告もしなくて結構です。

## その他・作者からのお願い
バグの報告は【連絡先】の製作者ブログか、ツクマテコミュニティのツール配布のペー
ジでお願いします。

新しい機能の実装のご要望をいただいた場合、実装する場合もある
かもしれませんが、必ずではないことをご了承ください。

## 更新履歴
2016/07/16: ver1.0
- プログラム公開

2016/07/16: ver1.1
- 使い方画面で表示されるチュートリアル画像が同封されておらず、画像が表示されな
  い不具合を修正。

2016/08/06: ver1.2
- プログラム内で使用していた画像をソース内に含むように変更。
- エクスプローラーからドラッグアンドドロップでリストにファイルを追加できるよう
  に変更。
- TKFM.jar単体で動作するように変更。propertiesというフォルダが同じフォルダ内に
  存在しなかった場合、自動でそれらを生成する。
- Linux環境でも動作するように変更。

2016/09/14: ver1.3
- ウィンドウサイズを可変式に変更。
- 各種コンポーネントにマウスオーバーすると説明が表示されるように変更。
- フォントをシステムフォントからメイリオ12ptに変更。OSのシステムフォントサイズ
  によって本ツールのフォントサイズ およびレイアウトが意図しないものになる不具合
  を解消。
- 出力ファイル名が未入力のままファイルを上書き保存しようとすると警告を表示する
  ように変更。
- メニューに画像位置と拡大率を変更する項目を追加。

2016/10/16: ver1.4
- レイアウト定義ファイルの記述が誤っていた不具合を修正。
  コンソールから実行してもエラーを吐かずに正常起動するように。
- 設定ファイル内の日本語が文字化けしていた不具合を修正。

2016/10/19: ver1.5
- 画像の拡大縮小アルゴリズムを変更し、より綺麗に画像を出力できるように。

**2016/10/22: ver2.0  
ツールを設計し直して、レイアウトの見直し、機能の追加、バグ修正をした。大きくプ
ログラムを書き直したため、バージョンを2.0とする。**

- 機能追加・変更:
  - ツクールのバージョン変更をメニューバーに移動。
  - オプション設定画面を追加。設定変更はメニュー→設定から。
  - ナンバリングの各種設定をオプション設定画面に移動。
  - ナンバリングで保存する際の名前の定義をダイアログから行うように変更。
  - フォントサイズを変更可能に。
  - 画像ビューワで、トリミング可能な幅を明確にするためのグリッド線を追加。この
    線は実際のトリミング画像には影響しない。
  - ナンバリングして保存をする出力先をTKFM.jarと同じ階層のoutputフォルダに固
    定。このフォルダが存在しなかった場合、自動でフォルダが生成される。
  - 各コンポーネントに付与していたツールチップ(マウスオーバーで表示される解説
    文)が 目障りだと感じたので全て削除。
  - メニューのヘルプの使い方の項目を削除。上記の理由で使い方ウィンドウ内で使用
    していた画像も削除。使い方は同封のreadme.txtを参照。
  - その他操作をメニューバーに追加。

- バグ修正:
  - トリミング位置の目安になるフォーカスと実際のトリミング位置のズレを修正。
  - 画像の縮小によってトリミングサイズより元の画像が小さくなった場合にファイル
    出力ができないように、画像の縮小が途中で停止するように変更。

2016/11/20: ver2.1
- ファイルの保存先や開いたファイルの存在するフォルダの名前を後から変更した場合に、
  ファイル選択画面を開けなくなる不具合を修正。
