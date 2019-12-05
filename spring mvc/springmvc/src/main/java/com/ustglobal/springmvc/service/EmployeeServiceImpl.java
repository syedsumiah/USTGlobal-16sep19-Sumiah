package com.ustglobal.springmvc.service;

public class EmployeeServiceImpl implements EmployeeService{
	
	private EmployeeDAO dao = new EmployeeDaoImpl();

	@Override
	public EmployeeBean login(int id, String password) {
		
		return dao.login(id, password);
	}

	@Override
	public boolean register(EmployeeBean bean) {
		// TODO Auto-generated method stub
		return dao.register(bean);
	}

	@Override
	public boolean deleteEmployee(int id) {
		// TODO Auto-generated method stub
		return dao.deleteEmployee(id);
	}

	@Override
	public EmployeeBean searchEmployee(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateEmployee(EmployeeBean bean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean changePassword(int id, String password) {
		// TODO Auto-generated method stub
		return false;
	}

}
