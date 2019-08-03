package com.fh.shop.classify.controller;



import com.fh.shop.classify.ServerResponse;
import com.fh.shop.classify.biz.IProductTypeService;
import com.fh.shop.classify.po.ProductType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("productType/api")
public class ProductTypeController {
    @Resource(name = "productTypeService")
    private IProductTypeService productTypeService;
    
    @GetMapping
    public ServerResponse<List<ProductType>> findProductType (Integer id){
        List<ProductType> productType = productTypeService.findProductType(id);
        return ServerResponse.success(productType);

    }
}
