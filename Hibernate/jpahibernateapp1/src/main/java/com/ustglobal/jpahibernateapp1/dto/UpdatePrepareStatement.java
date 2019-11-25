package com.ustglobal.jpahibernateapp1.dto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;
import com.mysql.jdbc.PreparedStatement;

public class UpdatePrepareStatement {
	public static void main(String[] args) {
		Connection conn = null;
		java.sql.PreparedStatement pstmt = null;
		
		try {
			Driver driver =  new Driver();
			DriverManager.deregisterDriver(driver);
			
			String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			conn = DriverManager.getConnection(url);
			
			String sql = "update employee_info set name = 'Roopa', salary = 3000, gender = 'Female' where id =17   ";
			pstmt = conn.prepareStatement(sql);
			int count = pstmt.executeUpdate(sql);
			
			System.out.println(count + "Row(s) updated");
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn != null) {
					conn.close();
				}
				if(pstmt != null) {
					pstmt.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
