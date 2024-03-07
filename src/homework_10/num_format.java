package homework_10;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.Scanner;

public class num_format {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入數字: ");
		String regex = "^\\d+(\\.\\d+)?$";
		Double value;
		while (true) {
			String input = sc.nextLine();
			if (input.matches(regex)) {
				value = Double.parseDouble(input);
				break;
			} else {
				System.out.println("數字格式不正確，請再輸入一次:");
			}
		}

		System.out.println("欲格式化成(1)千分位(2)百分比(3)科學記號: ");
		while (true) {
			if (sc.hasNextInt()) {
				int format = sc.nextInt();
				switch (format) {
				case 1:
					Format nfm1 = new DecimalFormat("#,###.##");
					System.out.println(nfm1.format(value));
					break;
				case 2:
					Format nfm2 = new DecimalFormat("#.##%");
					System.out.println(nfm2.format(value));
					break;
				case 3:
					Format nfm3 = new DecimalFormat("0.##E00");
					System.out.println(nfm3.format(value));
					break;
				default:
					System.out.println("無效的選擇，請重新輸入: ");
					continue;
				}
				break;
			} else {
				System.out.println("無效的選擇，請重新輸入: ");
				sc.next();
			}
		}
		sc.close();

	}

}
