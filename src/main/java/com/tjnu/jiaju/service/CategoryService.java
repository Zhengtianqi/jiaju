package com.tjnu.jiaju.service;

import java.util.List;
import java.util.Map;

import com.tjnu.jiaju.entity.Category;
import com.tjnu.jiaju.util.PageUtil;

public interface CategoryService {
    boolean add(Category category);
    boolean update(Category category);

    List<Category> getList(String category_name, PageUtil pageUtil);
    Category get(Integer category_id);
    Integer getTotal(String category_name);
    
    List<Map<Object,Object>> getPieChart();
}
