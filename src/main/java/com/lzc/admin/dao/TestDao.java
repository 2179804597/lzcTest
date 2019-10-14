package com.lzc.admin.dao;

import com.lzc.admin.entity.Test;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestDao {

    public List<Test> getList();
}
