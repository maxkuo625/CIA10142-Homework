package homework_5;

import java.util.Scanner;

public class starsquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int width;
		int height;
		Scanner s =new Scanner(System.in);
		System.out.println("請輸入方塊寬度：");
		width =s.nextInt();
		System.out.println("請輸入方塊長度：");
		height =s.nextInt();
		
		starsquare_method star = new starsquare_method();
		star.starSquare(width, height);

	}

}
