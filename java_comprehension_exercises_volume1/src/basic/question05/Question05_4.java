package basic.question05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 第8章 条件分岐
 */

public class Question05_4 {

	public static void main(String[] args) throws IOException {

		// TODO:ここに実装
		System.out.println("数学の試験結果の点数を入力してください。");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String strmath = reader.readLine();
		int math = Integer.parseInt(strmath);

		System.out.println("国語の試験結果の点数を入力してください。");
		String strjapanese = reader.readLine();
		int japanese = Integer.parseInt(strjapanese);

		if (math >= 60 && japanese >= 60) {
			System.out.println("数学も国語ともに合格です。");

		} else if (math >= 60 || japanese >= 60) {

			System.out.println("数学も国語どちたが合格です。");
		} else {
			System.out.println("どちらの教科も不合格です。");
		}

	}
}
