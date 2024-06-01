package corejava;

import java.util.Scanner;

public class VariableTest {
	/*-----------------Variable Test------------
	 * - used to store data
	 * - data stored for data processing
	 * 
	 * --syntax---
	 *   data_type var_name;
	 * 
	 */
	public static void main(String[] args) {
		 int a;
		 int b;
		 Scanner sc= new Scanner(System.in);
		 System.out.println("enter a=");
		 a = sc.nextInt();
		 System.out.println("enter b=");
		 b= sc.nextInt();
		 
		 int c= a+b;
		 System.out.println("total ="+c);
	}

}
