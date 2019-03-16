package com.tjnu.jiaju.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.tjnu.jiaju.dao.AddressMapper;
import com.tjnu.jiaju.entity.Address;
import com.tjnu.jiaju.service.AddressService;

import javax.annotation.Resource;
import java.util.List;

@Service("addressService")
public class AddressServiceImpl implements AddressService{
    private AddressMapper addressMapper;
    @Resource(name = "addressMapper")
    public void setAddressMapper(AddressMapper addressMapper) {
        this.addressMapper = addressMapper;
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public boolean add(Address address) {
        return addressMapper.insertOne(address)>0;
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public boolean update(Address address) {
        return addressMapper.updateOne(address)>0;
    }

    public List<Address> getList(String address_name, String address_regionId) {
        return addressMapper.select(address_name,address_regionId);
    }

    public Address get(String address_areaId) {
        return addressMapper.selectOne(address_areaId);
    }

    public List<Address> getRoot() {
        return addressMapper.selectRoot();
    }
}
