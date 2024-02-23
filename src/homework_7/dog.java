package homework_7;

public class dog implements animals {
	private String name;
	
	public dog(String name) {
		this.name = name;
	}
	
	public void speak() {
		System.out.println("This is Dog " + name + " speaking.");
	}
}