package kr.co.mlec.homework.homework01;

import java.util.Scanner;

public class Homework01_02 {

	public static void main(String[] args) {
		
		System.out.print("����? : ");
		Scanner s = new Scanner(System.in);
		
		int time = s.nextInt();
		int hour = time/(3600);
		time %= 3600;
		int min = time / 60;
		int sec = time % 60;
		
		System.out.printf("%d�ð� %d�� %d��", hour, min, sec);
		
		s.close();
	}

}
