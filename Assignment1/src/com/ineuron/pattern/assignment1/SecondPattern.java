package com.ineuron.pattern.assignment1;

import java.util.Scanner;

public class SecondPattern {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter 5 in order to print the pattern");
		int n = scanner.nextInt();
		if(n==5) {
		for (int i = 1; i < n; i++) {
			
			for (int j = 1; j <n; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}

		}else {
			System.out.println("Please enter 5");
		}
		scanner.close();
	}
}
