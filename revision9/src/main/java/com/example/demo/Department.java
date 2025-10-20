package com.example.demo;
import jakarta.persistence.*;

@Entity
@Table(name = "department")
public class Department {

    @Id
    @Column(name = "Dept_ID")
    private int deptId;

    @Column(name = "Dept_Name")
    private String deptName;

    @Column(name = "Location")
    private String location;

    // Many departments can belong to one employee
    @ManyToOne
    @JoinColumn(name = "Employee_ID", referencedColumnName = "Employee_id")
    private Employee employee;

    // Getters and Setters
    public int getDeptId() { return deptId; }
    public void setDeptId(int deptId) { this.deptId = deptId; }

    public String getDeptName() { return deptName; }
    public void setDeptName(String deptName) { this.deptName = deptName; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public Employee getEmployee() { return employee; }
    public void setEmployee(Employee employee) { this.employee = employee; }
}
