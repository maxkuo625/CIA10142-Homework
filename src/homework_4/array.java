package homework_4;

import java.util.*;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i[] = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
		int sum = 0;
		for(int j = 0; j < i.length; j++ ) {
			sum += i[j];
		}
		int avg = sum / i.length;
		System.out.println("這個陣列的平均值為" + avg);
		
		System.out.print("高出陣列平均值的有:");
		for(int k = 0; k < i.length; k++) {
			if(i[k] > avg) {
				System.out.print(i[k] + " ");
			}
		}

	}

}
