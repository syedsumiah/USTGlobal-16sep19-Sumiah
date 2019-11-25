package com.ustglobal.empwebapp1.dao;

import com.ustglobal.empwebapp1.dto.EmployeeInfo;

public interface EmployeeDAO {
	
	public EmployeeInfo auth(int id, String Password);
	
	public EmployeeInfo serachEmployee(int id);
	
	public boolean changePassword(int id, String password);
	
	public boolean registerEmployee(EmployeeInfo info);

}// end of EmployeeDAO
