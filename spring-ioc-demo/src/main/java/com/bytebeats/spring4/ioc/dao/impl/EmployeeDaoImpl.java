package com.bytebeats.spring4.ioc.dao.impl;

import com.bytebeats.spring4.ioc.dao.IEmployeeDao;
import com.bytebeats.spring4.ioc.domain.Employee;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author Ricky Fung
 * @create 2016-07-19 17:44
 */
@Repository("employeeDao")
public class EmployeeDaoImpl implements IEmployeeDao {

    @Resource(name = "test1JdbcTemplate")
    private JdbcTemplate jdbcTemplate;

    @Override
    public int insert(Employee employee) {

        String sql = "INSERT INTO tb_employee(NAME, AGE) VALUES (?, ?)";

        return jdbcTemplate.update(sql, new Object[] {employee.getName(), employee.getAge()});
    }

    @Override
    public Employee findById(long id) {

        String sql = "SELECT * FROM tb_employee WHERE ID = ?";

        return jdbcTemplate.queryForObject(sql, new Object[]{ id }, new RowMapper<Employee>() {
            public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
                if(rs!=null){
                    Employee employee = new Employee();
                    employee.setId(rs.getInt("ID"));
                    employee.setName(rs.getString("NAME"));
                    employee.setAge(rs.getInt("AGE"));
                    return employee;
                }
                return null;
            }
        });
    }

    @Override
    public List<Employee> queryAllEmployees() {

        String sql = "SELECT * FROM tb_employee";

        return jdbcTemplate.query(sql, new RowMapper<Employee>() {
            public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
                if(rs!=null){
                    Employee employee = new Employee();
                    employee.setId(rs.getInt("ID"));
                    employee.setName(rs.getString("NAME"));
                    employee.setAge(rs.getInt("AGE"));
                    return employee;
                }
                return null;
            }
        });
    }
}
