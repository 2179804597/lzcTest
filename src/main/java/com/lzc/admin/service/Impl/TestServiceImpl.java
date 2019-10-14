package com.lzc.admin.service.Impl;


import com.lzc.admin.dao.TestDao;
import com.lzc.admin.entity.Test;
import com.lzc.admin.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private TestDao testDao;

    @Override
    public String test() {
        return "aaaa";
    }

    @Override
    public List<Test> getList() {
        return testDao.getList();
    }


}
