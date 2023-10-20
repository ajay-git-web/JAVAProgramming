//2. Write a program to determine whether a given year is a leap year or not.
import java.util.*;
class CheckYear{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a year:");
		int year=sc.nextInt();
		if((year%100!=0 && year%4==0)||(year%400==0)){
			System.out.println(year+" is leap year");
		}
		else{
			System.out.println(year+" is not a leap year");
		}
	}
}