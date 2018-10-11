package com.example.demo.service;

import com.example.demo.bean.College;
import com.example.demo.bean.DataDemo;
import com.example.demo.bean.Employee;

public interface DemoService {
public Employee getEmployee(Integer id );
public College getCollege(Integer id) ;
public DataDemo getData(Integer id);

}
