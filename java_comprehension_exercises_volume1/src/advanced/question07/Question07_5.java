package advanced.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question07_5 {

	public static void main(String[] args) throws IOException {

		// 登録商品（値は変更可）
		String[] itemNames = { "ノート", "ボールペン", "消しゴム", "はさみ", "のり" };
		// 単価（値は変更可）
		int[] prices = { 120, 80, 50, 250, 100 };
		// 購入数（変更不可）
		int[] amounts = new int[5];

		int totalPrice = 0;
		double TaxRate = 1.1;
		double saleRate = 0.1;

		// TODO: 実装ここから

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		for (int i = 0; i < amounts.length; i++) {
			System.out.println(itemNames[i] + "の購入数＞");
			String str = reader.readLine();
			amounts[i] = Integer.parseInt(str);
			totalPrice += amounts[i] * prices[i];

		}

		for (int i = 0; i < amounts.length; i++) {
			System.out.println(itemNames[i] + ":単価" + prices[i] + "円（税込" + (int) (prices[i] * TaxRate) + "円）" + "x"
					+ amounts[i] + "個=" + (int) (prices[i] * amounts[i] * TaxRate) + "円");

		}

		System.out.println("合計合計（税込）：" + (int) (totalPrice * TaxRate) + "円");
		totalPrice = (int) (totalPrice - totalPrice * saleRate);
		System.out.println("割引後合計（税込）:" + (int) (totalPrice * TaxRate) + "円");

	}
}