package kr.co.mlec.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBTestMain {

	public static void main(String[] args) {
		
		try {
			// 1�ܰ� : JDBC ����̹� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 2�ܰ�: Database ����
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "hr", "hr");
			
			System.out.println("Datebase Access info : " + conn);
			
			// 3�ܰ� : ���� ��ü ��� �� ����
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
	}

}
