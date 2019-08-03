package com.fh.shop.classify.biz;


import com.fh.shop.classify.po.ProductType;

import java.util.List;

public interface IProductTypeService {

    public List<ProductType> findProductType(Integer id);
}
