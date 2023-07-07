package Chapter08;

/**
 * <pre>
 *     サーブレットやJSPの間でオブジェクトを引き渡すために、リクエストスコープとセッションスコープのどちらかを利用したいと思います。
 *     次のそれぞれの状況でより好ましいものを選んでください。
 *
 *     (1)画面Aから呼び出されたサーブレットクラスがJSPファイルに処理をリダイレクトする際にオブジェクトを引き渡したい。
 *     (2)画面Bから呼び出されたサーブレットクラスがJSPファイルに処理をフォワードする際にオブジェクトを引き渡したい。
 *     (3)パスワード登録画面の「送信」ボタンのクリックで起動するサーブレットクラスで、もし登録画面で入力されたパスワードが8文字未満の場合、error.jspにフォワードして「?文字のパスワードは短すぎます」と表示したい。
 *     (4)ログイン画面の「送信」ボタンのクリックで起動するサーブレットクラスにおいて、画面で入力されたID情報(文字列インスタンス)を保存しておき、以降様々なサーブレットクラスやJSPファイルで取り出し利用したい。
 * </pre>
 */
class Question01 extends util.Questions {
    Question01() {
        String answer = """
                (1)セッションスコープ
                (2)リクエストスコープ
                (3)リクエストスコープ
                (4)セッションスコープ
                """;
        System.out.println(answer);
    }
}

/**
 * <pre>
 *     練習7-2ではFruitインスタンスをリクエストスコープ経由でやり取りするサーブレットクラスとJSPファイルを作成しました。
 *     このコードを、リクエストスコープではなく、セッションスコープを用いるように修正してください。
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
                        
                        HttpSession session = request.getSession();
                        session.setAttribute("fruit", fruit);
                        
                        RequestDispatcher d = request.getRequestDispatcher("/WEB-INF/ex/fruit.jsp");
                        d.forward(request, response);
                    }
                }
                
                ① ex.Fruit
                ② (Fruit)request.getAttribute("fruit")
                ③ <%= fruit.getPrice() %>
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
