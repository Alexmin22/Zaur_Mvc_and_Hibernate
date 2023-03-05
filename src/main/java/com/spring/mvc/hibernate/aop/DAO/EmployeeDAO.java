package com.spring.mvc.hibernate.aop.DAO;

import com.spring.mvc.hibernate.aop.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAllEmpl();

    public void saveEmpl(Employee employee);

    public Employee getEmpl(int id);

    public void deleteEmpl(int id);
}
