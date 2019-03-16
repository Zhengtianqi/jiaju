package com.tjnu.jiaju.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.tjnu.jiaju.dao.PropertyMapper;
import com.tjnu.jiaju.entity.Property;
import com.tjnu.jiaju.service.PropertyService;
import com.tjnu.jiaju.util.PageUtil;

import javax.annotation.Resource;
import java.util.List;

@Service("propertyService")
public class PropertyServiceImpl implements PropertyService{
    private PropertyMapper propertyMapper;
    @Resource(name = "propertyMapper")
    public void setPropertyMapper(PropertyMapper propertyMapper) {
        this.propertyMapper = propertyMapper;
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    
    public boolean add(Property property) {
        return propertyMapper.insertOne(property)>0;
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    
    public boolean addList(List<Property> propertyList) {
        return propertyMapper.insertList(propertyList) > 0;
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    
    public boolean update(Property property) {
        return propertyMapper.updateOne(property)>0;
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    
    public boolean deleteList(Integer[] property_id_list) {
        return propertyMapper.deleteList(property_id_list)>0;
    }

    
    public List<Property> getList(Property property, PageUtil pageUtil) {
        return propertyMapper.select(property,pageUtil);
    }

    
    public Property get(Integer property_id) {
        return propertyMapper.selectOne(property_id);
    }

    
    public Integer getTotal(Property property) {
        return propertyMapper.selectTotal(property);
    }
}
