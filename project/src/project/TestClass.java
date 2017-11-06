package project;

public class TestClass {
	private int number;
	
	public TestClass(int number) {
		this.number = number;
	}
	
	public TestClass() {
		this(0);
	}
	
	public int getNumber() {
		return number;
	}
	
	public void increment() {
		number++;
	}
	
	public void decrement() {
		number--;
	}
}
