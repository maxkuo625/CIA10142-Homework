package homework_7;

public class cat implements animals  {
	private String name;
	
	public cat(String name) {
		this.name = name;
	}
	
	public void speak() {
		System.out.println("This is Cat " + name + " speaking!");
	}
	
}