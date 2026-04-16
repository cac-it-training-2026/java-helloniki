package advanced.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question07_4 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		// 登録済み商品（値は変更可）
		String[] itemNames = { "ノート", "ボールペン", "消しゴム", "はさみ", "のり" };
		// 単価（値は変更可）
		int[] prices = { 100, 200, 300, 400, 500 };
		// 購入数（変更不可）
		int[] amounts = new int[5];
		int totalPrice = 0;
		double TaxRate = 1.1;

		// TODO: 実装ここから

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		for (int i = 0; i < amounts.length; i++) {
			System.out.println(itemNames[i] + "の購入数＞");
			String str = reader.readLine();
			amounts[i] = Integer.parseInt(str);
			totalPrice += amounts[i] * prices[i];
		}

		totalPrice = (int) (totalPrice * TaxRate);
		System.out.println("割引前合計：" + totalPrice + "円");

		if (totalPrice >= 5000) {

			totalPrice = (int) (totalPrice * 0.9);

			System.out.println("合計金額が5000円以上なので、10％割引を適応します。");
			System.out.println("割引適応（10%OFF）:" + totalPrice + "円");
		} else {
			System.out.println("合計金額が5000円以下なので、10％割引は適応されません。");

		}
		System.out.println("税込合計：" + (int) (totalPrice * 1.1) + "円");
	}

}
