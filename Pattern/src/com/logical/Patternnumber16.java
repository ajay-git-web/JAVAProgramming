import java.util.Scanner;

public class Patternnumber16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number of rows u want:");
		int number=sc.nextInt();
		char ch='A';
		for(int i=1;i<=number;i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print(ch+" ");
			}System.out.println();
			ch=(char) (ch+1);
		}
	}

}


/*
output-
5
A 
B B 
C C C 
D D D D 
E E E E E 

*/