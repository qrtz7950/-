package kr.co.mlec.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectMain01 {

	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pst = null;
		
		try {
			
			// 1�ܰ�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 2�ܰ�
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String user = "hr";
			String password = "hr";
			conn = DriverManager.getConnection(url, user, password);
			
			// 3�ܰ�
			String sql = "select id, name as �̸� from t_test ";	// alias
			pst = conn.prepareStatement(sql);
			
			// 4�ܰ�
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				String id = rs.getString(1);			// �÷��̳� �÷�������ȣ�� �Ű�������
				String name = rs.getString("�̸�");		// alias �� ���ؼ�
				System.out.println("id : " + id + ", name : " + name);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
			// 5�ܰ�
			if(pst != null) {
				try {
					pst.close();
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
