package com.javaguides.employeeservice.service;

import com.javaguides.employeeservice.DTO.DepartmentDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "http://localhost:8080", value = "DEPARTMENT-SERVICE")
public interface APIClient {
    @GetMapping("api/departments{code}")
    DepartmentDto getDepartment(@PathVariable("code") String code);
}
