package com.ineuron.pattern;

import java.util.Scanner;

public class NameINeuronPattern {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please eneter the size of pattern: ");
		int n = scanner.nextInt();
		if(n>6) {
		for (int i = 0; i < n; i++) {
			
			for (int j = 0; j < n; j++) {
				
				if(i==0 && j<=(3*n)/4|| i==n-1 && j<=(3*n)/4 || j==(n-1)/2) {
					System.out.print("*");
				}else {
				System.out.print(" ");
			}
		}
            for (int j = 0; j < n; j++) {
				
            	if(j == 0 || j==n-1 || i==j  ) {
					System.out.print("*");
				}else {
				System.out.print(" ");
			}
		}
           for (int j = 0; j < n; j++) {
				
            	if(i==0 && j>n/4 ||i== n/2&& j>n/4||i==n-1 && j>n/4 || j==n/4) {
					System.out.print("*");
				}else {
				System.out.print(" ");
			}
		}
           for (int j = 0; j < n; j++) {
				
           	if(j==n/4 && i<=(3*n)/4 || j==(3*n)/4 && i<=(3*n)/4 || i==n-1 && j>n/4 && j<(3*n)/4) {
					System.out.print("*");
				}else {
				System.out.print(" ");
			}
		}
           for (int j = 0; j < n; j++) {
				
              	if(j == n/4 || i==0 &&   j>=n/4 || j==n-1 && i<=(n/2)-1 || i==(n/2)-1  && j>=n/4 ||
              			i==j && i>(n/2)-1 ) {
   					System.out.print("*");
   				}else {
   				System.out.print(" ");
   			}
   		}
           for (int j = 0; j < n; j++) {
				
              	if(j==n/4 && i>=n/8 && i<=(9*n)/10 || j==(3*n)/4 && i>=n/8 && i<=(9*n)/10
              			||i==0 && j>n/4 && j<(3*n)/4 || i==n-1 && j>n/4 && j<(3*n)/4) {
   					System.out.print("*");
   				}else {
   				System.out.print(" ");
   			}
   		}
           for (int j = 0; j < n; j++) {
				
           	if(j == 0 || j==n-1 || i==j  ) {
					System.out.print("*");
				}else {
				System.out.print(" ");
			}
		}
			System.out.println();
	}
		}else {
		System.out.println("Please enter value greater than 6 for better visibility");
	}
      scanner.close();
  }
}
