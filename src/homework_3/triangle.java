package homework_3;

import java.util.Scanner;

public class triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入三角形的第一邊邊長");
		int x = sc.nextInt();
		System.out.println("請輸入三角形的第二邊邊長");
		int y = sc.nextInt();
		System.out.println("請輸入三角形的第三邊邊長");
		int z = sc.nextInt();
		
		if(x != 0 && y != 0 && z != 0) {
			if (x == y && y == z) {
				System.out.println("這個三角形是正三角形");
			}
			else if (x == y || y == z) {
				System.out.println("這個三角形是等腰三角形");
			}
			else if (Math.pow(x ,2) == (Math.pow(y ,2) + Math.pow(z ,2)) 
					|| Math.pow(y ,2) == (Math.pow(x ,2) + Math.pow(z ,2)) 
					|| Math.pow(z ,2) == (Math.pow(y ,2) + Math.pow(x ,2))) {
				System.out.println("這個三角形是直角三角形");
			}
			else if (x + y > z && y + z> x && x + z > y) {
				System.out.println("這是其他的三角形");
			}
			else {
				System.out.println("這個不是三角形");
			}	
		}
		else {
			System.out.println("這個不是三角形");
		}
		}

	}


