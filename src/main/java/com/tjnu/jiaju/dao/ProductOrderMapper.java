package com.tjnu.jiaju.dao;

import org.apache.ibatis.annotations.Param;

import com.tjnu.jiaju.entity.OrderGroup;
import com.tjnu.jiaju.entity.ProductOrder;
import com.tjnu.jiaju.util.OrderUtil;
import com.tjnu.jiaju.util.PageUtil;

import java.util.Date;
import java.util.List;

public interface ProductOrderMapper {
    Integer insertOne(@Param("productOrder") ProductOrder productOrder);
    Integer updateOne(@Param("productOrder") ProductOrder productOrder);
    Integer deleteList(@Param("productOrder_id_list") Integer[] productOrder_id_list);

    List<ProductOrder> select(@Param("productOrder") ProductOrder productOrder, @Param("productOrder_status_array") Byte[] productOrder_status_array, @Param("orderUtil") OrderUtil orderUtil, @Param("pageUtil") PageUtil pageUtil);
    ProductOrder selectOne(@Param("productOrder_id") Integer productOrder_id);
    ProductOrder selectByCode(@Param("productOrder_code") String productOrder_code);
    Integer selectTotal(@Param("productOrder") ProductOrder productOrder, @Param("productOrder_status_array") Byte[] productOrder_status_array);
    List<OrderGroup> getTotalByDate(@Param("beginDate") Date beginDate, @Param("endDate") Date endDate);
}
