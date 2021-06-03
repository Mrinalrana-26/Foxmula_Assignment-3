package com.foxmula.assignment3;

import java.util.*;;
public class SortbyFrequency {
	static void frequency(int arr[], int n) {
		
		int i=0;
		 int Array[]=new int[n];
		 Arrays.fill(Array, 0);
		
		 while(i<n) {
			 Array[arr[i]-1]++;
			 i++;
		 }
		 System.out.println("Elements" + "|"+ "frequency");
		    for(i = 0; i < n; i++)
		    {
		        System.out.println(  (i+1) + " | " + Array[i]);
		    }
			
		    
		  }	
	
		
	
	public static void main(String args[]) {
		//user-input
		/*Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the size of array");
	      int b = sc.nextInt();
	      int arr[] = new int[b];
	      System.out.println("Enter the elements in the  array");
	      for(int i=0;i<b;i++) {
	    	  arr[i] = sc.nextInt();
	      }*/
		 int arr[] = { 1, 3, 5, 7, 9,
                 1, 3, 5, 7, 9, 1 };
	      int n =arr.length;
		frequency(arr,n);
		System.out.println(" array before sorting:");
		for(int i=0;i<n;){
	    System.out.print(arr[i++]);
	}
	Arrays.sort(arr);
	System.out.println(" \narray after sorting:");
		for( int i=0;i<n;){
	    System.out.print(arr[i++]);
	}
	}

}