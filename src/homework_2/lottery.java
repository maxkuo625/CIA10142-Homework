package homework_2;

public class lottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int sum = 0; 
		 for (int lot = 1; lot <= 49 ; lot++) {
		 if (lot % 10 == 4) {
			 
		 }
		 else if (lot / 10 == 4) { 
			 
		 }                     
		 else {
		 System.out.print(lot + " ");
		 sum++;
		 }
		 }
		 System.out.println();
		 System.out.println("共" + sum + "個號碼");
		 System.out.println();

	}

}
