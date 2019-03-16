package com.tjnu.jiaju.service.impl;

import org.springframework.stereotype.Service;

import com.tjnu.jiaju.dao.LastIDMapper;
import com.tjnu.jiaju.service.LastIDService;

import javax.annotation.Resource;

@Service("lastIDService")
public class LastIDServiceImpl implements LastIDService {
    private LastIDMapper lastIDMapper;

    @Resource(name = "lastIDMapper")
    public void setLastIDMapper(LastIDMapper lastIDMapper) {
        this.lastIDMapper = lastIDMapper;
    }

    
    public int selectLastID() {
        return lastIDMapper.selectLastID();
    }
}
