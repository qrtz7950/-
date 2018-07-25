package kr.co.mlec.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 	insert into t_test(id, name) values('hong', '�浿�浿')
 */

public class InsertMain01 {

	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stm = null;
		
		try {
			// 1�ܰ� : JDBC ����̹� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("jdbc����̹� �ε� ����");
			
			// 2�ܰ� : DB���� �� ���ᰴü ���
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String user = "hr";
			String password = "hr";
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("conn : " + conn);
			
			// 3�ܰ� : SQL����
			stm = conn.createStatement();
			
			String sql = "insert into t_test(id, name) values('hong', '�浿�浿')";
			
			// 4�ܰ� : ����� ����
			int cnt = stm.executeUpdate(sql);
			System.out.println(cnt + "���� ���ԵǾ����ϴ�");
					
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
			// 5�ܰ� : DB���� ����
			if(stm != null) {
				try {
					stm.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
			
			if(conn != null) {
				try {
					conn.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

}
