package kr.co.mlec.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertMain03 {

	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstm = null;
		Scanner s = new Scanner(System.in);
		
		try {
			// 1�ܰ�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 2�ܰ�
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String user = "hr";
			String password = "hr";
			conn = DriverManager.getConnection(url, user, password);
			
			// 3�ܰ�
			System.out.print("����� ���̵� �Է� : ");
			String id = s.nextLine();
			System.out.print("����� �̸� �Է� : ");
			String name = s.nextLine();
			
			String sql = "insert into t_test(id, name) ";
				   sql += " values(?, ?) ";
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, id);
			pstm.setString(2, name);
			
			int cnt = pstm.executeUpdate();
			System.out.println("�� " + cnt + "�� ���� �����Ͽ����ϴ�");
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			// 5�ܰ�
			if(pstm!=null) {
				try {
					pstm.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
			
			if(conn!=null) {
				try {
					conn.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
		s.close();
	}

}
