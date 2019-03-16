package com.tjnu.jiaju.service;

import java.util.List;

import com.tjnu.jiaju.entity.Review;
import com.tjnu.jiaju.util.PageUtil;

public interface ReviewService {
    boolean add(Review review);
    boolean update(Review review);
    boolean deleteList(Integer[] review_id_list);

    List<Review> getList(Review review, PageUtil pageUtil);
    List<Review> getListByUserId(Integer user_id, PageUtil pageUtil);
    List<Review> getListByProductId(Integer product_id, PageUtil pageUtil);
    Review get(Integer review_id);
    Integer getTotal(Review review);
    Integer getTotalByUserId(Integer user_id);
    Integer getTotalByProductId(Integer product_id);

    Integer getTotalByOrderItemId(Integer productOrderItem_id);
}
