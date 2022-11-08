package com.ineuron.array.assignment2;

public class QuickSortAlgorithm {

	public void quickSort(int array[],int low, int high) {
		if(low<high) {
			int pidx = partition(array,low,high);
			quickSort(array, low, pidx-1);
			quickSort(array, pidx+1, high);
		}
		
	}
	public int partition(int[] array, int low, int high) {
		int pivot = array[high];
		int i = low-1;
		for (int j = low; j < high; j++) {
			if(array[j]<pivot) {
			i++;
			//swap
			int temp = array[i];
			array[i]= array[j];
			array[j]=temp;
		}
		}
		i++;
		int temp=array[i];
		array[i]=pivot;
		array[high]=temp;
		return i;
	}
	public static void main(String[] args) {
		QuickSortAlgorithm q = new QuickSortAlgorithm();
		 int [] array = {6,3,9,5,2,8};
		 int n = array.length;

		 q.quickSort(array, 0, n-1);
		 for (int k : array) {
			System.out.print(k+" ");
		}
	}

}
