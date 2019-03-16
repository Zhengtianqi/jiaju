package com.tjnu.jiaju.service;

import java.util.List;

import com.tjnu.jiaju.entity.Property;
import com.tjnu.jiaju.util.PageUtil;

public interface PropertyService {
    boolean add(Property property);

    boolean addList(List<Property> propertyList);
    boolean update(Property property);
    boolean deleteList(Integer[] property_id_list);

    List<Property> getList(Property property, PageUtil pageUtil);
    Property get(Integer property_id);
    Integer getTotal(Property property);
}
