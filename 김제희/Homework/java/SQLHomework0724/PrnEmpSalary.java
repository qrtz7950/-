package kr.co.SQLHomework0724;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class PrnEmpSalary {

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
			String sql ="select j.job_title " + 
					"         , avg(e.salary) " + 
					"      from employees e left outer join jobs j " + 
					"        on e.job_id = j.job_id " + 
					"     where e.salary >= ? " + 
					"  group by j.job_title " + 
					"  order by 2 desc ";  
	        pstmt = conn.prepareStatement(sql);
	        
	        Scanner sc = new Scanner(System.in);
	        System.out.print("�޿����Է��ϼ��� : ");
	        String how = sc.nextLine();
	        pstmt.setString(1, how);
	        
			//4�ܰ�
	        int a = 0;
	        
	        ResultSet rs = pstmt.executeQuery();
	        while(rs.next()) {
	        String depart = rs.getString(1);
	        String salary = rs.getString(2); 
	        System.out.println("[" + depart + "]" + " " + salary);
	        a++;
	        }
			
	        System.out.println(a + "���� �˻��Ǿ����ϴ�");
	        
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
