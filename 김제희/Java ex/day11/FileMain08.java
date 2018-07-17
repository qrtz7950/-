package kr.co.mlec.day11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import kr.co.mlec.util.FileClose;

public class FileMain08 {

	public static void write() {
		
		UserInfo user = new UserInfo("ȫ�浿", 20, "����� ���ʱ�");
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream("io/object.txt");
			oos = new ObjectOutputStream(fos);
			
			//��ü�� ����Ʈ ��Ʈ���� ����ȭ�����ִ� �������̽��� ��ӹ޾ƾ��Ѵ�
			//��ü�� implements Serializable�� ��ӹ޾ƾ���
			oos.writeObject(user);
			
			System.out.println("object.txt�� ����Ϸ�...");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(oos);
			FileClose.close(fos);
		}
	}
	
		public static void read() {
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream("io/object.txt");
			ois = new ObjectInputStream(fis);
			
			UserInfo user = (UserInfo)ois.readObject();
			System.out.println("���� �б� �Ϸ�...");
			System.out.println(user);
			//��ü Ŭ���� ��������� transient��� Ű���带  ���� ����ȭ���� ���ܵȴ�
			//��й�ȣ���� �ΰ��� ��������� ���ȴ�
			//ex)private transient int age;
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(ois);
			FileClose.close(fis);
		}
	}
	
	
	public static void main(String[] args) {
		
		write();
		read();
	}
}
