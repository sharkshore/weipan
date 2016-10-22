package com.shark.weipan.service.impl;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import com.shark.weipan.dto.Student;
import com.shark.weipan.service.IMongoTestService;

@Service
public class MongoTestService implements IMongoTestService {
	
	//创建SLF4J对象
	private static final Logger logger = LoggerFactory.getLogger(MongoTestService.class);


	@Autowired
	MongoTemplate mongoTemplate;
	
	private static String USER_COLLECTION = "user";
	
	public void insert(Student student) {
		mongoTemplate.save(student, USER_COLLECTION); 
	}

	@Override
	public List getList(Map map) {
		logger.info("----------<<{}>>---------",mongoTemplate.toString());
		return mongoTemplate.findAll(Student.class,USER_COLLECTION);
	}

	@Override
	public void update(Student stu) {
		
	}

	@Override
	public void delete() {

	}

}
