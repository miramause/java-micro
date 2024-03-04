package com.javaguides.organizationservice.controller;

import com.javaguides.organizationservice.DTO.OrganizationDto;
import com.javaguides.organizationservice.service.OrganizationService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//@AllArgsConstructor
@RestController
@RequestMapping("api/organizations")
public class OrganizationController {
    public OrganizationController(OrganizationService organizationService) {
        this.organizationService = organizationService;
    }

    public OrganizationService organizationService;

    @PostMapping
    public ResponseEntity<OrganizationDto> saveOrganization(@RequestBody OrganizationDto organizationDto){
        OrganizationDto savedOrganizationDto = organizationService.saveOrganization(organizationDto);
        return new ResponseEntity<>(savedOrganizationDto, HttpStatus.CREATED);
    }
    @GetMapping("{code}")
    public ResponseEntity<OrganizationDto> getOrganizationByCode(@PathVariable String code){
        OrganizationDto organizationDto = organizationService.getOrganizationByCode(code);
        return ResponseEntity.ok(organizationDto);
    }
}
