package day04;

import java.util.Arrays;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class ArrayMain04 {

	public static void main(String[] args) {

		int[] nums = { 10, 20, 30, 40, 50 };
		int[] nums2 = new int[nums.length]; //nums�� �����Ϸ���
		
		/*for(int i = 0; i <nums.length; i++) {
			nums2[i] = nums[i];
		}
		
		nums[0] = 100;	//nums�� ���� �ٲ㵵 nums2�� 0�������� ������ ����(���� ����)
		*/
		
		System.arraycopy(nums, 0, nums2, 2, 2);//(�����迭, ������ġ, �����ҹ迭��, ������ġ, �����Ұ���)
											//nums�� 0�������� nums2�� 2�������� � �������� ��
											//��°�� [0, 0, 10, 20, 0]
		
		System.out.println(Arrays.toString(nums));
		System.out.println(Arrays.toString(nums2));
	}
}
