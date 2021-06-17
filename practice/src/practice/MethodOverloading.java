package practice;

public class MethodOverloading {

	public void add(int a) {
		System.out.println("value is" +a);
	}
	
	public void add(int a, int b) {
		System.out.println("value is" +b);
	}
	
	public static void main(String[] args) {
	
		MethodOverloading m = new MethodOverloading();
		m.add(12);
		m.add(13, 15);
	}
	
	
}
