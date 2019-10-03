package com;

public class Sample {
	public static void merge(int[] a,int min,int mid,int max) {

		if(min<max) {
			 int llen=mid-min;
			 int rlen=max-mid;
			 int[] left=new int[llen];
			 int[] right=new int[rlen];
			 for(int i=0;i<llen;i++) {
				 left[i]=a[min+i];
			 }
			 for(int i=0;i<rlen;i++) {
				 right[i]=a[mid+i];
			 }
			 int i=0,j=0,k=min;
			 while(i<llen && j<rlen) {
				 if(left[i]<right[j]) {
					 a[k]=left[i];i++;
				 }else {
					 a[k]=right[j];j++;
				 }k++;
			 }
			 while(i<llen) {
					 a[k]=left[i];i++;k++;
			 }
			 while(j<rlen) {
				 a[k]=right[j];j++;k++;
		 }
		}
	}

	public static void main(String[] args) {
		int[] a= {6,5,4,3,2,1};
		int min=0;
		int max = a.length;
		int mid = (min+max)/2;
		sort(a,min,mid,max);
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

	private static void sort(int[] a, int min, int mid, int max) {
		if(min<max && min>=0) {
			 sort(a,min,(min+mid)/2,mid);
			 merge(a,min,(min+mid)/2,mid);
			 sort(a,mid+1,(mid+max)/2,max);
merge(a,mid,(mid+max)/2,max);
		}
	}

}
