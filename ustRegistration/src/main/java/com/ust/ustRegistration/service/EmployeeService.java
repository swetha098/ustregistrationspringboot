package com.ust.ustRegistration.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.ustRegistration.model.Employee;
import com.ust.ustRegistration.repository.EmployeeRepo;
@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepo repo;
	public Employee createEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return repo.save(employee);
	}
//	public List<Employee> getEmployees() {
//		// TODO Auto-generated method stub
//		return repo.findAll();
//	}
//	public Employee getEmployeeById(int id) {
//		// TODO Auto-generated method stub
//		return repo.findById(id).orElse(null);
//		
//	}
//	public Employee updateEmployee(Employee employee) {
//		Employee oldemp=null;
//		Optional<Employee>optionalemployee=repo.findById(employee.getId());
//		if(optionalemployee.isPresent())
//		{
//			oldemp=optionalemployee.get();
//		    oldemp.setEmpname(employee.getEmpname());
//		    oldemp.setEmail(employee.getEmail());
//		    oldemp.setExperience(employee.getExperience());
//		    
//		    repo.save(oldemp);
//		}else {
//			return new Employee();
//		}
//		return oldemp;
//	public String deleteEmployeeById(int id) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
}
