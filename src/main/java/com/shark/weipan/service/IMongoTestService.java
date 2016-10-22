package com.shark.weipan.service;

import java.util.List;
import java.util.Map;

import com.shark.weipan.dto.Student;

public interface IMongoTestService {
	
	void update(Student student);
	
	void delete();

	void insert(Student studentO);

	List getList(Map map);
}
