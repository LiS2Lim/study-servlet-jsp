package Chapter04;

/***
 * <pre>
 * {@code
 *  package ex;
 *  public class Employee {
 *      private String id;
 *      private String name;
 *      public Employee (String id, String name) {
 *          this.id = id; this.name = name;
 *      }
 *      public String getId() {
 *          return this.id;
 *      }
 *      public String getName() {
 *          return this.name;
 *      }
 *  }
 * }
 *
 * 上記のクラスのインスタンスを生成し、そのフィールドが出力されるように、下記のJSPファイルの①～⑤をうめてください。
 * 出力文字コードはUTF-8、作成インスタンス名はemp, IDと名前は"0001"と"楓"とします
 *
 * {@code
 *  <%@ page contentType="①" import="②" %>
 *  <% ③ %>
 *  <!DOCTYPE html>
 *  <html><body>
 *      <p>IDは④、名前は⑤です</p>
 *  </body></html>
 * }
 * </pre>
 */
class Question01 extends util.Questions {
    Question01() {
        String answer = """
                ① text/html; charset=utf-8
                ② ex.Employee
                ③ Employee emp = new Employee("0001","楓");
                   String id = emp.getId();
                   String name = emp.getName();
                ④ <%= id %>
                ⑤ <%= name %>
                """;
        System.out.println(answer);
    }
}

/***
 * <pre>
 * 練習4-1のex.jspを修正し、IDと名前を10回繰り返して表示するJSPファイルを作成してください。
 * なお、1、4、7、10行目だけ赤色の文字(style属性で"color:red"を指定)で表示されるようにしてください。
 * </pre>
 */
class Question02 extends util.Questions {
    Question02() {
        String answer = """
                <% for (int i = 0; i < 10; i++) { %>
                    <% if (i % 3 == 0) { %>
                        <p style="color:red;">IDは<%= id %>、名前は<%= name %>です</p>
                    <% } else { %>
                        <p>IDは<%= id %>、名前は<%= name %>です</p>
                    <% } %>
                <% } %>
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
