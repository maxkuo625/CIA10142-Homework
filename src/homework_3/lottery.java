package homework_3;

import java.util.Scanner;

public class lottery {

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
					System.out.print("0" + num_1 + " ");
					amount = amount + 1;
				} else if (num_10 > 0) {
					System.out.print(num_10 + "" + num_1 + " ");
					if (num_1 == 0) {
						System.out.println();
					}
					amount = amount + 1;
				}
			}
		}

		System.out.println();
		System.out.println("總共個數：" + amount);

	}

}
