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

import com.dao.DepartmentDAO;
import com.model.Department;

@RestController
public class DepartmentController {
	
	@Autowired
	DepartmentDAO deptDAO;
	
	@GetMapping("/DeptDetails")
	public List<Department> showDeptDetails(){
		return deptDAO.getAllDepartments();
	}
	
	@GetMapping("/DeptDetailsId/{deptId}")
	public Department getDeptById(@PathVariable("deptId") int deptId) {
		return deptDAO.getDeptById(deptId);
	}
	
	@GetMapping("/DeptDetails/{deptName}")
	public Department getDeptByName(@PathVariable("deptName") String deptName) {
		return deptDAO.getDeptByName(deptName);
	}
	
	@PostMapping("registerDept")
	public Department registerDept(@RequestBody Department department ) {
		return deptDAO.registerDept(department);
	}
	
	@PutMapping("updateDept")
	public Department updateDept(@RequestBody Department department) {
		return deptDAO.updateDept(department);
	}
	
	@DeleteMapping("/DeptDetails/{deptId}")
	public String deleteDept(@PathVariable("deptId") int deptId) {
		deptDAO.deleteDept(deptId);
		return "Department with DeptId: " + deptId + "Deleted Successfully!!!";
	}
	
	
	
//	@RequestMapping("/DeptDetails")
//	public Department showDeptDetails() {
//			Department department = new Department();
//			department.setDeptId(11);
//			department.setDeptName("Developer");
//			department.setLocation("Hyderabad");
//			return department;
//	}
}
