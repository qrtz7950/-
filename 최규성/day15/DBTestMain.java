package day15_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBTestMain {

	public static void main(String[] args) {
		
		try {
			//1�ܰ�: JDBC����̹� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
		
			//2�ܰ�: �����ͺ��̽� ����
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr" ,"hr");
			
			System.out.println("�����ͺ��̽� ��������: " + conn);
			
			
			
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
