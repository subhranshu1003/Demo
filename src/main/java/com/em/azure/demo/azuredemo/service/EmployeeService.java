package com.em.azure.demo.azuredemo.service;

import com.em.azure.demo.azuredemo.entity.EmployeeEntity;
import com.em.azure.demo.azuredemo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EmployeeService {
	
	
	@Autowired
    private EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<EmployeeEntity> getAllEmplyees() {
		 return (List<EmployeeEntity>) employeeRepository.findAll();
	}

	public EmployeeEntity saveEmployee(EmployeeEntity employeeEntity) {
         return employeeRepository.save(employeeEntity);

		
	}

   /* public HttpStatus updateEmployeeDetail(Long employeeId, String empName) {
		   Optional<EmployeeEntity> empEntity=employeeRepository.findById(employeeId);
		   
		  
		   if(empEntity!=null && empEntity.isPresent()) {
			   EmployeeEntity employeeEntity= empEntity.get();
			   employeeEntity.setId(employeeId);
			   employeeEntity.setName(empName);
			   employeeDao.save(employeeEntity);
			   return HttpStatus.OK;
		   }
		   
		   else return HttpStatus.NOT_FOUND;
		
		   */
		 
		   
		
		 
		
	}


