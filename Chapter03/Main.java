package Chapter03;

/**
 * 動的Webプロジェクト「lesson」内にある次のコードのサーブレットに対して、ブラウザからURL「http://localhost:8080/lesson/ex1」にリクエストして実行できるようにするために、①から④に適切な記述をしてください。
 *
 * <pre>{@code
 *  @WebServlet("①")
 *  public lcass EX1 extends HttpServlet {
 *   protected void ②(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
 *       res.setContentType("③");
 *       PrintWriter out = ④.getWriter();
 *       out.println("<html><body>hello</body></html>")
 *   }
 *  }
 * }</pre>
 */
class Question01 extends util.Questions {
    Question01() {
        String answer = """
                ①/ex1
                ②doGet
                ③text/html; charset=utf-8
                ④res
                """;
        System.out.println(answer);
    }
}

/**
 * 練習3-1の③の部分で、誤った値としてABCDEを指定するようコードを修正してください。
 * これを実行するとブラウザはどう動作したか、またなぜそのような動作になるか、「Content-Typeヘッダの意味」を含めて考えてください。
 */
class Question02 extends util.Questions {
    Question02() {
        String answer = """
                ブラウザがファイルタイプの判断ができない。
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
