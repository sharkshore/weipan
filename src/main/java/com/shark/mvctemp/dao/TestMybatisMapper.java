package com.shark.mvctemp.dao;

import com.shark.mvctemp.dto.TestMybatis;
import com.shark.mvctemp.dto.TestMybatisExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TestMybatisMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_mybatis
     *
     * @mbggenerated Mon Sep 12 21:28:28 CST 2016
     */
    int countByExample(TestMybatisExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_mybatis
     *
     * @mbggenerated Mon Sep 12 21:28:28 CST 2016
     */
    int deleteByExample(TestMybatisExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_mybatis
     *
     * @mbggenerated Mon Sep 12 21:28:28 CST 2016
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_mybatis
     *
     * @mbggenerated Mon Sep 12 21:28:28 CST 2016
     */
    int insert(TestMybatis record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_mybatis
     *
     * @mbggenerated Mon Sep 12 21:28:28 CST 2016
     */
    int insertSelective(TestMybatis record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_mybatis
     *
     * @mbggenerated Mon Sep 12 21:28:28 CST 2016
     */
    List<TestMybatis> selectByExample(TestMybatisExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_mybatis
     *
     * @mbggenerated Mon Sep 12 21:28:28 CST 2016
     */
    TestMybatis selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_mybatis
     *
     * @mbggenerated Mon Sep 12 21:28:28 CST 2016
     */
    int updateByExampleSelective(@Param("record") TestMybatis record, @Param("example") TestMybatisExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_mybatis
     *
     * @mbggenerated Mon Sep 12 21:28:28 CST 2016
     */
    int updateByExample(@Param("record") TestMybatis record, @Param("example") TestMybatisExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_mybatis
     *
     * @mbggenerated Mon Sep 12 21:28:28 CST 2016
     */
    int updateByPrimaryKeySelective(TestMybatis record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_mybatis
     *
     * @mbggenerated Mon Sep 12 21:28:28 CST 2016
     */
    int updateByPrimaryKey(TestMybatis record);
}