package com.ts;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dao.EmployeeDAO;
import com.model.Employee;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeDAO employeeDAO;
	
	@GetMapping ("/EmpDetails")
	public List<Employee> showEmpDetails() {
		return employeeDAO.getAllEmployees();
	}
	
	@GetMapping ("/EmpDetailsId/{empId}")
	public Employee getEmpDetailsById(@PathVariable("empId") int empId) {
		return employeeDAO.getEmpDetailsById(empId);
	}
	
	@GetMapping ("/EmpDetails/{empName}")
	public Employee getEmpDetailsByName(@PathVariable("empName") String empName) {
		return employeeDAO.getEmpDetailsByName(empName);
	}
	
	@PostMapping ("registerEmp")
	public Employee registerEmp(@RequestBody Employee employee) {
		return employeeDAO.registerEmp(employee);
	}
	
	@PutMapping ("updateEmp")
	public Employee updateEmp(@RequestBody Employee employee) {
		return employeeDAO.updateEmp(employee);
	}
	
	@DeleteMapping("/EmpDetails/{empId}")
	public String deleteEmp(@PathVariable("empId") int empId) {
		employeeDAO.deleteEmp(empId);
		return "Employee details with empId " + empId + " Deleted Successfully!!!";
	}
}
