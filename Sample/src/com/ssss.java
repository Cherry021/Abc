package com;

public class ssss {

	public static void main(String[] args) {
		int a[]= {6,5,4,3,2,1};
		int temp=0,j=0;
		for(int i=1;i<a.length;i++) {
			j=i-1;
			temp=a[i];
			while(j>=0 && a[j]>temp ) {
				a[j+1]=a[j];j--;
			}a[j+1]=temp;
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
