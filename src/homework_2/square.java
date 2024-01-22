package homework_2;

public class square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum=0;
		for (int i = 1; sum < 100; i++) {
			sum = (int) Math.pow(i,2);
			System.out.print(sum + " ");
		}
		
		System.out.println();
	}

}
