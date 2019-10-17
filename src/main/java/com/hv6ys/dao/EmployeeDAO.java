package com.hv6ys.dao;

import java.util.List;

import com.hv6ys.entity.Employee;
import org.springframework.stereotype.Component;

/**
 * DAO interface for Employee to perform CRUD operation.
 * @author Seyi Akintan
 * @version 1.0
 */
@Component
public interface EmployeeDAO {
    /**
     * Used to Create the Employee Information
     * @param employee
     * @return {@link Employee}
     */
    public Employee createEmployee(Employee employee);

    /**
     * Getting the Employee Information using Id
     * @param id
     * @return {@link Employee}
     */
    public Employee getEmployee(int id);

    /**
     * Used to Update the Employee Information
     * @param employee
     * @return {@link Employee}
     */

    public Employee updateEmployee(Employee employee);

    /**
     * Deleting the Employee Information using Id
     * @param id
     */
    public void deleteEmployee(int id);

    /**
     * Getting the All Employees information
     * @return
     */
    public List<Employee> getAllEmployees();
}