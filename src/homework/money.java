package homework;

public class money {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int y;
		int money = 150;
	    double rate = 0.02;
	    double saving = money*(1 + rate);
	    for (y = 1; y <= 10; y++) {
	    	saving *= (1 + rate) ;
	    }
	    System.out.println("複利10年本金加利息共有" + (int)saving + "萬元");


	}

}
