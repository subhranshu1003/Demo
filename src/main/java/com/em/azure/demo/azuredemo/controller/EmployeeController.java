package com.em.azure.demo.azuredemo.controller;

import com.em.azure.demo.azuredemo.entity.EmployeeEntity;
import com.em.azure.demo.azuredemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	 
	@GetMapping("/bucketlists")
	public List<EmployeeEntity> findAll() {
		return employeeService.getAllEmplyees();
	}
	
	@PostMapping("/bucketlists")
	public EmployeeEntity saveEmployee(@RequestBody EmployeeEntity employeeEntity) {
		return employeeService.saveEmployee(employeeEntity);
	}
	  
	/*
	 @RequestMapping(method = RequestMethod.PUT, value = "/bucketlists/{employeeId}/employeeName/{empName}")
	    public HttpStatus updateEmployee(@PathVariable Integer employeeId,@PathVariable String empName) {
		  
		 return  employeeService.updateEmployeeDetail(employeeId,empName);

	    }
	
	 @RequestMapping(method = RequestMethod.DELETE, value = "/bucketlists/{employeeId}")
	    public void deletEmployee(@PathVariable Integer employeeId) {
		 employeeService.deleteEmployeeId(employeeId);

	    }
	 */
	

}
