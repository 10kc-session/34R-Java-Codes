package com.method.overriding;

class XParent {
	public Object getNumber() {
		return 10;
	}
}
class YChild extends XParent {
	@Override
	public Number getNumber() {
		return 550;
	}
}
class ZChild extends YChild{
	@Override
	public Short getNumber() {
		return 400;
	}
}
public class Test4 {
	public static void main(String[] args) {
			XParent x = new ZChild();
			Short number = (Short)x.getNumber();
			System.out.println(number);
	}
}
