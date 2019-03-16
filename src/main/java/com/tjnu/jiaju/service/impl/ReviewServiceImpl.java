package com.tjnu.jiaju.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.tjnu.jiaju.dao.ReviewMapper;
import com.tjnu.jiaju.entity.Review;
import com.tjnu.jiaju.service.ReviewService;
import com.tjnu.jiaju.util.PageUtil;

import javax.annotation.Resource;
import java.util.List;

@Service("reviewService")
public class ReviewServiceImpl implements ReviewService{
    private ReviewMapper reviewMapper;
    @Resource(name = "reviewMapper")
    public void setReviewMapper(ReviewMapper reviewMapper) {
        this.reviewMapper = reviewMapper;
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    
    public boolean add(Review review) {
        return reviewMapper.insertOne(review)>0;
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    
    public boolean update(Review review) {
        return reviewMapper.updateOne(review)>0;
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    
    public boolean deleteList(Integer[] review_id_list) {
        return reviewMapper.deleteList(review_id_list)>0;
    }

    
    public List<Review> getList(Review review, PageUtil pageUtil) {
        return reviewMapper.select(review,pageUtil);
    }

    
    public List<Review> getListByUserId(Integer user_id, PageUtil pageUtil) {
        return reviewMapper.selectByUserId(user_id,pageUtil);
    }

    
    public List<Review> getListByProductId(Integer product_id, PageUtil pageUtil) {
        return reviewMapper.selectByProductId(product_id,pageUtil);
    }

    
    public Review get(Integer review_id) {
        return reviewMapper.selectOne(review_id);
    }

    
    public Integer getTotal(Review review) {
        return reviewMapper.selectTotal(review);
    }

    
    public Integer getTotalByUserId(Integer user_id) {
        return reviewMapper.selectTotalByUserId(user_id);
    }

    
    public Integer getTotalByProductId(Integer product_id) {
        return reviewMapper.selectTotalByProductId(product_id);
    }

    
    public Integer getTotalByOrderItemId(Integer productOrderItem_id) {
        return reviewMapper.selectTotalByOrderItemId(productOrderItem_id);
    }
}
