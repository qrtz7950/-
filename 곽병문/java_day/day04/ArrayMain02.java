package kr.co.mlec.day04;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMain02 {
	
	public static void main(String[] arg) {
		
		Scanner s = new Scanner(System.in);
		
		String[] strArr = {"û��","�ڹ�","����"};
		for(int i=0; i<strArr.length; i++) {
			System.out.println(strArr[i]);
		}
		
		/*String[] strArr2 = new String[3];
		
		for(int i=0; i<strArr2.length; i++) {
			System.out.print("strArr2["+i+"]�� �Է��� �� : ");
			strArr2[i] = s.nextLine();
		}
		
		for(int i=0; i<strArr2.length; i++) {
			System.out.println("strArr2[" + i + "] : " + strArr2[i]);
		}*/
		
		System.out.println("JDK1.5�� for���� �̿��� ���");
		for(String str : strArr) {
			System.out.println(str);
		}
		
		System.out.println("< Arrays.toString() �̿��� ��� >");
		System.out.println(Arrays.toString(strArr));
		
		s.close();
	}

}
