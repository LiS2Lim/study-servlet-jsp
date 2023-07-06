package Chapter07;

/**
 * 次の(1)～(5)に適切な語句を入れて文章を完成させてください。
 *
 * スコープは、サーブレットクラスとJSPファイルが自由にオブジェクトを保存したり取り出したりできる共有領域であり、アプリケーションスコープ、①スコープ、②スコープ、ページスコープの4種類がある。
 * スコープに保存するオブジェクトは③という再利用性を高めるためのルールを実装しているクラスであることが一般的である。③には④というgetXXX()setXXX()メソッドで定義される属性がある。
 * 例えばGetFullName()というメソッドを定義すると⑤という④が定義される。
 */
class Question01 extends util.Questions {
    Question01() {
        String answer = """
                ① リクエスト
                ② セッション
                ③ JavaBean
                ④ プロパティ
                ⑤ fullName
                """;
        System.out.println(answer);
    }
}

/**
 * <pre>
 * 下記のFruitクラスがあります。
 *
 * {@code
 *  package ex;
 *  public class Fruit implements java.io.Serializable {
 *      private String name;
 *      private int price;
 *      public Fruit() {}
 *      public Fruit(String name, int price) {
 *          this.name = name;
 *          this.price = price;
 *      }
 *      public String getName() { return name; }
 *      public String getPrice() { return price; }
 *  }
 * }
 *
 * Getリクエストによって起動し、次のような動作をするサーブレットクラス(FruitServlet.java)をexパッケージに作成してください。
 * ・「700円のイチゴ」を表すFruitインスタンスを生成する。
 * ・生成したFruitインスタンスをリクエストスコープに「fruit」という名前で格納する
 * ・WebContentないのWEB-INF/ex/fruit.jspに処理をフォワードする。
 *
 * なお fruit.jspの内容については、次の①～③に適切な記述をしてください。
 *
 * {@code
 *  <%@ page contentType="text/html; charset=UTF-8" %>
 *  <%@ page import="①" %>
 *  <% Fruit fruit = ②; %>
 *  <!DOCTYPE html>
 *  <html>
 *      ...省略...
 *  <body>
 *      <p><%= fruit.getName() %>の値段は③円です。</p>
 *  </body>
 *  </html>
 * }
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
                        
                        request.setAttribute("fruit", fruit);
                        
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
        new Chapter07.Question01();
        new Chapter07.Question02();
    }
}
