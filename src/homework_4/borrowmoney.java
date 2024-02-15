package homework_4;

import java.util.*;

public class borrowmoney {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int bm[][] = {{25, 32, 8, 19, 27},{2500, 800, 500, 1000, 1200}};
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("輸入小文欲借的金額是");
		int money = sc.nextInt();
		System.out.println("有錢可借的員工編號:");
		for(int i = 0; i < bm[1].length; i++) {
			if(money <= bm[1][i]) {
				count++;
				System.out.print(bm[0][i] + " ");
			}
		}
		System.out.println();
		System.out.println("總共" + count + "人");

	}

}
