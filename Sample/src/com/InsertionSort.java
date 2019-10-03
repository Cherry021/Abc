package com;

public class InsertionSort {

	public static void main(String[] args) {
		int[] a = {34,2,6,0,-1,23,4}; 
		int temp,j;
		for(int i=1;i<a.length;i++) {
			temp = a[i];
			j=i;
			while(a[j-1]>temp) {
				a[j]=a[j-1];
					j--;
					if(j==0) {
						break;
					}
			}
			a[j]=temp;
		}
		for(int x:a) {
			System.out.print(x+",");
		}
	}

}
