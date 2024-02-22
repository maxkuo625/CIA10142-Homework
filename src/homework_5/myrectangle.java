package homework_5;

public class myrectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		myrectangle_method r1 = new myrectangle_method();
		r1.setWidth(10);
		r1.setDpeth(20);
		System.out.println("r1長方形的面積為: " + r1.getArea());
		
		myrectangle_method r2 = new myrectangle_method(10,20);
		System.out.println("r2長方形的面積為: " + r2.getArea());

	}

}
