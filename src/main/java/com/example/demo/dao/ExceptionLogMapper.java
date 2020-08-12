package com.example.demo.dao;

import com.example.demo.entity.ExceptionLog;
import com.example.demo.entity.ExceptionLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExceptionLogMapper {
    int countByExample(ExceptionLogExample example);

    int deleteByExample(ExceptionLogExample example);

    int deleteByPrimaryKey(String excId);

    int insert(ExceptionLog record);

    int insertSelective(ExceptionLog record);

    List<ExceptionLog> selectByExample(ExceptionLogExample example);

    ExceptionLog selectByPrimaryKey(String excId);

    int updateByExampleSelective(@Param("record") ExceptionLog record, @Param("example") ExceptionLogExample example);

    int updateByExample(@Param("record") ExceptionLog record, @Param("example") ExceptionLogExample example);

    int updateByPrimaryKeySelective(ExceptionLog record);

    int updateByPrimaryKey(ExceptionLog record);
}