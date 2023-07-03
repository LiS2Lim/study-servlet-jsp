package Chapter01;

/**
 * 次の文章の1-9に適切な語句を入れてください。
 *
 * Webページを作成するには「HTML」という言語を使用する。
 * HTMLは「①」を使って、タイトルや段落、画像、リンクと言ったページの構成要素を作成できる。
 * 例えば、段落を作成する場合は「②」、画像を作成する場合は「③」を使用する。
 * また、「①」には「④」という補足的な要素を加えることができ、例えばリンクの場合、リンクを表す「⑤」に「⑥」という「④」を加える必要がある。
 * HTMLの基本構造はDOCTYPE宣言、htmlタグ、headタグ、bodyタグで成り立っている。
 * このうち、ページに関する情報を書くのは「⑦」、ページの本体を書くのは「⑧」である。
 * HTMLをWebページとして表示するには「⑨」というソフトウェアを使用する。
 */
class Question01 extends utils.Questions {
    Question01() {
        String answer = """
                ①タグ
                ②<p>
                ③<image>
                ④property
                ⑤<a>
                ⑥href
                ⑦headタグ
                ⑧bodyタグ
                ⑨ブラウザ
                """;
        System.out.println(answer);
    }
}

/**
 * 次の図のように、「菅原拓真のプロフィール(sugawara.html)」というWebページを作成し、コード1-4(P38)の「メンバー一覧ページ(memberList.html」に追加変更を加えて、行き来できるようにしてください。
 * また、コード1-6(P43)で作った「綾部めぐみのプロフィール(ayabe.html)」ともメンバー一覧ページから行き来できるようにしましょう。
 */
class Question02 extends utils.Questions {
    Question02() {
        String answer = """
                以下のタグをmemberList.htmlに追加する。
                
                <a href="sugawara.html">菅原拓真のプロフィール</a>
                <a href="ayabe.html">綾部めぐみのプロフィール</a>
                
                以下のタグをsugawara.htmlとayabe.htmlに追加する
                <a href="memberList.html">メンバー一覧ページへ</a>
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