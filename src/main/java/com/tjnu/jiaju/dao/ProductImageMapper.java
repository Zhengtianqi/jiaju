package com.tjnu.jiaju.dao;

import org.apache.ibatis.annotations.Param;

import com.tjnu.jiaju.entity.ProductImage;
import com.tjnu.jiaju.util.PageUtil;

import java.util.List;

public interface ProductImageMapper {
    Integer insertOne(@Param("productImage") ProductImage productImage);

    Integer insertList(@Param("productImage_list") List<ProductImage> productImageList);
    Integer updateOne(@Param("productImage") ProductImage productImage);
    Integer deleteList(@Param("productImage_id_list") Integer[] productImage_id_list);

    List<ProductImage> select(@Param("product_id") Integer product_id, @Param("productImage_type") Byte productImage_type, @Param("pageUtil") PageUtil pageUtil);
    ProductImage selectOne(@Param("productImage_id") Integer productImage_id);
    Integer selectTotal(@Param("product_id") Integer product_id, @Param("productImage_type") Byte productImage_type);
}
