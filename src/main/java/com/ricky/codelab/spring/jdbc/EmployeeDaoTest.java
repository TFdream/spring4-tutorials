package com.ricky.codelab.spring.jdbc;

import com.ricky.codelab.spring.domain.Employee;
import com.ricky.codelab.spring.jdbc.dao.EmployeeDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ${DESCRIPTION}
 *
 * @author Ricky Fung
 * @create 2016-07-19 17:55
 */
public class EmployeeDaoTest {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmployeeDao employeeDao = (EmployeeDao) ctx.getBean("employeeDao");

        int result = employeeDao.insert(new Employee(1, "ricky", 27));
        System.out.println("insert result:"+result);
        Employee employee = employeeDao.findById(1);
        System.out.println("find:"+employee);

        ctx.close();
    }
}
