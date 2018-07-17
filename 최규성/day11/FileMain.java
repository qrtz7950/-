package kr.co.mlec.day11;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileMain {

	public static void main(String[] args) {
	
		File dirObj = new File("iotest");
		
		System.out.println(dirObj.exists() ? "��ȿ�� ���丮�Դϴ�" : "��ȿ���� ���� ���丮�Դϴ�");
		System.out.println(dirObj.isDirectory() ? "���丮�Դϴ�" : "���丮�� �ƴմϴ�");
		
		String[] list = dirObj.list();
		System.out.println("------------------------------------------");
		System.out.println("\t\t" + dirObj.getName() + " ���丮 ����");
		System.out.println("------------------------------------------");
		for(String name : list) {
			System.out.println(name);
		}
		System.out.println("------------------------------------------");
		
		File newDirObj = new File("iotest/��/����");
//		System.out.println(newDirObj.exists() ? "�����մϴ�" : "�������� �ʽ��ϴ�");
		boolean bool = false;
		if(!newDirObj.exists()) {
			bool = newDirObj.mkdir();
			System.out.println(bool ? "���� ����" : "���� ����");
		}
		
		newDirObj = new File("iotest/������/����");
		if(!newDirObj.exists()) {
			bool = newDirObj.mkdirs();
			System.out.println(bool ? "���� ����" : "���� ����");
		}
		
		bool = newDirObj.delete();
		System.out.println(bool ? "��������" : "��������");
		
/*		
//		File fileObj = new File("D:/Lecture\\java-workspace\\java\\iotest\\a.txt");
		File fileObj = new File("iotest/a.txt");
		
		String fileName = fileObj.getName();
		String parent = fileObj.getParent();
		String path = fileObj.getPath();
		
		System.out.println("���ϸ� : " + fileName);
		System.out.println("�θ��̸� : " + parent);
		System.out.println("��� : " + path);
		
		boolean bool = fileObj.isFile();
		System.out.println(bool ? "�����Դϴ�" : "������ �ƴմϴ�");
		
		bool = fileObj.isDirectory();
		System.out.println(bool ? "���丮�Դϴ�" : "���丮�� �ƴմϴ�");
		
		bool = fileObj.exists();
		System.out.println(bool ? "�����մϴ�" : "�������� �ʽ��ϴ�");
		
		long length = fileObj.length();
		System.out.println("����ũ�� : " + length + "byte(s)");
		
		long time = fileObj.lastModified();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println("������ ���� ��¥ : " + sdf.format(new Date(time)));
		
		bool = fileObj.canRead();
		System.out.println(bool ? "�б� ����" : "�б� �Ұ���");
		
		bool = fileObj.canWrite();
		System.out.println(bool ? "���� ����" : "���� �Ұ���");
*/		
	}
}







