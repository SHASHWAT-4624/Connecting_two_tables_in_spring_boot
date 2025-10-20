# Connecting_two_tables_in_spring_boot
# 🧩 Connecting Two Tables in Spring Boot (Employee–Department)

This project demonstrates how to **connect two MySQL tables** (Employee and Department) using **Spring Boot**, **Spring Data JPA**, and **Hibernate**.  
It showcases **One-to-Many** and **Many-to-One** relationships, as well as performing **JOIN operations** via REST APIs.

---

## 🚀 Features
- Spring Boot application with MySQL integration
- `@OneToMany` and `@ManyToOne` relationship mapping
- REST API to fetch employees along with department details
- Uses JPA and Hibernate for ORM
- Lightweight backend, easy to extend

---

## 🧱 Database Structure

### 🧍 Employee Table
| Column Name   | Type         | Description              |
|----------------|---------------|--------------------------|
| Employee_id    | INT (Primary Key) | Unique employee ID      |
| Name           | VARCHAR(50)   | Employee name            |
| Designation    | VARCHAR(50)   | Employee job title       |
| Company_Name   | VARCHAR(50)   | Name of the company      |

### 🏢 Department Table
| Column Name   | Type         | Description                     |
|----------------|---------------|---------------------------------|
| Dept_ID        | INT (Primary Key) | Department ID                |
| Dept_Name      | VARCHAR(50)   | Department name                |
| Location       | VARCHAR(50)   | Department location            |
| Employee_ID    | INT (Foreign Key) | References `employee(Employee_id)` |

---

## 🧩 Entity Relationship Diagram



- One Employee can belong to multiple Departments.  
- Each Department is linked to one Employee.

---

## ⚙️ Technologies Used
- **Spring Boot** (v3+)
- **Spring Data JPA**
- **MySQL Database**
- **Hibernate ORM**
- **Maven**
- **Postman** for API testing

---

## 🧠 How It Works

### 1️⃣ Define Entities
- `Employee.java`
- `Department.java`  
  with `@OneToMany` and `@ManyToOne` mapping.

### 2️⃣ Create Repositories
- `EmployeeRepository.java`
- `DepartmentRepository.java`

### 3️⃣ Build REST Controller
- `EmployeeController.java` exposes endpoint `/api/employees/flat-with-department`

### 4️⃣ Run Application
- Database connection configured in `application.properties`:
```properties
spring.datasource.url=jdbc:mysql://localhost:3307/spring_suit?useSSL=false
spring.datasource.username=root
spring.datasource.password=12345
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true



GET http://localhost:8080/api/employees/flat-with-department


