package com.example.demo;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @Column(name = "Employee_id")
    private int employeeId;

    @Column(name = "Name")
    private String name;

    @Column(name = "Designation")
    private String designation;

    @Column(name = "Company_Name")
    private String companyName;

    // One employee can have multiple departments (if needed)
    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
    private List<Department> departments;

    // Getters and Setters
    public int getEmployeeId() { return employeeId; }
    public void setEmployeeId(int employeeId) { this.employeeId = employeeId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDesignation() { return designation; }
    public void setDesignation(String designation) { this.designation = designation; }

    public String getCompanyName() { return companyName; }
    public void setCompanyName(String companyName) { this.companyName = companyName; }

    public List<Department> getDepartments() { return departments; }
    public void setDepartments(List<Department> departments) { this.departments = departments; }
}
