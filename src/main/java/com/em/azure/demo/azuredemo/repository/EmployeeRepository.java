package com.em.azure.demo.azuredemo.repository;

import com.em.azure.demo.azuredemo.entity.EmployeeEntity;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<EmployeeEntity,Long> {
}
