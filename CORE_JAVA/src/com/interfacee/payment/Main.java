
package com.interfacee.payment;

interface Payment{
	void pay(double amount);
}
class CreditCard implements Payment{
	@Override
	public void pay(double amount){
	System.out.println("Payment Done through credit card after discount : " + (amount -(amount * 0.02)));
	}
}
class DebitCard implements Payment{
	@Override
	public void pay(double amount){
		System.out.println("Paid Successfully using DebitCard");
	}
}

class UPI implements Payment{
	@Override
	public void pay(double amount){
		System.out.println("amount paid through upi");
	}
}
class Cash implements Payment{
	@Override
  	public void pay(double amount){
		 System.out.println("Amount paid through cash");
	}
}
public class Main{
	public static void main(String [] args){
		Payment payment = new CreditCard();
		payment.pay(5000);
	}
}











