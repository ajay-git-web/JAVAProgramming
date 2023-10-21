/*
9.Write a program to calculate the net salary of an employee based on the following conditions:

If the basic salary is less than or equal to 10000, the HRA (House Rent Allowance) is 20% of the basic salary
and the DA (Dearness Allowance) is 80% of the basic salary.
If the basic salary is greater than 10000, the HRA is 25% of the basic salary 
and the DA is 90% of the basic salary.

*/
import java.util.*;
class Employee{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a salary of an employee:");
		int salary=sc.nextInt();
		double HRA,DA;
		if(salary<=10000){
			HRA=0.2*salary;
			DA=0.8*salary;
		}
		else{
			HRA=0.25*salary;
			DA=0.9*salary;
		}
		System.out.println("Salary is: "+salary+" HRA: "+HRA+" DA:"+DA);
	}
}