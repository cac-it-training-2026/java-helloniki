package advanced.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question07_2 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		// 登録済み商品（値は変更可）
		String[] itemNames = { "ノート", "ボールペン", "消しゴム", "はさみ", "のり" };
		// 単価（値は変更可）
		int[] prices = { 100, 200, 300, 400, 500 };
		int[] amounts = new int[5];
		int sum = 0;

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		// TODO: 実装ここから

		for (int i = 0; i < amounts.length; i++) {
			System.out.println(itemNames[i] + "の購入数>");
			String str = reader.readLine();
			amounts[i] = Integer.parseInt(str);

		}

		for (int i = 0; i < itemNames.length; i++) {
			System.out.println(itemNames[i] + ":" + (prices[i] * amounts[i] + "円"));
			sum += prices[i] * amounts[i];
		}
		System.out.println("合計金額：" + sum);

	}
}
