package _21_02_25;

public class Example2 {
	byte b1;
	short s1;
	int i1;
	long l1;
	float f1;
	double d1;
	boolean b2;
	char ch;
	public byte getByte() {
		return b1;
	}
	public short getShort() {
		return s1;
	}
	public int getInt() {
		return i1;
	}
	public long getLong() {
		return l1;
	}
	public float getFloat() {
		return f1;
	}
	public double getDouble() {
		return d1;
	}
	public boolean getBoolean() {
		return b2;
	}
	public char getChar() {
		return ch;
	}
	
	public void setByte(byte b) {
		b1 = b;
	}
	
	public void setShort(short s) {
		s1 = s;
	}
	
	public void setInt(int i) {
		i1 = i;
	}
	
	public void setLong(long l) {
		l1 = l;
	}
	
	public void setFloat(float f) {
		f1 = f;
	}
	
	public void setDouble(double d) {
		d1 = d;
	}
	
	public void setBoolean(boolean b) {
		b2 = b;
	}
	
	public void setChar(char c) {
		ch = c;
	}
	
	
	public static void main(String[] args) {
		Example2 obj1 = new Example2();
		System.out.println("Byte : " + obj1.getByte());
		System.out.println("Short : "+obj1.getShort());
		System.out.println("Int : " + obj1.getInt());
		System.out.println("Long : "+obj1.getLong());
		System.out.println("Float : " + obj1.getFloat());
		System.out.println("Doulbe : " + obj1.getDouble());
		System.out.println("BOolean " + obj1.getBoolean());
		System.out.println("Char : " + obj1.getChar());
		
		System.out.println("------After Adding the Data---------");
		byte b = 10;
		obj1.setByte(b);
		short s = 20;
		obj1.setShort(s);
		
		obj1.setInt(30);
		obj1.setFloat(1.5f);
		obj1.setLong(230303);
		obj1.setDouble(3.14);
		obj1.setBoolean(true);
		obj1.setChar('A');
		
		System.out.println("Byte : " + obj1.getByte());
		System.out.println("Short : "+obj1.getShort());
		System.out.println("Int : " + obj1.getInt());
		System.out.println("Long : "+obj1.getLong());
		System.out.println("Float : " + obj1.getFloat());
		System.out.println("Doulbe : " + obj1.getDouble());
		System.out.println("BOolean " + obj1.getBoolean());
		System.out.println("Char : " + obj1.getChar());
		
	}
}








