package com.javaguides.departmentservice.service;

import com.javaguides.departmentservice.DTO.DepartmentDto;

public interface DepartmentService {
    DepartmentDto saveDepartment(DepartmentDto departmentDto);
    DepartmentDto getDepartmentByCode(String code);
}
