package kr.co.mlec.homework.homework03;

/*
 * ������ ���
 * *** 2�� ***
 * 2 * 1 = 2
 * ...
 * *** 9�� ***
 * 9 * 1 = 9
 * ...
 */

public class Homework03_05 {

	public static void main(String[] args) {
		for(int i=2; i<=9; i++) {
			System.out.println("*** " + i + "�� ***");
			for(int j=1; j<=9; j++) {
				System.out.println(i + " * " + j + " = " + i*j);
			}
			System.out.println();
		}

	}

}
