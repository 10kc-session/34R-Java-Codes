package _21_02_25;

public class Example1 {
	String name, city, street, state;

	public String getName() {
		return name;
	}

	public void setName(String nme) {
		name = nme;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String cty) {
		city = cty;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String strt) {
		street = strt;
	}
	
	public String getState() {
		return state;
	}

	public void setState(String st) {
		state = st;
	}
	public static void main(String[] args) {
		Example1 obj1 = new Example1();
		obj1.setName("Kukatpally");
		obj1.setCity("Hyderabad");
		obj1.setState("TS");
		obj1.setStreet("KPHB");
		
		System.out.println("Name : " + obj1.getName());
		System.out.println("City : " + obj1.getCity());
		System.out.println("State : " + obj1.getState());
		System.out.println("Street : "+ obj1.getStreet());
	
	}

}








