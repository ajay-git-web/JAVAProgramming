//8. Write a program to check if a given number is divisible by both 5 and 11.
import java.util.*;
class Division{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int number=sc.nextInt();
		if(number % 5==0 && number%11==0){
			System.out.println(number+" is divisible by both 5 and 11");
		}
		else{
			System.out.println(number +" Number is not divisble by both 5 and 11");
		}
	}
}