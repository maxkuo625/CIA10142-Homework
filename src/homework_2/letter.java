package homework_2;

public class letter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 0; i <=5; i++) {
			for(int j = 0; j <= i; j++) {
				int k = 65 + i;
				char ch = (char)k;
				System.out.print(ch);
			}
			System.out.println();
		}
	}
}

