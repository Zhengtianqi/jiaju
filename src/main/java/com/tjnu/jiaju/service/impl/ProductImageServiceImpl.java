package com.tjnu.jiaju.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.tjnu.jiaju.dao.ProductImageMapper;
import com.tjnu.jiaju.entity.ProductImage;
import com.tjnu.jiaju.service.ProductImageService;
import com.tjnu.jiaju.util.PageUtil;

import javax.annotation.Resource;
import java.util.List;

@Service("productImageService")
public class ProductImageServiceImpl implements ProductImageService{
    private ProductImageMapper productImageMapper;
    @Resource(name = "productImageMapper")
    public void setProductImageMapper(ProductImageMapper productImageMapper) {
        this.productImageMapper = productImageMapper;
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    
    public boolean add(ProductImage productImage) {
        return productImageMapper.insertOne(productImage)>0;
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    
    public boolean addList(List<ProductImage> productImageList) {
        return productImageMapper.insertList(productImageList) > 0;
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    
    public boolean update(ProductImage productImage) {
        return productImageMapper.updateOne(productImage)>0;
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    
    public boolean deleteList(Integer[] productImage_id_list) {
        return productImageMapper.deleteList(productImage_id_list)>0;
    }

    
    public List<ProductImage> getList(Integer product_id, Byte productImage_type, PageUtil pageUtil) {
        return productImageMapper.select(product_id,productImage_type,pageUtil);
    }

    
    public ProductImage get(Integer productImage_id) {
        return productImageMapper.selectOne(productImage_id);
    }

    
    public Integer getTotal(Integer product_id, Byte productImage_type) {
        return productImageMapper.selectTotal(product_id,productImage_type);
    }
}
