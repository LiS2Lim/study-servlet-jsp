# Study-servlet-jsp

<pre>
Pulbic class サーブレット入門 {
  private String bookTitle = "スッキリわかるサーブレット&JSP入門";
  private enum 目次 = { 
    第01章 HTMLとWebページ,
    第02章 Webの仕組み,
    第03章 サーブレットの基礎,
    第04章 JSPの基本,
    第05章 フォーム,
    第06章 MVCモデルと処理の遷移,
    第07章 リクエストスコープ,
    第08章 セッションスコープ,
    第09章 アプリケーションスコープ,
    第10章 アプリケーション作成,
    第11章 サーブレットクラスの実行の仕組みとフィルタ,
    第12章 アクションタグとEL式,
    第13章 JDBCプログラムとDAOパターン,
    第14章 Webアプリケーションの設計,
  }

  public String DoStudy(目次 list) {
    return list + "の練習問題を解いてGithubに更新"
  }

  public static void main(String[] args) {
    try {
      String result = DoStudy(目次.valueOf(args[0]));
      String today = new SimpleDateFormat("yyyy/MM/dd").format(new GregorianCalendar().getTime());
      System.out.println(result + "(" + today + ")");
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("勉強予定のリストを記入してください");
    } catch (IllegalArgumentException e) {
      System.out.println("章の名前が間違ってます。確認してから再度入力ください");
    } catch (Throwable e) {
      System.out.println("予期せぬエラーが発生しました。作業を終了します");
      return;
    }
  }
}
</pre>
