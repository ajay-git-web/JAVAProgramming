package com.logical;

import java.util.Scanner;
/*
 5
1
01
101
0101
10101
 
 
 
 */
public class Patternnumber11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number of rows u want:");
		int number=sc.nextInt();
		int cnt=1;
		for(int i=1;i<=number;i++) {
			if(i%2==0)
				cnt=0;
			else 
				cnt=1;
			for(int j=1;j<=i;j++) {
				System.out.print(cnt);
				cnt=1-cnt;
				
			}System.out.println();
		}
	}

}
