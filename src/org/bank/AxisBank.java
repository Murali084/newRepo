package org.bank;

public class AxisBank extends BankInfo{
	
	@Override
	public void deposit() {
		System.out.println("Fixed deposit without premature withdrawal");
		System.out.println("Fixed deposit without premature withdrawal");

	}

	public static void main(String[] args) {
		AxisBank a = new AxisBank();
		a.deposit();
	}

}
