package com.tjnu.jiaju.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.tjnu.jiaju.dao.ProductOrderMapper;
import com.tjnu.jiaju.entity.OrderGroup;
import com.tjnu.jiaju.entity.ProductOrder;
import com.tjnu.jiaju.service.ProductOrderService;
import com.tjnu.jiaju.util.OrderUtil;
import com.tjnu.jiaju.util.PageUtil;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service("productOrderService")
public class ProductOrderServiceImpl implements ProductOrderService{
    private ProductOrderMapper productOrderMapper;
    @Resource(name = "productOrderMapper")
    public void setProductOrderMapper(ProductOrderMapper productOrderMapper) {
        this.productOrderMapper = productOrderMapper;
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    
    public boolean add(ProductOrder productOrder) {
        return productOrderMapper.insertOne(productOrder)>0;
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    
    public boolean update(ProductOrder productOrder) {
        return productOrderMapper.updateOne(productOrder)>0;
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    
    public boolean deleteList(Integer[] productOrder_id_list) {
        return productOrderMapper.deleteList(productOrder_id_list)>0;
    }

    
    public List<ProductOrder> getList(ProductOrder productOrder, Byte[] productOrder_status_array, OrderUtil orderUtil, PageUtil pageUtil) {
        return productOrderMapper.select(productOrder,productOrder_status_array,orderUtil,pageUtil);
    }

    
    public List<OrderGroup> getTotalByDate(Date beginDate, Date endDate) {
        return productOrderMapper.getTotalByDate(beginDate,endDate);
    }

    
    public ProductOrder get(Integer productOrder_id) {
        return productOrderMapper.selectOne(productOrder_id);
    }

    
    public ProductOrder getByCode(String productOrder_code) {
        return productOrderMapper.selectByCode(productOrder_code);
    }

    
    public Integer getTotal(ProductOrder productOrder, Byte[] productOrder_status_array) {
        return productOrderMapper.selectTotal(productOrder,productOrder_status_array);
    }
}
