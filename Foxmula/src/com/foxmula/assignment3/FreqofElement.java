package com.foxmula.assignment3;

import java.util.Arrays;
public class FreqofElement {
	static void frequency(int arr[], int n) {
		
		
		Arrays.sort(arr);
		for(int i=0;i<n;) {
			int flag=1;
			while((i+1)<n && arr[i]==arr[i+1]) {
				flag++;
				i++;
			}
			if (flag>1) {
				System.out.println("Element which is repeated in the array is:" + "|"+ "Frequency: "  );
				System.out.println("\t\t\t\t\t " + arr[i]+"| "+flag );
			}
			
			i++;
		}
			
	}
	public static void main(String args[]) {
		int arr[]= {0,1,1,2,2,2,3,4,5,6,6,6,6,6,7,8,8,8,8,9,9,9};
		int n=arr.length;
		
		frequency(arr,n);
	}

}
