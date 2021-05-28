package com.dev.basic_dl.dao.impl;

import com.dev.basic_dl.dao.DemoDao;

import java.util.Arrays;
import java.util.List;

public class DemoDaoImpl implements DemoDao {
    @Override
    public List<String> findAll() {
        return Arrays.asList("111","222","333");
    }
}
