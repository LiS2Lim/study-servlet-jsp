package Chapter02;

/**
 * Webページを公開するには①というコンピュータにHTMLファイルを配置し、ブラウザを使って要求する。
 * どの①のどのHTMLファイルを要求するかを指定するのに使用されるのが②である。
 * ブラウザが①に要求することを③という。
 * ③にはいくつかの方法があり、代表的なものは④と⑤である。
 * また、①がブラウザの③に答えることを⑥といい、応答するデータの種類を表す⑦と処理結果を表す「ステータスコード」をヘッダ部を使って送信する。
 * この①とブラウザのやり取りは⑧というプロトコルで決められている。
 * Webアプリケーションはブラウザで実行できるアプリケーションで、その中核となるのがサーバサイドプログラムを実行する機能(環境)を備えた⑨というコンピュータが必要となる。
 * 特にJavaに夜サーバーサイドプログラムを⑩と呼び、⑩を実行できる環境を⑪という。
 * Javaによるサーバサイドプログラムには⑫という者があるが、これは⑩変換され、最終的には同じものとなる。
 */
class Question01 {
    Question01() {
       String answer = """
               ①サーバー
               ②URL
               ③リクエスト
               ④Getリクエスト
               ⑤Postリクエスト
               ⑥レスポンス
               ⑦Contentsタイプ
               ⑧Http
               ⑨ウェブアプリケーションサーバー(WAS)
               ⑩サーブレッド
               ⑪サーブレットコンテナ
               ⑫JSP
               """;
        System.out.println(answer);
    }
}

/**
 *以下のHTMLファイルをリクエストするURLを答えてください。
 * サーバ名は「localhost」、Apach Tomcatのポート番号は「8080」、動的Webプロジェクトの名前は「hogo」とします。
 * (1)WebContent直下に保存されているfoo.html
 * (2)WebContent直下のbarディレクトリに保存されているfoo.html
 */
class Question02 {
    Question02() {
        String answer = """
               (1)localhost:8080/hogo/foo.html
               (2)localhost:8080/hogo/bar/foo.html
               """;
        System.out.println(answer);
    }
}

public class Main {
    public static void main(String[] args) {
        new Question01();
        new Question02();
    }
}
