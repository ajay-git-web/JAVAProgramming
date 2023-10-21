/*
10. Write a program to calculate the income tax payable by an individual based on their annual income, considering the following tax slabs:

Income less than or equal to 2.5 lakhs: No tax.
Income greater than 2.5 lakhs and less than or equal to 5 lakhs: 5% of the income.
Income greater than 5 lakhs and less than or equal to 10 lakhs: 10% of the income.
Income greater than 10 lakhs: 15% of the income.
*/
import java.util.*;
class TaxSlab{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an income:");
		int income=sc.nextInt();
		double tax;
		if(income<=250000){
			System.out.println("No applicable for tax");
		}
		else if(income >250000 && income <=500000){
			tax=0.05*income;
			System.out.println("Payable income tax for an income "+income+" is :"+tax);
		}
		else if(income >500000 && income <=1000000){
			tax=0.1*income;
			System.out.println("Payable income tax for an income "+income+" is :"+tax);
		}
		else{
			tax=0.15*income;
			System.out.println("Payable income tax for an income "+income+" is :"+tax);
		}
	}
}