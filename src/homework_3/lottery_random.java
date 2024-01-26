package homework_3;

import java.util.Scanner;

public class lottery_random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 0;
		int num_10;
		int num_1;
		int amount = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入數字");
		num = sc.nextInt();
		for (num_10 = 0; num_10 <= 4; num_10++) {
			if (num_10 == num) {
				continue;
			}
			for (num_1 = 0; num_1 <= 9; num_1++) {
				if (num_1 == num) {
					continue;
				}
				if (num_1 != 0 && num_10 == 0) {
					amount = amount + 1;
				} else if (num_10 > 0) {
					amount = amount + 1;
				}
			}
		}

		int ran;
		String[] lot_num = new String[amount];
		int i = 0;
		for (num_10 = 0; num_10 <= 4; num_10++) {
			if (num_10 == num) {
				continue;
			}
			for (num_1 = 0; num_1 <= 9; num_1++) {
				if (num_1 == num) {
					continue;
				}
				if (num_1 != 0 && num_10 == 0) {
					lot_num[i] = num_1 + "";
					i = i + 1;
				} else if (num_10 > 0) {
					lot_num[i] = num_10 + "" + num_1;
					i = i + 1;
				}
			}
		}
		System.out.println("隨機六碼：");
		for (int j = 0; j < 6; j++) {
			ran = (int) (Math.random() * amount);
			if (lot_num[ran] != "0") {
				System.out.print(lot_num[ran] + " ");
				lot_num[ran] = "0";
			}
		}
	}
}
