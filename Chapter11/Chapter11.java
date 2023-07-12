package Chapter11;

/**
 * <pre>
 *     次のようなWebアプリケーションで、以下の1～4の操作を行った場合の処理の流れ①～⑧に、選択肢から適切な者を選んで入れてください。
 *
 *     ・init(), doGet(), destroy()メソッドを持つサーブレットクラスAがある
 *     ・サーブレットクラスAにはFilterBが設定されている
 *     ・ServletContextEventインターフェースを実装したリスナーCがある。
 *
 *     「操作」
 *     1.サーバを起動             ①が実行
 *     2.サーブレットAをリクエスト  ②→③→④の順で実行
 *     3.サーブレットAをリクエスト  ⑤→⑥の順で実行
 *     4.サーバを終了             ⑦→⑧の順で実行
 * </pre>
 */
class Question01 extends util.Questions {
    Question01() {
        String answer = """
                ①ServletContextListenerのリスナーCにて、contextInitialized()が先に起動
                ②フィルターBのdoFilter()が起動
                ③サーブレットAのinit()が起動
                ④サーブレットAのdoGet()が起動
                ⑤フィルターBのdoFilter()が起動
                ⑥サーブレットAのdoGet()が起動
                ⑦サーブレットAのdestroy()が起動
                ⑧ServletContextListenerのリスナーCにて、contextDestroyed()が最後に起動
                """;
        System.out.println(answer);
    }
}

/**
 * <pre>
 *     ある開発プロジェクトではアプリケーションスコープの利用を禁止することとしました。
 *     アプリケーションスコープにインスタンスを保存しようとすると、System.out.println()でコンソールに警告文を出力するようなリスナーNoAppScopeListener.javaをlistenerパッケージに作成してください。
 * </pre>
 */
class Question02 extends util.Questions {
    Question02() {
        String answer = """
                package listener;
                
                @WebListener
                public class NoAppScopeListener implements ServletContextAttributeListener {
                    public void attributeAdded(ServletContextAttributeEvent arg) {
                        System.out.println("警告！");
                    }
                    public void attributeRemoved(ServletContextAttributeEvent arg) {}
                    public void attributeReplaced(ServletContextAttributeEvent arg) {}
                }
                """;
        System.out.println(answer);
    }
}

public class Chapter11 {
    public static void main(String[] args) {
        new Question01();
        new Question02();
    }
}
