package com.shark.weipan.dao;

import java.util.List;

import com.shark.weipan.common.exception.DaoException;
import com.shark.weipan.dto.Test;

public interface ITestDao {
	
	List getList();
	
	void insert(Test test) throws DaoException;
	
	void update(Test test)throws DaoException;
	
	void delete(int id)throws DaoException;
	
}
