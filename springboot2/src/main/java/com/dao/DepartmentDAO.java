package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Department;

@Service
public class DepartmentDAO {
	
	@Autowired
	DepartmentRepository departmentRepository;
	
	public List<Department> getAllDepartments(){
		return departmentRepository.findAll();
	}
	
	public Department getDeptById(int deptId) {
		return departmentRepository.findById(deptId).orElse(new Department(0,"null","null"));
	}
	
	public Department getDeptByName(String deptName) {
		return departmentRepository.findByName(deptName);
	}
	
	public Department registerDept(Department department) {
		return departmentRepository.save(department);
	}
	
	public Department updateDept(Department department) {
		return departmentRepository.save(department);
	}
	
	public void deleteDept(int deptId) {
		 departmentRepository.deleteById(deptId);
	}
}
