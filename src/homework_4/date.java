package homework_4;

import java.util.*;

public class date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] day = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		Scanner ymd = new Scanner(System.in);
		System.out.println("請輸入西元年(yyyy):");
		int year = ymd.nextInt();
		System.out.println("請輸入月(mm):");
		int month = ymd.nextInt();
		int d;
		if (month != 2) {
			System.out.println("請輸入日(dd):");
			d = ymd.nextInt();
		} else {
			for (d = 0; d == 0;) {
				System.out.println("請輸入日(dd):");
				d = ymd.nextInt();
				if (d > 28) {
					d = 0;
					System.out.println("2月日期應小於29日，請重新輸入");
				} else
					break;
			}
		}
		int dnum = 0;
		for (int i = 0; i < month - 1; i++) {
			dnum += day[i];
		}
		dnum += d;

		if (month > 2) {
			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
				dnum += 1;
			}
		}

		System.out.println("西元" + year + "年，第" + dnum + "天");

	}

}
