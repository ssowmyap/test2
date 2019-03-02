package test2;

import java.util.Scanner;

class FixedAccount {
	 Scanner sc=new Scanner(System.in);
	
	double intrestpecentage=sc.nextInt();
		int balance=10000;
		int amount=sc.nextInt();
		public void calculateIntreset() {
		
		double intrest=((amount+balance)*intrestpecentage);
		System.out.println("amount to fixed"+intrest);
	}
}
class Savingaccount extends FixedAccount {
	@Override
	public void calculateIntreset() {
		
	
		double intrest1=((amount-balance)*intrestpecentage);
		System.out.println("saving amount"+intrest1);
	}
	
}


 public  class Fixedaccount{

	public static void main(String[] args) {
		Savingaccount sa=new Savingaccount();
		
		sa.calculateIntreset();
		
		
		
	}

}


