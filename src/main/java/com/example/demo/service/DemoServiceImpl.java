package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.Employee;
import com.example.demo.dao.DemoDao;

@Service
public class DemoServiceImpl implements DemoService {

	@Autowired
	private DemoDao dempDao;
	@Override
	public Employee getEmployee(Integer id) {

		return dempDao.getEmployee(id);
	}

}
