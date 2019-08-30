package tws.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestParam;

import tws.dto.EmployeeDTO;
import tws.entity.Employee;
import tws.repository.EmployeeMapper;


@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeMapper employeeMapper;
	

	public EmployeeDTO getEmployeeWithDesc(String id) {
		
		Employee employee =  employeeMapper.selectOne(id) ;
		
		EmployeeDTO employeeDTO = new EmployeeDTO();
		employeeDTO.setId(employee.getId());
		employeeDTO.setName(employee.getName());
		employeeDTO.setAge(employee.getAge());
		
		String desc = String.format("name:%s,name:%s",
				employee.getName(),
				employee.getAge()
				);
		employeeDTO.setdsc(desc);
		return employeeDTO;
		
	}


	public List<Employee> getEmployees(int page, int pageSize){
	    int offset = (page-1)*pageSize;
	    List<Employee> list = employeeMapper.selectAll(offset,pageSize);
	    return list;
	}
	

}
