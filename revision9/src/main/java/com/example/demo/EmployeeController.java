package com.example.demo;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    private final EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @GetMapping("/flat-with-department")
    public List<Map<String, Object>> getEmployeesFlatWithDepartments() {
        List<Employee> employees = employeeRepository.findAll();
        List<Map<String, Object>> response = new ArrayList<>();

        for (Employee e : employees) {
            if (e.getDepartments() != null) {
                for (Department d : e.getDepartments()) {
                    Map<String, Object> map = new HashMap<>();
                    map.put("employeeId", e.getEmployeeId());
                    map.put("name", e.getName());
                    map.put("designation", e.getDesignation());
                    map.put("companyName", e.getCompanyName());
                    map.put("deptId", d.getDeptId());
                    map.put("deptName", d.getDeptName());
                    map.put("location", d.getLocation());
                    response.add(map);
                }
            } else {
                // Employee with no department
                Map<String, Object> map = new HashMap<>();
                map.put("employeeId", e.getEmployeeId());
                map.put("name", e.getName());
                map.put("designation", e.getDesignation());
                map.put("companyName", e.getCompanyName());
                map.put("deptId", null);
                map.put("deptName", null);
                map.put("location", null);
                response.add(map);
            }
        }
        return response;
    }
}
