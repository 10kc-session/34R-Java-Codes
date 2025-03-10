package test;

public class TestDemo {
	public void method() {
//		return 10; // error
		return; // correct way
	}

	public int intMethod(int a) {
//		return 10;
//		return a * 2;
//		return a; 
		return 10 + 30;
//		return; // error
	}

	public void x(int x) {
		System.out.println(x);
	}

	void show() {
		System.out.println("Hello");
	}

	static void main() {
//		show();
	}

	public static void main(String[] args) {

	}
}
