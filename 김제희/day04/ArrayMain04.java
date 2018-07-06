package kr.co.mlec.day04;

import java.util.Arrays;

/*
 * �ڹٿ��� �����ϴ� �迭���� API
 */
public class ArrayMain04 {

	public static void main(String[] args) {

		int [] n = {10,20,30,40,50};
		int [] n2;		
		
		//n2�� 5���� �������� ����Ű�� �ּҰ��� ������ �ϰ�ʹ�?
		n2 = n;
		//shallow copy(���� ����) : ������ �ϳ��� ������������ �����ϴ°�
				
		//�ּҰ��� �����ϴ°� �ƴ϶� num�� ������ �������� �����ϰ�ʹ�?
		//deep copy(���� ����): ������ ���뵵 �����ϴ� ��
		n2 = new int[n.length];
		
		for(int i = 0; i<n.length; i++) {
			n2[i] = n[n.length-i-1];
		}
		
		System.out.println(Arrays.toString(n));
		System.out.println(Arrays.toString(n2));
		System.out.println("\n");
		
		// ���� ������ �������� �޼ҵ嵵 �ϳ� �ִ�
		//System.arraycopy(src, srcPos, dest, destPos, length);
		//System.arraycopy(�����迭��, ������ġ, ������ �迭��, ������ġ, ������ ����);
		
		System.arraycopy(n2,0,n,0,n2.length);
		System.out.println(Arrays.toString(n));
		System.out.println(Arrays.toString(n2));
		
		System.out.println("\n");
		
		//�Ű����� Ȱ��
		
		System.arraycopy(n,1,n2,3,2);
		System.out.println(Arrays.toString(n));
		System.out.println(Arrays.toString(n2));
		
		
		
	}

}
