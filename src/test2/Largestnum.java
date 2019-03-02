package test2;

import java.util.Scanner;

public class Largestnum {


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
       int N=sc.nextInt();
       int L=sc.nextInt();
       if(L<N&&(L%100)<N%100)
    
    	   System.out.println("L is less than N");
       else 
    	   System.out.println("N is greater");
	}
	

}
