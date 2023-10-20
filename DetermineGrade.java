/*
6. Write a program to determine the grade of a student based on their marks.

90 or above: A
80-89: B
70-79: C
60-69: D
Below 60: F
*/

import java.util.*;
class DetermineGrade{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a mark:");
		int mark=sc.nextInt();
		if(mark >= 90 && mark < 100){
			System.out.println("A");
		}
		else if(mark<90 && mark>=80){
			System.out.println("B");
		}
		else if(mark<80 && mark>=70){
			System.out.println("C");
		}
		else if(mark<70 && mark>=60){
			System.out.println("D");
		}
		else if(mark<0 || mark > 100){
			System.out.println("Enter a valid mark!!!!");
		}
		else{
			System.out.println("F");
		}
	}
}