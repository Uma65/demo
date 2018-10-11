package com.example.demo.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.bean.College;
import com.example.demo.bean.DataDemo;

@Repository
public class Sample implements SampleDao,DataDao{
	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	@Override
	public College getCollege(Integer id) {
		String getCollege = "SELECT id, \"collegeName\" FROM public.\"College\" where ID=id";
		Map<String, Object> paramMap = new HashMap<>();
		paramMap.put("id", id);

		List<Map<String, Object>> values = namedParameterJdbcTemplate.queryForList(getCollege, paramMap);
		List<College> college = new ArrayList<>();
		for (Map<String, Object> data : values) {
			College clz = new College();
			clz.setCollegeCode((Integer) data.get("id"));
			clz.setCollegeName((String) data.get("collegeName"));
			college.add(clz);

		}
		college.add(new College());
		return college.get(0);
	}

	@Override
	public DataDemo getData(Integer id) {
		String querySingleValue ="SELECT id, cname FROM public.taskdata where id =id";
		Map<String, Object> paramMap =new HashMap<>();
		paramMap.put("id",id);
		
		List<Map<String, Object>> values1 = namedParameterJdbcTemplate.queryForList(querySingleValue, paramMap);
		List<DataDemo> demo = new ArrayList<>();
		for(Map<String, Object> data:values1){
			DataDemo data1 = new DataDemo();
			data1.setId((Integer) data.get("id"));
			data1.setChild_name((String) data.get("cname"));
			demo.add(data1);
			}	
		demo.add(new DataDemo());
		return demo.get(0);
	}

}
