package homework_2;

public class even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		for(int i = 2; i <= 1000; i+=2) {
			sum += i;
		}
		System.out.println("1~1000的偶數和為" + sum);

	}

}
