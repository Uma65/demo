package com.example.demo.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.bean.Employee;

@Repository
public class DemoDaoImpl implements DemoDao {

	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	@Override
	public Employee getEmployee(Integer id) {

		String getEmployee = "SELECT ID, EMP_NAME, PHONE_NUMBER FROM PUBLIC.EMPLOYEE where ID=:id";
		Map<String, Object> paramMap = new HashMap<>();
		paramMap.put("id", id);

		List<Map<String, Object>> data = namedParameterJdbcTemplate.queryForList(getEmployee, paramMap);
		List<Employee> employees = new ArrayList<>();
		for (Map<String, Object> row : data) {
			Employee emp = new Employee();

			emp.setId((Integer) row.get("ID"));
			emp.setName((String) row.get("EMP_NAME"));
			emp.setPhone((String) row.get("PHONE_NUMBER"));

			employees.add(emp);
		}
		employees.add(new Employee());
		return employees.get(0);

	}

}
