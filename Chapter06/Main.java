package Chapter06;

/**
 * <pre>
 * 以下はMVCモデルと処理の遷移に関する記述です。
 * (1)から(10)に適切な語句を入れて文章を完成させてください。
 *
 * MVCモデルはアプリケーション内部をモデル、ビュー、コントローラの32つの要素に分けて開発を行うことを推奨している。
 * それぞれの要素に役割が決められており、「①」はユーザーの要求に答える処理を担当し、「②」はユーザーへの表示を担当する。
 * 「③」はユーザーからの支持とデータを受け取る窓口となり、指示とその結果の表示を専門の担当に依頼する司令塔の役割を果たす。
 * JavaによるWebアプリケーションでは、「④」でコントローラーを「⑤」でモデルを「⑥」でビューを作成することが一般的である。
 * なお、「④」から「⑥」へ処理を遷移させる方法は大きく2通りあり、Webサーバないで処理を即時転送する「⑦」と、転送先URLにアクセスするようブラウザに指示する応答を返す「⑧」がある。
 * 「⑦」をした場合、転送後のアドレスバーには「⑨」のURLが表示される。
 * 一方「⑧」をした場合転送後のアドレスバーには「⑩」のURLが表示される。
 * </pre>
 */
class Question01 extends util.Questions {
    Question01() {
        String answer = """
                ① モデル
                ② ビュー
                ③ コントローラー
                ④ Servlet
                ⑤ Java
                ⑥ JSP
                ⑦ Dispatcher
                ⑧ Redirect
                ⑨ 転送前
                ⑩ 転送後
                """;
        System.out.println(answer);
    }
}

/**
 * <pre>
 * redirected.jspとforwarded.jspの2つのJSPファイルが動的WebプロジェクトのwebContentに用意されている。
 * ブラウザで「http://localhost:8080/ex/ex62」にGetでアクセスすると動作し、発生させた乱数(0-9)が奇数ならredirected.jspにリダイレクト氏、偶数ならforwarded.jspにフォワードするサーブレットクラスを作成してください。
 * JSPファイルはともにwebContentの直下に配置するものとします。
 * </pre>
 */
class Question02 extends util.Questions {
    Question02() {
        String answer = """
                @WebServlet("/ex62")
                public class ex extend HttpServlet {
                    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
                        int num = (int)(Math.random() * 10);
                        if(num%2 == 0) {
                            res.sendRedirect("/ex/redirected.jsp");
                        } else {
                            RequestDispatcher dispatcher = req.getRequestDispatcher("/forwarded.jsp");
                            dispatcher.forward(req,res);
                        }
                    }
                }
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
