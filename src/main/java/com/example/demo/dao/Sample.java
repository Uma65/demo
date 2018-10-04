package com.example.demo.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.bean.College;

@Repository
public class Sample implements SampleDao {
	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	@Override
	public College getCollege(Integer id) {
		String getCollege ="SELECT id, "collegeName" FROM public."College" where ID=id;"
		Map<String, Object> paramMap = new HashMap<>();
		paramMap.put("id",id);
		
	List<Map<String, Object>> values = namedParameterJdbcTemplate.queryForList(getCollege, paramMap);
	List<College> college= new ArrayList<>();
	for (Map<String, Object> data : values) {
		College clz = new College();
		clz.setCollegeCode((Integer) data.get("ID"));
		clz.setCollegeName((String) data.get("COLLEGE_NAME"));
		college.add(clz);
		
	}
	college.add(new College());
	return college.get(0);
	}

}
