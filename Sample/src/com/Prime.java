package com;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("How many Prime numbers u want");
		int num=in.nextInt();
		int count=0,nums=3;
		boolean flag=true;
		for(int i=2;count<num;i++) {
			if(i==2) {
				System.out.println(2);
				count++;flag=false;
			}
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					flag=false;break;
				}
			}if(flag) {
				System.out.println(i);
				count++;
			}flag=true;
		}
	}

}
