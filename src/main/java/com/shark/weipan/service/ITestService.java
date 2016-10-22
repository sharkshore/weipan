package com.shark.weipan.service;

import java.util.List;

import com.shark.weipan.dto.Test;

public interface ITestService {

	List getList();
	
	void insert(Test test);
	
	void update(Test test);
	
	void delete(int id);
	
}
