package homework_5;

public class maxelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] intArray = {{1,6,3},{9,5,2}};
		double[][] doubleArray = {{1.2, 3.5, 2.2},{7.4, 2.1, 8.2}};
		
		System.out.println("兩個二維陣列的最大值回傳：");
		maxelement_method m = new maxelement_method();
		System.out.println((int)m.maxElement(intArray));
		System.out.println(m.maxElement(doubleArray));

	}

}
