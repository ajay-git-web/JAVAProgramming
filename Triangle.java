//7. Write a program to determine if a triangle is equilateral, isosceles, or scalene based on its side lengths.
import java.util.*;
class Triangle{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a side of traingle:");
		int side1=sc.nextInt();
		int side2=sc.nextInt();
		int side3=sc.nextInt();
		if((side1==side2 && side2==side3) && ((side1+side2+side3) ==180)){
			System.out.println("side1:"+side1+"\tside2:"+side2+"\t side3:"+side3+"--->Equilateral Triangle");
		}
		else if((side1==side2 || side2==side3 || side1==side3) && ((side1+side2+side3)==180)){
			System.out.println("side1:"+side1+"\tside2:"+side2+"\t side3:"+side3+"--->Isosceles Triangle");
		}
		else if((side1!=side2 || side2!=side3 || side1!=side3) && ((side1+side2+side3) ==180)){
			System.out.println("side1:"+side1+"\tside2:"+side2+"\t side3:"+side3+"--->Scalene Triangle");
		}
		else{
			System.out.println("side1:"+side1+"\tside2:"+side2+"\t side3:"+side3+"--->Enter correct angle as per traiangle spcification");
		}
	}
}