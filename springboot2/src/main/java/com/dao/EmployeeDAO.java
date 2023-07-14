package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Employee;

@Service
public class EmployeeDAO {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	public List<Employee> getAllEmployees(){
		return employeeRepository.findAll();
	}
	
	public Employee getEmpDetailsById(int empId) {
		Employee emp = new Employee(0, "Employee Not Found", 0.0, "", null, "", "", "");
		return employeeRepository.findById(empId).orElse(emp);
	}
	
	public Employee getEmpDetailsByName(String empName) {
		return employeeRepository.findByName(empName);
	}
	
	public Employee registerEmp(Employee employee) {
		return employeeRepository.save(employee);
	}
	
	public Employee updateEmp(Employee employee) {
		return employeeRepository.save(employee);
	}
	
	public void deleteEmp(int empId) {
		employeeRepository.deleteById(empId);
	}
}
