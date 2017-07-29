package com.bytebeats.spring4.ioc.dao;

import com.bytebeats.spring4.ioc.domain.Employee;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author Ricky Fung
 * @create 2016-07-19 17:55
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class EmployeeDaoTest {

    @Autowired
    private IEmployeeDao employeeDao;

    @Test
    @Ignore
    public void testDao() {

        int result = employeeDao.insert(new Employee(1, "ricky", 27));
        System.out.println("insert result:"+result);
        Employee employee = employeeDao.findById(1);
        System.out.println("find:"+employee);

        List<Employee> employeeList = employeeDao.queryAllEmployees();
        System.out.println(employeeList.size());
    }
}
