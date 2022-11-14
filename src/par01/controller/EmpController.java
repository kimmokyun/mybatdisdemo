package par01.controller;

import java.util.List;

import part01.dao.EmployeesDAO;
import part01.dto.EmpDto;

public class EmpController {

	private EmployeesDAO dao;

	public EmpController() {
	dao = new EmployeesDAO();
	}

	public int countProcess() {
	return dao.countMethod();
	}

	public List<EmpDto> listProcess(){
	return dao.listMethod();
	}

	public List<EmpDto> searchProcess(String data) {
		return dao.searchMethod(data);
		
	}
	
}
