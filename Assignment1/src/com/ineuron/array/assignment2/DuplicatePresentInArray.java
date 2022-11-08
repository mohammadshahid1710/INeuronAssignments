package com.ineuron.array.assignment2;

public class DuplicatePresentInArray {

	public static void main(String[] args) {
		
		int [] array = {1,1,3,4,3,7,6,6,4};
		System.out.println("Duplicate elements in given array");
		//searches for duplicate element
		for (int i = 0; i < array.length; i++) {
			for (int j =i+ 1; j < array.length; j++) {
				if(array[i]==array[j])
					System.out.println(array[j]);
			}
			
		}

	}

}
