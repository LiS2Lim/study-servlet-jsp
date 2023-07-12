package Chapter13;

/**
 * <pre>
 *     次の文章の①～⑧に、適切な語句を入れて、文章を完成させてください。
 *
 *     本格的なWebアプリケーションでは、データの格納にデータベースを用いる。
 *     中でもデータを複数のテーブル(表)の形で格納する①という種類のでほたぺーすが一般的である。
 *     ①には、②という言語を用いてデータの読み書きを指示する。
 *     Javaから①を制御する場合に用いるのがJDBCと呼ばれる一連のAPIである。
 *     このAPIは③パッケージに属したクラスやインタフェースから構成される。
 *     さらに、利用するデータベース製品ごとに提供される④をクラスパスが徹場所に配置することで利用可能となる
 *     データベースの接続や切断には⑤、SQLの送信には⑥、検索結果を受け取るためには⑦など、複数のクラスやインタフェースを用いたJDBCプログラムは複雑なものとなりやすい。
 *     そこでデータベース操作を専門に受け持つ⑧と呼ばれるクラスを作成するデザインパターンが広く利用されている。
 * </pre>
 */
class Question01 extends util.Questions {
    Question01() {
        String answer = """
                ① RDBMS
                ② SQL
                ③ java.sql
                ④ jdbcドライバー
                ⑤ Connection
                ⑥ Statment
                ⑦ ResultSet
                ⑧ DAOパターン
                """;
        System.out.println(answer);
    }
}

/**
 * <pre>
 *     コード13-3のEmployeeDAOに、次のような責務を持つメソッドremove()を追加してください。
 *     ・呼び出される際、従業員IDとして文字列を1つ受け取る
 *     ・該当する従業員の情報をデータベースから削除する
 *     ・従業員を削除した場合は、true、該当従業員がいない場合やエラーが発生した場合はfalseを戻り値して返す
 * </pre>
 */
class Question02 extends util.Questions {
    Question02() {
        String answer = """
                public boolean remove(String staffId) {
                    try(Connection conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS)) {
                        String sql = "DELETE FROM Staff WHERE ID = ?";
                        PreparedStatement state = conn.prepareStatement(sql);
                        state.setString(1, staffId);
                        int rs = state.executeUpdate();
                        return (result == 1);
                    } catch(Exception e) {
                        e.printStackTrace();
                    }
                }
                """;
        System.out.println(answer);
    }
}

public class Chapter13 {
    public static void main(String[] args) {
        new Question01();
        new Question02();
    }
}
