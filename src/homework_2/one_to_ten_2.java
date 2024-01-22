package homework_2;

public class one_to_ten_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 1;
		int sum = 1;
		while(i <= 10) {
			sum *=i;
			i++;
		}
		System.out.println("1~10的連乘積為"+ sum);

	}

}
