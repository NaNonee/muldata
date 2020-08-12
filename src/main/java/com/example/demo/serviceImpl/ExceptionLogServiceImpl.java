package com.example.demo.serviceImpl;

import com.example.demo.dao.ExceptionLogMapper;
import com.example.demo.entity.ExceptionLog;
import com.example.demo.service.ExceptionLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExceptionLogServiceImpl implements ExceptionLogService {
    @Autowired
    private ExceptionLogMapper exceptionLogMapper;
    @Override
    public void insert(ExceptionLog record) {
         exceptionLogMapper.insert(record);
    }
}
