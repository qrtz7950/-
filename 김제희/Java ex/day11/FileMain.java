package kr.co.mlec.day11;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileMain {

	public static void main(String[] args) {

		File dirObj = new File("io");
		
		System.out.println(dirObj.isDirectory() ? "���丮�Դϴ�" : "���丮�� �ƴմϴ�");
		
		String[] list = dirObj.list();
		System.out.println("------------------------------------------");
		System.out.println("\t\t" + dirObj.getName() + " ���丮 ����");
		System.out.println("------------------------------------------");
		for(String name : list) {
			System.out.println(name);
		}
		System.out.println("------------------------------------------");
		
		File newDirObj = new File("io/�Թ���/�Թ������");
		boolean bool = false;
		System.out.println(dirObj.exists() ? "��ȿ�� ���丮�Դϴ�" : "��ȿ���� ���� ���丮�Դϴ�");
		if(!newDirObj.exists()) {
			bool = newDirObj.mkdir();
			System.out.println(bool ? "����ź��" : "���ֹ�������������");
		}
		
		newDirObj = new File("io/������/�Թ������");
		bool = false;
		if(!newDirObj.exists()) {
//			bool = newDirObj.mkdir(); //�ش� �޼ҵ�� ���丮 �����ܿ��� ������ֱ⶧���� �Թ������ ������ ���丮�� �����ؾ��Ѵ�
			bool = newDirObj.mkdirs(); //mkdirs�޼ҵ�� �ѹ濡 ������ִ�
			System.out.println(bool ? "����ź��" : "���ֹ�������������");
		}
		
		bool = newDirObj.delete();
		System.out.println(bool ? "��������" : "��������");
		//�� �޼ҵ嵵 �����ܸ� �������� ���丮�ִ°� ��ä�� ����
		//�����ؼ� ����ִ°�� �������� �Ǵ� 
		
		
/*		
//		File fileObj = new File("D:\\Lecture\\java\\io\\a.txt");
//		File fileObj = new File("D:/Lecture/java/io/a.txt"); 
//		�������� �ΰ� = ������ �Ѱ�
		File fileObj = new File("io/a.txt"); 
		//����ε� ����
		
		String fileName = fileObj.getName();
		String parent = fileObj.getParent();
		String path = fileObj.getPath();
		
		System.out.println(fileName);
		System.out.println(parent);
		System.out.println(path);
		
		boolean bool = fileObj.isFile();
		System.out.println(bool ? "�����Դϴ�" : "������ �ƴմϴ�");
		
		bool = fileObj.isDirectory();
		System.out.println(bool ? "���丮�Դϴ�" : "���丮�� �ƴմϴ�");
		
		bool = fileObj.exists();
		System.out.println(bool ? "����" : "����X");
		//���翩�θ� ���� �Ǻ��� �� �������� ���丮���� �����ϸ�ȴ�
		
		long length = fileObj.length();
		System.out.println("���� ũ��" + length + "byte(s)");
		
		long time = fileObj.lastModified();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
		System.out.println("���������� �����Ƚð�: " + sdf.format(new Date(time)));
		
		bool = fileObj.canRead();
		System.out.println(bool ? "�б� ����" : "�б� �Ұ���");
		
		bool = fileObj.canWrite();
		System.out.println(bool ? "���� ����" : "���� �Ұ���");
		
		//���� ��ü�� ������ ������ ���� ����Ʈ��Ʈ�� ���ڽ�Ʈ���� �̿����������� ������ ���� ����
*/		
	}

}
