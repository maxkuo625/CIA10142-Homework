package homework;

public class ninecrossnine_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 1;
		while(i <= 9){
		int j = 1;
		do {
			System.out.print(i + "*" + j + "=" + i*j + "\t");
		j++;
		}while(j <= 9);
		System.out.println(); 
		i++;
		}

	}

}
