package com.shark.weipan.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shark.weipan.dao.TestMybatisMapper;
import com.shark.weipan.dto.TestMybatis;
import com.shark.weipan.dto.TestMybatisExample;
import com.shark.weipan.service.ITestMyBatisService;

@Component
public class TestMyBatisService implements ITestMyBatisService {

	@Autowired
	TestMybatisMapper dao;
	
	@Override
	public int countByExample(TestMybatisExample example) {
		return dao.countByExample(example);
	}

	@Override
	public int deleteByExample(TestMybatisExample example) {
		return dao.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		return dao.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(TestMybatis record) {
		return dao.insert(record);
	}

	@Override
	public int insertSelective(TestMybatis record) {
		return dao.insertSelective(record);
	}

	@Override
	public List<TestMybatis> selectByExample(TestMybatisExample example) {
		return dao.selectByExample(example);
	}

	@Override
	public TestMybatis selectByPrimaryKey(Integer id) {
		return dao.selectByPrimaryKey(id);
	}

	@Override
	public int updateByExampleSelective(TestMybatis record, TestMybatisExample example) {
		return dao.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(TestMybatis record, TestMybatisExample example) {
		return dao.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(TestMybatis record) {
		return dao.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(TestMybatis record) {
		return dao.updateByPrimaryKey(record);
	}

}
