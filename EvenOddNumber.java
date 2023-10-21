//5. Write a program to check if a given number is even or odd.
import java.util.*;
class EvenOddNumber{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int number=sc.nextInt();
		if(number%2==0){
			System.out.println(number+" is even number");
		}
		else{
			System.out.println(number+" is odd number");
		}
		
	}
}