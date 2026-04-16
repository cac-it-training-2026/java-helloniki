package advanced.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question07_3 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		// 登録済み商品（値は変更可）
		String[] itemNames = { "ノート", "ボールペン", "消しゴム", "はさみ", "のり" };
		// 単価（値は変更可）
		int[] prices = { 100, 200, 300, 400, 500 };
		// 購入数（変更不可）
		int[] amounts = new int[5];

		// TODO: 実装ここから
		int[] stocks = new int[5];
		int[] buy = new int[5];
		int buy_num;
		int sum = 0;

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		for (int i = 0; i < stocks.length; i++) {
			System.out.println(itemNames[i] + "在庫数＞");
			String str = reader.readLine();
			stocks[i] = Integer.parseInt(str);

		}

		for (int i = 0; i < stocks.length; i++) {
			System.out.println(itemNames[i] + "購入数＞");
			String str = reader.readLine();
			buy_num = Integer.parseInt(str);

			if (buy_num <= stocks[i]) {
				buy[i] = buy_num;
			} else if (buy_num > stocks[i]) {
				System.out.println("在庫を超えています。もう一度入力してください。 ");
				i--;
				continue;
			}
		}

		for (int i = 0; i < buy.length; i++) {
			System.out.println(itemNames[i] + ":購入" + buy[i] + "個");
			System.out.println("在庫：" + stocks[i] + "個");
			sum += buy[i] * prices[i];
		}
		System.out.println("合計金額：" + sum + "円");
	}
}
