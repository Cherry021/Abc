package com;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		int[] a = {4,3,2,1,4,8,7};
		/*
		 * int temp=0,j=0;
		 * 
		 * for(int i=1;i<a.length;i++) { temp=a[i]; j=i-1; while(j>=0 && a[j]>temp) {
		 * a[j+1]=a[j--]; }a[j+1]=temp; }
		 */
		
		sort(a,0,a.length-1);
		
		
		for(int i:a) {
			System.out.println(i);
		}
		
	}

	private static void sort(int[] a, int i, int j) {
		if(i>=0 && j>i) {
			int mid = (j+i)/2;
			sort(a,i,mid);
			sort(a,mid+1,j);
			merge(a,i,mid,j);
			
		}
	}

	private static void merge(int[] a, int i,int mid, int j) {
		int llen = mid-i+1;
		int rlen = j-mid;
		int[] l = new int[llen];
		int[] r = new int[rlen];
		for(int k=0;k<llen;k++) {
			l[k]=a[i+k];
		}
		for(int m=0;m<rlen;m++) {
			r[m] = a[mid+1+m];
		}
		int k=0,m=0,temp=i;
		while(k<llen && m<rlen) {
			if(l[k]<r[m]) {
				a[temp++]=l[k++];
			}else {
				a[temp++]=r[m++];
			}
		}
		while(k<llen) {
			a[temp++]=l[k++];
		}
		while(m<rlen) {
			a[temp++]=r[m++];
		}
	}

}
