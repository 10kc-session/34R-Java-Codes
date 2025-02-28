package operators;

//public class Example6 {
//	int a; 
//	public static void updateObjValue() {
//		Example6 obj = new Example6();
//		System.out.println(obj.a); 
//	}
//	public static void updateValue(Example6 obj1) {
//		System.out.println(obj1.a);
//	}
//	public static void main(String[] args) {
//		Example6 obj1 = new Example6();
//		obj1.a = 40;
//		updateValue(obj1);
//		
////		updateObjValue();
////		updateObjValue();
////		updateObjValue();
//	}
//}


public class Example6 {
	int a; 
	public static void updateObjValue(Example6 obj1) {
		obj1.a = obj1.a++ + --obj1.a; 
	}
	public static void main(String[] args) {
		Example6 obj1 = new Example6(); // 20 
		obj1.a = 20;
		updateObjValue(obj1);
		System.out.println(obj1.a);
	}
}


//	public void updateObjValue2() {
//		a = a++ + ++a + --a - a--;
//	}

//public class Example6 {
//	int a; // 82 -> obj2.a = 2
//	public static void updateObjValue(Example6 obj) {
//		obj.a = obj.a++ + --obj.a; 
//	}
//	public void updateObjValue2() {
//		a = a++ + ++a + --a - a--;
//	}
//	public static void main(String[] args) {
//		Example6 obj1 = new Example6();
//		Example6 obj2 = new Example6(); 
//		obj1.a = 20;
//		updateObjValue(obj1);
//		System.out.println(obj1.a); // 40
//		obj1.updateObjValue2(); 
//		System.out.println(obj1.a); // 82
//		obj2.updateObjValue2();
//		System.out.println(obj1.a + obj2.a); // 84 
//	}
//}










//	public static void updateValue(Example6 obj) {
//		System.out.println(obj.a);
//	}
//		updateValue(obj1);