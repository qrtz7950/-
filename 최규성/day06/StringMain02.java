package day06;

import java.util.Arrays;

public class StringMain02 {

	public static void main(String[] args) {

		String str = new String("ABCDEFGHIJ");
		
		int length = str.length();
		System.out.println("[" + str + "] ����: " +length);
		
		for(int i = 0; i< str.length();i++) {
			System.out.println((i+0)+ "��° ����: " + str.charAt(i));
		}
		
		
		char[] chars = new char[str.length()];
		System.out.println(Arrays.toString(chars));
		
		str.getChars(0, str.length(), chars, 0);
		//str.getChars(2, 7, chars, 0); //2��° �迭���� 7��° �迭���� 
		
		System.out.println(Arrays.toString(chars));
	}

}
