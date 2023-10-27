package com.gfg;

import java.util.Scanner;

public class RhombusPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number of rows u want:");
		int number=sc.nextInt();
		for(int i=1;i<=number;i++) {
			for(int k=1;k<i;k++)
				System.out.print(" ");
			for(int j=1;j<=number;j++) {
				System.out.print(" *");
			}System.out.println();
		}

	}

}

/*

Enter a number of rows u want:
5
 * * * * *
  * * * * *
   * * * * *
    * * * * *
     * * * * *

*/