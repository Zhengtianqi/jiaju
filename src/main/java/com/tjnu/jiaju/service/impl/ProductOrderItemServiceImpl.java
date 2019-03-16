package com.tjnu.jiaju.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.tjnu.jiaju.dao.ProductOrderItemMapper;
import com.tjnu.jiaju.entity.OrderGroup;
import com.tjnu.jiaju.entity.ProductOrderItem;
import com.tjnu.jiaju.service.ProductOrderItemService;
import com.tjnu.jiaju.util.PageUtil;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service("productOrderItemService")
public class ProductOrderItemServiceImpl implements ProductOrderItemService{
    private ProductOrderItemMapper productOrderItemMapper;
    @Resource(name = "productOrderItemMapper")
    public void setProductOrderItemMapper(ProductOrderItemMapper productOrderItemMapper) {
        this.productOrderItemMapper = productOrderItemMapper;
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    
    public boolean add(ProductOrderItem productOrderItem) {
        return productOrderItemMapper.insertOne(productOrderItem)>0;
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    
    public boolean update(ProductOrderItem productOrderItem) {
        return productOrderItemMapper.updateOne(productOrderItem)>0;
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    
    public boolean deleteList(Integer[] productOrderItem_id_list) {
        return productOrderItemMapper.deleteList(productOrderItem_id_list)>0;
    }

    
    public List<ProductOrderItem> getList(PageUtil pageUtil) {
        return productOrderItemMapper.select(pageUtil);
    }

    
    public List<ProductOrderItem> getListByOrderId(Integer order_id, PageUtil pageUtil) {
        return productOrderItemMapper.selectByOrderId(order_id,pageUtil);
    }

    
    public List<ProductOrderItem> getListByUserId(Integer user_id, PageUtil pageUtil) {
        return productOrderItemMapper.selectByUserId(user_id,pageUtil);
    }

    
    public List<ProductOrderItem> getListByProductId(Integer product_id, PageUtil pageUtil) {
        return productOrderItemMapper.selectByProductId(product_id,pageUtil);
    }

    
    public ProductOrderItem get(Integer productOrderItem_id) {
        return productOrderItemMapper.selectOne(productOrderItem_id);
    }

    
    public Integer getTotal() {
        return productOrderItemMapper.selectTotal();
    }

    
    public Integer getTotalByOrderId(Integer order_id) {
        return productOrderItemMapper.selectTotalByOrderId(order_id);
    }

    
    public Integer getTotalByUserId(Integer user_id) {
        return productOrderItemMapper.selectTotalByUserId(user_id);
    }

    
    public List<OrderGroup> getTotalByProductId(Integer product_id, Date beginDate, Date endDate) {
        return productOrderItemMapper.getTotalByProductId(product_id,beginDate,endDate);
    }

    
    public Integer getSaleCountByProductId(Integer product_id) {
        return productOrderItemMapper.selectSaleCount(product_id);
    }
}
