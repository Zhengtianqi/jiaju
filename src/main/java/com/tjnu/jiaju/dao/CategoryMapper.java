package com.tjnu.jiaju.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.tjnu.jiaju.entity.Category;
import com.tjnu.jiaju.util.PageUtil;

import java.util.List;
import java.util.Map;

public interface CategoryMapper {
    Integer insertOne(@Param("category") Category category);
    Integer updateOne(@Param("category") Category category);

    List<Category> select(@Param("category_name") String category_name, @Param("pageUtil") PageUtil pageUtil);
    Category selectOne(@Param("category_id") Integer category_id);
    Integer selectTotal(@Param("category_name") String category_name);
    
    @Select("select c.category_name as pc,count(p.product_category_id) as num from product p,category c where p.product_category_id = c.category_id group by pc")
    List<Map<Object,Object>> getPieChart();
}