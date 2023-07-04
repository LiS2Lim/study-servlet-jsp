package Chapter05;
import util.Questions;

/**
 * <pre>
 * 次のJSPファイルとサーブレットクラスがフォームで連携できるように、①～④に適切な語句を入れて完成させてください。
 *
 * [jsp]
 * {@code
 * 	<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
 * 	--省略--
 * 	<form action="/example/①" method="post">
 * 	    名前:<br>
 * 	    <input type="text" name="name" /><br>
 * 	    <input type="submit" value="登録" />
 * 	</form>
 * 	--省略--
 * }
 *
 * [サーブレット]
 * {@code
 * 	@WebServlet("/Ex5_1")
 * 	public class Exercise extend HttpServlet {
 * 	    protected void ② (HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
 * 	        request.setCharacterEncoding("③");
 * 	        String name = request.getParameter("④");
 * 			--省略--
 * 	    }
 * 	}
 * }
 * </pre>
 */
class Question01 extends Questions {
	Question01() {
		String answer ="""
				① Ex5_1
				② doPost
				③ UTF-8
				④ name
				""";
		System.out.println(answer);
	}
}

/**
 * <pre>
 * HTMLフォームには、本章で紹介したもの以外にも様々なコントロールを利用することができます。
 * 特にinputタグ以外のタグを用いるものとしては次の2栂有名です
 * ・ドロップダウンリスト
 * ・テキストエリア
 * ドロップダウンリストはselectタグとoptionタグを使って実現します。
 * テキストエリアはtextareaタグを使って実現します。
 * HTMLリファレンスを調べながら、ドロップダウンリストとテキストエリアを用いた次のような「お問い合わせフォーム」を作成してください。
 *
 * 「お問い合わせフォームの仕様」
 * ・ユーザーの「名前を入力できるテキストボックスを「name」という名前で作成する
 * ・ユーザーが「お問い合わせの種類」を選択できるドロップダウンリストを「qtype」という名前で作成する。
 * 　選択できるメニューと送信される値は次のようにする。
 * 　「会社について」　送信値：company
 * 　「製品について」　送信値：product
 * 　「アフターサポートについて」　送信値：support
 * ・ユーザーが「お問い合わせ内容」を複数行で入力できるテキストエリアを「body」という名前で作成する
 * ・送信ボタンを押すと「/example/testenq」に対してPOSTメソッドでリクエストとが送信される
 * </pre>
 */
class Question02 extends Questions {
	Question02() {
		String answer ="""
				<html>
				<head>
					<title>Question02</title>
				</head>
				<body>
					<form action="/example/testenq" method="post">
						名前：
						<input type="text" name="name" /><br>
						問い合わせの種類：
						<select name="qtype">
							<option value="company">会社について</option>
							<option value="product">製品について</option>
							<option value="supoort">アフターサービスについて</option>
						</select><br>
						<textarea name="body" rows="5" cols="33"></textarea><br>
						<input type="submit" value="送信" />
					</form>
				</body>
				</html>
				
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