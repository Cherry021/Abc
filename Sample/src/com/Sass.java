package com;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Sass {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		String o = (String) in.next();
		
		if(Pattern.matches("[\\w]+$", o)) {
			System.out.println("Success");
		}else {
			System.out.println("fail");
		}
	}

}
