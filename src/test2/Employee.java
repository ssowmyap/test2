package test2;

import java.util.HashMap;
import java.util.Scanner;

public class Employee {
	Scanner sc=new Scanner(System.in);
	public void setdetails() {
		int n=sc.nextInt();
		for (int i = 0; i <n; i++) {
         
		HashMap<Long,String> hm=new HashMap<>();
		System.out.println("enter phone number");
		System.out.println("enter name");
		hm.put(sc.nextLong(), sc.next());
		
	
	}
	}
  public void age() throws Exception {
	 int a=sc.nextInt();
		if(a<20&&a>55) {
			System.out.println(" not eligible");
		}
		else
			System.out.println(" eligible");
	}
  
	public static void main(String[] args)  {
	Employee e=new Employee();
	e.setdetails();
	try {
		e.age();
	} catch (Exception e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	

	}

}
