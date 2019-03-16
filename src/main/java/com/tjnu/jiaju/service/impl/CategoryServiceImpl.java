package com.tjnu.jiaju.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.tjnu.jiaju.dao.CategoryMapper;
import com.tjnu.jiaju.entity.Category;
import com.tjnu.jiaju.service.CategoryService;
import com.tjnu.jiaju.util.PageUtil;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service("categoryService")
public class CategoryServiceImpl implements CategoryService {

    private CategoryMapper categoryMapper;
    @Resource(name = "categoryMapper")
    public void setCategoryMapper(CategoryMapper categoryMapper) {
        this.categoryMapper = categoryMapper;
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    
    public boolean add(Category category) {
        return categoryMapper.insertOne(category)>0;
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    
    public boolean update(Category category) {
        return categoryMapper.updateOne(category)>0;
    }

    
    public List<Category> getList(String category_name, PageUtil pageUtil) {
        return categoryMapper.select(category_name,pageUtil);
    }

    
    public Category get(Integer category_id) {
        return categoryMapper.selectOne(category_id);
    }

    
    public Integer getTotal(String category_name) {
        return categoryMapper.selectTotal(category_name);
    }

	@Override
	public List<Map<Object, Object>> getPieChart() {
		return categoryMapper.getPieChart();
	}
}
