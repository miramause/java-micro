package com.javaguides.organizationservice.service;

import com.javaguides.organizationservice.DTO.OrganizationDto;

public interface OrganizationService {
    OrganizationDto saveOrganization(OrganizationDto organizationDto);
    OrganizationDto getOrganizationByCode(String code);
}
