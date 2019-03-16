package com.tjnu.jiaju.service;

import java.util.List;

import com.tjnu.jiaju.entity.PropertyValue;
import com.tjnu.jiaju.util.PageUtil;

public interface PropertyValueService {
    boolean add(PropertyValue propertyValue);

    boolean addList(List<PropertyValue> propertyValueList);
    boolean update(PropertyValue propertyValue);
    boolean deleteList(Integer[] propertyValue_id_list);

    List<PropertyValue> getList(PropertyValue propertyValue, PageUtil pageUtil);
    PropertyValue get(Integer propertyValue_id);
    Integer getTotal(PropertyValue propertyValue);
}
