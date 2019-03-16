package com.tjnu.jiaju.service;

import java.util.List;

import com.tjnu.jiaju.entity.Admin;
import com.tjnu.jiaju.util.PageUtil;

public interface AdminService {
    boolean add(Admin admin);
    boolean update(Admin admin);

    List<Admin> getList(String admin_name, PageUtil pageUtil);
    Admin get(String admin_name, Integer admin_id);
    Admin login(String admin_name, String admin_password);
    Integer getTotal(String admin_name);
}
