package com.interfacee.tricky;

public interface Example2 {
	void x1(); // public abstract
	public static final int a = 100;
	default void y() {
		x();
	}
	private void x() {
		
	}
	public static void main(String[] args) {
		System.out.println(a);
	}
}
