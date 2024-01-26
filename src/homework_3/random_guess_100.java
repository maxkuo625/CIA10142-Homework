package homework_3;

import java.util.Scanner;

public class random_guess_100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ans = (int)(Math.random() * 101);
		Scanner sc = new Scanner(System.in);
		System.out.println("開始猜數字吧(範圍=0~100)：");
		int x = 0;
		while (x != ans) {
			if (sc.hasNextInt()) {
				x = sc.nextInt();
			}
			else {
				System.out.println("請輸入整數");
				break;
			}
			if(x > ans) {
				System.out.println("答案比較小");
			}
			else if(x < ans) {
				System.out.println("答案比較大");
			}
			else if(x == ans) {
				System.out.println("恭喜你答對了");
			}

	}

}}
