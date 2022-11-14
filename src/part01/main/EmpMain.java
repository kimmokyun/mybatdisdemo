package part01.main;

import java.util.List;

import par01.controller.EmpController;
import part01.dto.EmpDto;

public class EmpMain {


	
	public static void main(String[] args) {
		EmpController eController = new EmpController();
		System.out.printf("record count:%d\n", eController.countProcess());
		
		List<EmpDto> aList = eController.listProcess();
		for(EmpDto dto :aList)
			System.out.printf("%d%s%d%s\n",dto.getEmployee_id(),dto.getFirst_name(),dto.getSalary(),dto.getHire_date());
	
	
	System.out.println("==============SEARCH===================");
	List<EmpDto> searchList = eController.searchProcess("eve");
	for(EmpDto dto : searchList)
		System.out.printf("%d%s%d%s\n",dto.getEmployee_id(),dto.getFirst_name(),dto.getSalary(),dto.getHire_date());
	}

	
}

