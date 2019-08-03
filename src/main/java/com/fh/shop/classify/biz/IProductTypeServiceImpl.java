package com.fh.shop.classify.biz;


import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.fh.shop.classify.mapper.IProductTypeMapper;
import com.fh.shop.classify.po.ProductType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("productTypeService")
public class IProductTypeServiceImpl implements IProductTypeService {

    @Autowired
    private IProductTypeMapper iProductTypeMapper;
    public List<ProductType> findProductType(Integer id) {
        EntityWrapper<ProductType> wrapper = new EntityWrapper<>();
        wrapper.eq("pid",id);
        List<ProductType> productTypes =iProductTypeMapper.selectList(wrapper);
        return productTypes;
    }
}
