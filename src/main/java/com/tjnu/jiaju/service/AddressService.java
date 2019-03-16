package com.tjnu.jiaju.service;

import java.util.List;

import com.tjnu.jiaju.entity.Address;

public interface AddressService {
    boolean add(Address address);
    boolean update(Address address);

    List<Address> getList(String address_name, String address_regionId);
    Address get(String address_areaId);
    List<Address> getRoot();
}
