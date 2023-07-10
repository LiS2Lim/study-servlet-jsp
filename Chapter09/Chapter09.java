package Chapter09;

/**
 * <pre>
 *  次にあげる特性は、リクエスト/セッション/アプリケーションのどのスコープに当てはまるものか答えてください。
 *  なお、2つ以上のスコープが当てはまる場合は、すべてあげてください。
 *
 *  ①保存したオブジェクトはアプリケーションサーバにアクセスする複数のユーザーで共有される。
 *  ②サーバからブラウザにレスポンスが帰ると、中身が消えてしまう
 *  ③基本的には、ブラウザを閉じても中身が消えない
 *  ④getAttribute()メソッドとsetAttribute()メソッドを用いて、オブジェクトを保存、取得ができる。
 *  ⑤invalidate()メソッドとsetAttribute()メソッドを用いて、オブジェクトを保存、取得できる。
 *  ⑥アプリケーションサーバを停止したり、明示的な削除指示をしたりしなければ保存したオブジェクトが自動では消えないため、濫用するとメモリを圧迫する点に特に注意が必要である。
 * </pre>
 */
class Question01 extends util.Questions {
    Question01() {
        String answer = """
                ①アプリケーションスコープ
                ②リクエストスコープ
                ③アプリケーションスコープ
                ④リクエストスコープ/セッションスコープ/アプリケーションスコープ
                ⑤セッションスコープ
                ⑥アプリケーションスコープ
                """;
        System.out.println(answer);
    }
}

/**
 * <pre>
 *  練習8-2では、Fruitインスタンスをセッションスコープ経由でやり取りするサーブレットクラスとJSPファイルを作成しました。
 *  このコードを、セッションスコープではなく、アプリケーションスコープを用いるように修正してください。
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
                
                ① ex.Fruit
                ② (Fruit)request.getAttribute("fruit")
                ③ <%= fruit.getPrice() %>
                """;
        System.out.println(answer);
    }
}

public class Chapter09 {
    public static void main(String[] args) {
        new Question01();
        new Question02();
    }
}
