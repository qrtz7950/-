package kr.co.mlec.day04;

public class ArrayMain01 {

	public static void main(String[] args) {
		//������ �����ϴ� �迭 iArr�� ����
		//������ �Ǽ����� �ƴ� �ּҰ��� ���� ���� �̰��� ������������Ѵ�.
		int[] iArr;
		//������ �ټ��� �����ϴ� �迭 ����
		iArr = new int[5];
		
		//��������[0]~��������[4]
		
		for(int i=0; i<5; i++) {
			iArr[i]= i;
		}
		for(int i=0; i<5; i++) {
			System.out.printf("iArr[%d]: %d\n", i, iArr[i]);
		}
		
		//////////////////////////////////
		
		
		//��������[0]~��������[size-1]
		int size = 5;
		iArr = new int[size];
		
		for(int i=0; i<size; i++) {
			iArr[i]= (i+1)*10;
		}
		for(int i=0; i<size; i++) {
			System.out.printf("iArr[%d]: %d\n", i, iArr[i]);
		}
		
		//�迭�� ���Ұ� ����� ���� �˼��ְԾ������� 
		//iArr.length
		//���� �ڵ忡 size ��� iArr.length�� �ᵵ ����
		System.out.println("iArr�迭 ������ ����: " + iArr.length + "��");
		
		
	}

}
