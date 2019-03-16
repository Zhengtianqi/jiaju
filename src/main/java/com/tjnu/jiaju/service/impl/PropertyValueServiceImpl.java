package com.tjnu.jiaju.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.tjnu.jiaju.dao.PropertyValueMapper;
import com.tjnu.jiaju.entity.PropertyValue;
import com.tjnu.jiaju.service.PropertyValueService;
import com.tjnu.jiaju.util.PageUtil;

import javax.annotation.Resource;
import java.util.List;

@Service("propertyValueService")
public class PropertyValueServiceImpl implements PropertyValueService{
    private PropertyValueMapper propertyValueMapper;
    @Resource(name = "propertyValueMapper")
    public void setPropertyValueMapper(PropertyValueMapper propertyValueMapper) {
        this.propertyValueMapper = propertyValueMapper;
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    
    public boolean add(PropertyValue propertyValue) {
        return propertyValueMapper.insertOne(propertyValue)>0;
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    
    public boolean addList(List<PropertyValue> propertyValueList) {
        return propertyValueMapper.insertList(propertyValueList) > 0;
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    
    public boolean update(PropertyValue propertyValue) {
        return propertyValueMapper.updateOne(propertyValue)>0;
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    
    public boolean deleteList(Integer[] propertyValue_id_list) {
        return propertyValueMapper.deleteList(propertyValue_id_list)>0;
    }

    
    public List<PropertyValue> getList(PropertyValue propertyValue, PageUtil pageUtil) {
        return propertyValueMapper.select(propertyValue,pageUtil);
    }

    
    public PropertyValue get(Integer propertyValue_id) {
        return propertyValueMapper.selectOne(propertyValue_id);
    }

    
    public Integer getTotal(PropertyValue propertyValue) {
        return propertyValueMapper.selectTotal(propertyValue);
    }
}
