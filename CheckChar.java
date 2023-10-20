//3. Write a program to check if a given character is a vowel or a consonant.
import java.util.*;
class CheckChar{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a charcter:");
		char ch=sc.nextLine().charAt(0);
		if(ch=='a'|| ch=='A'||ch=='e'|| ch=='E'||ch=='i'|| ch=='I'||ch=='o'|| ch=='O'||ch=='u'|| ch=='U'){
			System.out.println(ch+" is vowel");
		}
		else{
			System.out.println(ch+" is consonant");
		}
	}
}
