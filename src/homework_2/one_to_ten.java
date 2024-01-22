package homework_2;

public class one_to_ten {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 1;
		for(int i = 1; i <=10; i++) {
			sum *= i;
		}
		System.out.println("1~10的連乘積為"+ sum);

	}

}
