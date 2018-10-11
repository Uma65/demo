package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.College;
import com.example.demo.bean.DataDemo;
import com.example.demo.bean.Employee;
import com.example.demo.dao.DemoDao;
import com.example.demo.dao.SampleDao;

@Service
public class DemoServiceImpl implements DemoService {

	@Autowired
	private DemoDao dempDao;
	@Autowired
	private SampleDao samplDao;

	@Override
	public Employee getEmployee(Integer id) {

		return dempDao.getEmployee(id);
	}

	@Override
	public College getCollege(Integer id) {
		// TODO Auto-generated method stub
		return samplDao.getCollege(id);
	}

	@Override
	public DataDemo getData(Integer id) {
		// TODO Auto-generated method stub
		return samplDao.getData(id);
	}

}
