package com.tjnu.jiaju.service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.tjnu.jiaju.entity.OrderGroup;
import com.tjnu.jiaju.entity.ProductOrder;
import com.tjnu.jiaju.util.OrderUtil;
import com.tjnu.jiaju.util.PageUtil;

public interface ProductOrderService {
    boolean add(ProductOrder productOrder);
    boolean update(ProductOrder productOrder);
    boolean deleteList(Integer[] productOrder_id_list);

    List<ProductOrder> getList(ProductOrder productOrder, Byte[] productOrder_status_array, OrderUtil orderUtil, PageUtil pageUtil);

    List<OrderGroup> getTotalByDate(Date beginDate, Date endDate);

    ProductOrder get(Integer productOrder_id);
    ProductOrder getByCode(String productOrder_code);
    Integer getTotal(ProductOrder productOrder,Byte[] productOrder_status_array);
}
