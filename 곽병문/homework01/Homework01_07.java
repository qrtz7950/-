package kr.co.mlec.homework01;

import java.util.Scanner;

public class Homework01_07 {

	public static void main(String[] args) {
		
		//System.out.println('z'+0); //a=97~122 A=65~90
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		char c = str.charAt(0);
		
		int a = (int)c+0;
		
		if((a >= 97) && (a <= 122)) {
			c = (char)(a-32);
		}
		if((a >= 65) && (a <= 90)) {
			c = (char)(a+32);
		}
		
		System.out.println(c);
		
		s.close();
	}

}
