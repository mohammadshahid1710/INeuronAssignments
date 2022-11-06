package com.ineuron.pattern.assignment1;

import java.util.Scanner;

public class FifthPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter the pattern count: ");
		Scanner scanner = new Scanner(System.in);
		int n=scanner.nextInt();
		if(n>13) {
		for (int i = 0; i < n; i++) {
			
			for (int j = 0; j < n; j++) {
				
				if(i==0 || i==1 && j<6 ||i==2 && j<5 ||i==3 && j<4 || i==4 && j<3 || i==5 && j<2
						|| i==5 && j<2 || i==6 && j<1 || i==7 && j<2 || i==8 && j<3 || i==9 && j<4
						|| i==10 && j<5 || i==11 && j<6 || i==12 && j<7 || i==13) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		}else {
			System.out.println("Please enter value greater than 13");
		}
       scanner.close();
	}

}
