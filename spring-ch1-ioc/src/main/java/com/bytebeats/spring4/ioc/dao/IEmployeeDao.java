package com.bytebeats.spring4.ioc.dao;

import com.bytebeats.spring4.ioc.domain.Employee;

import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author Ricky Fung
 * @create 2016-07-19 17:43
 */
public interface IEmployeeDao {

    public int insert(Employee employee);
    public Employee findById(long id);
    public List<Employee> queryAllEmployees();
}
