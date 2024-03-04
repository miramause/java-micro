package com.javaguides.employeeservice.service;

import com.javaguides.employeeservice.DTO.APIResponseDto;
import com.javaguides.employeeservice.DTO.EmployeeDto;

public interface EmployeeService {
    EmployeeDto saveEmployee(EmployeeDto employeeDto);
    APIResponseDto getEmployeeById(Long id);

}
