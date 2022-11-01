package com.ineuron.pattern;

import java.util.Scanner;

public class ThirdPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter the pattern count: ");
		Scanner scanner = new Scanner(System.in);
		int n=scanner.nextInt();
		if(n>3) {
		for (int i = 0; i < n; i++) {
			
			for (int j = 0; j < n; j++) {
				
				if(i==0||j==0 || i==n-1 || j==n-1 || i==1 && j!=(n/2)-1 ||
					i==2 && j!=(n/2)-2  && j!=(n/2)-1 && j!=(n/2) ||
					i==3 && j!=(n/2)-2  && j!=(n/2)-1 && j!=(n/2) & j!=(n/2)-3 && j!=(n/2)+1 ||
					i==4 && j!=(n/2)-2  && j!=(n/2)-1 && j!=(n/2) & j!=(n/2)-3 && j!=(n/2)+1 && j!=(n/2)-4 && j!=(n/2)+2 || 
					i==5 && j!=(n/2)-2  && j!=(n/2)-1 && j!=(n/2) & j!=(n/2)-3 && j!=(n/2)+1 && j!=(n/2)-4 && j!=(n/2)+2 && j!=(n/2)-5 && j!=(n/2)+3 ||
					i==6 && j!=(n/2)-2  && j!=(n/2)-1 && j!=(n/2) & j!=(n/2)-3 && j!=(n/2)+1 && j!=(n/2)-4 && j!=(n/2)+2 && j!=(n/2)-5 && j!=(n/2)+3 && j!=(n/2)-6 && j!=(n/2)+4) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		}else {
			System.out.println("Please enter value greater than 3");
		}
		scanner.close();
	}

}
