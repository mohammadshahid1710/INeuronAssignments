package com.ineuron.array.assignment2;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {2,4,3,1,5};
		for (int i = 0; i < a.length; i++) {
			
			for (int j = 1; j < a.length-1; j++) {
				
				if(a[j]<a[j-1]) {
					int temp;
					temp=a[j];
					a[j]=a[j-1];
					a[j-1]=temp;
					
				}
				
			}
		}

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}

}
