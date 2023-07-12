package Chapter12;

/**
 * <pre>
 *     次の文章及びコードの①～⑦に適切な語句を入れてください。
 *
 *     アクションタグには最初から利用可能な①と、開発者が独自に作成する②がある。
 *     代表的な①として、ほかのJSPファイルの③結果を取り込むことができるincludeアクションタグがある。
 *     一方便利な②の集合であるJSTLは複数のタグライブラリから構成されており、その中の④は、条件分岐・振替しと言った基本的な処理を行うタグを提供している。
 *     EL式を使うと⑤に保存されたインスタンスを利用する処理を簡潔に記述できる。
 *     ただし、分岐や繰り返し処理でEL式を使用するには④を使用する必要がある。
 *     例えばスコープの状態が図12-6の場合は次のように記述できる
 *     {@code
 *      <c:forEach ⑥="user" ⑦="${humanList}">
 *          名前:${user.name}、年齢：${user.age}
 *      </c:forEach>
 *     }
 * </pre>
 */
class Question01 extends util.Questions {
    Question01() {
        String answer = """
                ①標準アクションタグ
                ②カスタムタグ
                ③出力
                ④Coreタグライブラリ
                ⑤スコープ
                ⑥var
                ⑦items
                """;
        System.out.println(answer);
    }
}

/**
 * <pre>
 *     練習9-2ではアプリケーションスコープからFruitインスタンスを取り出して表示するサーブレットとJSPを作成しました。
 *     このうちJSPファイルをEL式ょ用いるように修正してください。
 *     なお、インスタンスは常にアプリケーションスコープから取得されることが保証されなければなりません。
 * </pre>
 */
class Question02 extends util.Questions {
    Question02() {
        String answer = """
                package ex;
                
                @WebServlet("/fruit")
                public class FruitServlet extends HttpServlet {
                    protected void doGet(HttpServletRequest request, HttpServlet Response response) throws IOException, ServletException {
                        Fruit fruit = new Fruit("イチゴ",700);
                        
                        ServletContext application = this.getServletContext();
                        application.setAttribute("fruit", fruit);
                        
                        RequestDispatcher d = request.getRequestDispatcher("/WEB-INF/ex/fruit.jsp");
                        d.forward(request, response);
                    }
                }
                
                <p>${applicationScope.fruit.name}</p>
                """;
        System.out.println(answer);
    }
}

public class Chapter12 {
    public static void main(String[] args) {
        new Question01();
        new Question02();
    }
}
