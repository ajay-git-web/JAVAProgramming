//4. Write a program to find the largest of three numbers entered by the user.
import java.util.*;
class LargeNumber{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a 3 number :");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		if(num1>num2){
			if(num1>num3){
				System.out.println(num1+" is greater among three numbers" );
			}
		}
		else if(num2>num3){
				System.out.println(num2+" is greater among three numbers" );
		}else{
			System.out.println(num3+" is greater among three numbers" );
		}
	}
}