package kr.co.mlec.day09;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOError;
import java.io.IOException;

public class ExceptionMain04 {

	public static void main(String[] args) {
		
		//FileReader fr = new FileReader("a.txt");
		//���� �ƴ� �ϵ��ũ���� ������ �о���Ƿ� ���ܰ� �߻��� Ȯ���� �ſ� ����
		//�̷� Ȯ���� ���� ������ ���ؼ��� �ڹٿ��� ����ó���� �ؾ��Ѵٰ� ������ �������� ����ó��
		
		try {
			FileReader fr = new FileReader("a.txt");
		} catch(FileNotFoundException fnfe) {
//			fnfe.printStackTrace();
//			������ ���� ����ϴ°��� �ƴ϶� log���Ϸ� �����ϰ�ʹ�
//			try catch�� �ȿ� try catch�� ��ø�� �����ϴ�
			try {
				FileWriter fw = new FileWriter("error.log");
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}
		
	}
}
