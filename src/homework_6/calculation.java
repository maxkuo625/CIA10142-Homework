package homework_6;

import java.util.*;

public class calculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("請輸入x的值:");
			int x = sc.nextInt();
			System.out.println("請輸入y的值:");
			int y = sc.nextInt();
			if (y > 0) {
				System.out.printf("%d的%d次方等於%d", x, y, powerXY(x, y));
			} else {
				throw new CalException("次方為負值，結果回傳不為整數!");
			}
		} catch (InputMismatchException ie) {
			System.out.println("輸入格式不正確");
		} catch (CalException ce) {
			System.out.println(ce.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	static int powerXY(int x, int y) throws CalException {
		if ((x != 0) && (y != 0)) {
			return (int) (Math.pow(x, y));
		} else {
			throw new CalException("0的0次方沒有意義!");
		}
	}
}

class CalException extends RuntimeException {
	CalException(String message) {
		super(message);

	}

}
