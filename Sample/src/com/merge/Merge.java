package com.merge;

public class Merge {
	static void merge(int[] a,int l,int m,int r) {
		System.out.println(l);
		System.out.println(m);
		System.out.println(r);
		
		int len1 = m-l;
		int len2 = r-m;
		int[] left = new int[len1];
		int[] right = new int[len2];
		for(int i=0;i<len1;i++) {
			left[i]=a[l+i];
		}
		for(int i=0;i<len2;i++) {
			right[i]=a[m+i];
		}
		for(int i:left) {
			System.out.print(i+",");
		}System.out.println();
		for(int i:right) {
			System.out.print(i+",");
		}System.out.println();
		int i=0;
		int j=0;
		int k=l;
		while(i<len1 && j<len2) {
			if(left[i]<right[j]) {
				a[k]=left[i];
				i++;
			}else {
				a[k]=right[j];
				j++;
			}k++;
		}
		while(i<len1) {
			a[k]=left[i];
			i++;
			k++;
		}
		while(j<len2) {
			a[k]=right[j];
			j++;
			k++;
		}
		
	}
	static void sort(int[] a,int l,int r) {
		if(l<r) {
			int m=(l+r)/2;
			sort(a,l,m);
			merge(a,l,m,r);
			sort(a,m+1,r);
			merge(a,l,m+1,r);
		}
	}
	public static void main(String[] args) {
		int[] a= {21,1,32,9,89,-2,-32};
		int len = a.length;
		sort(a,0,len);
		//int m=len/2;
		//merge(a,0,m,len);
		for(int i:a) {
			System.out.print(i+",");
		}
	}

}
