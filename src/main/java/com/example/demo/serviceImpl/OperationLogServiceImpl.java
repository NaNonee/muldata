package com.example.demo.serviceImpl;

import com.example.demo.dao.OperationLogMapper;
import com.example.demo.entity.OperationLog;
import com.example.demo.service.OperationLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OperationLogServiceImpl implements OperationLogService {
    @Autowired
    private OperationLogMapper operationLogMapper;
    @Override
    public int insert(OperationLog record) {
        return operationLogMapper.insert(record);
    }
}
