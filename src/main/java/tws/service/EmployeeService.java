package tws.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	

}
