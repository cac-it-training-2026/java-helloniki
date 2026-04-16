package basic.question06;

import java.io.IOException;

public class Question06_1 {

	public static void main(String[] args) throws IOException {

		// TODO:ここに実装
		String[] messageString = { "こんにちは", "Java学習中", "繰り返しの演習", "頑張ります" };

		for (int i = 0; i < 4; i++) {
			System.out.println(messageString[i]);
		}
		System.out.println("繰り返しが終了しました。");
	}
}
