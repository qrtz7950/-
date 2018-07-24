package kr.co.mlec.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertMain03 {

	public static void main(String[] args) {
		
		Connection 	conn = null;
		PreparedStatement pstmt = null;
		
		try {
			//1�ܰ� : ����̹� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2�ܰ� 
			String url 		= "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String user 	= "hr";
			String password = "hr";
			conn = DriverManager.getConnection(url, user, password);
			
			//3�ܰ�
			Scanner sc = new Scanner(System.in);
			System.out.print("id: ");
			String id = sc.nextLine();
			System.out.print("�̸�: ");
			String name = sc.nextLine();

			String sql = "insert into t_test(id, name) ";
			       sql += "values(?, ?) ";

	        pstmt = conn.prepareStatement(sql);
	        pstmt.setString(1, id);
	        pstmt.setString(2, name);
	        
	        int cnt = pstmt.executeUpdate();
			System.out.println(cnt + "�� �� ����");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			// 5�ܰ� : ��������
			try {
				if (pstmt != null) {
					pstmt.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

			try {
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
		
	}

}
