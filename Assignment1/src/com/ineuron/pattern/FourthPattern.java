package com.ineuron.pattern;

import java.util.Scanner;

public class FourthPattern {

	public static void main(String[] args) {
		System.out.println("Please enter the pattern count: ");
		Scanner scanner = new Scanner(System.in);
		int n=scanner.nextInt();
		if((n%2==0) && (n<15) && (n>5)) {
		for (int i = 0; i < n; i++) {
			
			for (int j = 0; j < n; j++) {
				if(i==n-1 || i==n-2 || i==n-3 && j!=n/2 && j!=(n/2)-1 
				   || i==n-4 && j!=n/2 && j!=(n/2)-1 && j!=(n/2)+1 && j!=(n/2)-2
				   || i==n-5 && j!=n/2 && j!=(n/2)-1 && j!=(n/2)+1 && j!=(n/2)-2 && j!=(n/2)+2 && j!=(n/2)-3
				   || i==n-6 && j!=n/2 && j!=(n/2)-1 && j!=(n/2)+1 && j!=(n/2)-2 && j!=(n/2)+2 && j!=(n/2)-3 && j!=(n/2)+2 && j!=(n/2)-3 && j!=(n/2)+3 && j!=(n/2)-4
				   || i==n-7 && j!=n/2 && j!=(n/2)-1 && j!=(n/2)+1 && j!=(n/2)-2 && j!=(n/2)+2 && j!=(n/2)-3 && j!=(n/2)+2 && j!=(n/2)-3 && j!=(n/2)+3 && j!=(n/2)-4 && j!=(n/2)+4 && j!=(n/2)-5
				   || i==n-8 && j!=n/2 && j!=(n/2)-1 && j!=(n/2)+1 && j!=(n/2)-2 && j!=(n/2)+2 && j!=(n/2)-3 && j!=(n/2)+2 && j!=(n/2)-3 && j!=(n/2)+3 && j!=(n/2)-4 && j!=(n/2)+4 && j!=(n/2)-5 && j!=(n/2)+5 && j!=(n/2)-6) {
					
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		    }else {
			      System.out.println("Please enter even value which is less than 15 and greater than 5 ");
		}
		scanner.close();
	}
}
