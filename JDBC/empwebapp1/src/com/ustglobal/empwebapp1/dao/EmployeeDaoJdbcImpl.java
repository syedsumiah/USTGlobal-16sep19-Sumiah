package com.ustglobal.empwebapp1.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.ustglobal.empwebapp1.dto.EmployeeInfo;

public class EmployeeDaoJdbcImpl implements EmployeeDAO{

	private static final String url = "jdbc:mysql://localhost:3306/ust_ty_web_db?user=root&password=root";
	private static final String DRIVER_CLASS_NAME = "com.mysql.jdbc.Driver";
	
	private static final String SELECT_SQL = "select * from employee_db where id=?";
	private static final String INSERT_SQL = "insert into employee_db values(?,?,?,?)";
	private static final String  UPDATE_SQL = "update employee_db set password=? where id=?";
	@Override
	public EmployeeInfo auth(int id, String password) {
		EmployeeInfo info = serachEmployee(id);
		if(info!=null) {
			String pass = info.getPassword();
			if(pass.equals(password)) {
				return info;
			}else {
				return null;
			}
		}
		return null;
	}

	@Override
	public EmployeeInfo serachEmployee(int id) {

		String sql = SELECT_SQL;
		try {
			Class.forName(DRIVER_CLASS_NAME);
			try(Connection conn = DriverManager.getConnection(url);
					PreparedStatement pstmt = conn.prepareStatement(sql)){
				pstmt.setInt(1, id);
				try(ResultSet rs = pstmt.executeQuery()){
					if(rs.next()) {
						EmployeeInfo info = new EmployeeInfo();

						info.setId(rs.getInt("id"));
						info.setName(rs.getString("name"));
						info.setEmail(rs.getString("email"));
						info.setPassword(rs.getString("password"));

						return info;
					}else {
						return null;
					}
				}

			}

		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	@Override
	public boolean changePassword(int id, String password) {

		String sql = UPDATE_SQL;
		try {
			Class.forName(DRIVER_CLASS_NAME);
			try(Connection conn = DriverManager.getConnection(url);
					PreparedStatement pstmt = conn.prepareStatement(sql)){

				pstmt.setString(1, password);
				pstmt.setInt(2, id);

				int count = pstmt.executeUpdate();
				if(count>0) {
					return true;
				}else {
					return false;
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;

	}

	@Override
	public boolean registerEmployee(EmployeeInfo info) {
		String sql = INSERT_SQL;
		//Connection conn = null;
		//PreparedStatement pstmt = null;
		try {
			Class.forName(DRIVER_CLASS_NAME);

			try(Connection conn = DriverManager.getConnection(url);
					PreparedStatement  pstmt = conn.prepareStatement(sql)){

				pstmt.setInt(1,  info.getId());
				pstmt.setString(2,  info.getName());
				pstmt.setString(3, info.getEmail());
				pstmt.setString(4, info.getPassword());

				int count = pstmt.executeUpdate();
				if(count>0) {
					return true;
				}else {
					return false;
				}
			}

		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}

	}

}
