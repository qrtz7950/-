package day06Hw;

//import java.util.Scanner;

public class StringUtil {

	/*1. �ϳ��� ���ڸ� �Է¹޾� �ش� ���ڰ� �빮���̸� true �� ��ȯ�ϴ� isUpperChar( char c )
	�޼ҵ带 �ۼ��Ͻÿ�*/
	boolean isUpperChar(char c) {
		if(c >= 'A' && c<= 'Z') {
			return true;
		} else {
			return false;
		}
	}
/*	2. �ϳ��� ���ڸ� �Է¹޾� �ش� ���ڰ� �ҹ����̸� true�� ��ȯ�ϴ� isLowerChar(char c) ��
	�ҵ带 �ۼ��Ͻÿ�*/	
	boolean isLowerChar(char c) {
		if(c >= 'a' && c<= 'z') {
			return true;
		} else {
		return false;
		}
	}
//	3. �ΰ��� ���ڸ� �Է¹޾� ū���� ��ȯ�ϴ� max( int i, int j) �޼ҵ带 �ۼ��Ͻÿ�
	int max(int i ,int j) {
		if(i > j) {
			return i;
		} else {
			return j;
		}
	}
// 	4. 3�� �ݴ�
	int min(int i ,int j) {
		if(i < j) {
			return i;
		} else {
			return j;
		}
	}
//5. ���ڿ��� �Է¹޾� �Ųٷ� �����ϴ� reverseString( String str ) �޼ҵ带 �ۼ��Ͻÿ�
	String reverseString(String str) {
		char[] chars = new char[str.length()];
		
		for(int i =str.length()-1 , j = 0; i>=0; i--) {
			chars[j++] = str.charAt(i);
		}
		String s = new String(chars);
		return s;
	}
//6. ���ڿ��� �Է¹޾� �빮�ڷ� �����ϴ� toUpperString( String str ) �޼ҵ带 �ۼ��Ͻÿ�
	String toUpperString(String str) {
		String changeStr = "";
		 for(int i = 0; i<str.length(); i++) {
			 char c = str.charAt(i);
			if(isLowerChar(str.charAt(i))) {
				c =(char)(c -('a' -'A'));
			} 
			changeStr = changeStr + c;
		 }
		 return changeStr;
	}
	
	
	
//7. ���ڿ��� �Է¹޾� �ҹ��ڷ� �����ϴ� toLowerString( String str ) �޼ҵ带 �ۼ��Ͻÿ�
	
	String toLowerString(String str) {
		String changeStr = "";
		 for(int i = 0; i<str.length(); i++) {
			 char c = str.charAt(i);
			if(isUpperChar(str.charAt(i))) {
				c =(char)(c +('a' -'A'));
			} 
			changeStr = changeStr + c;
		 }
		 return changeStr;
	}
}
