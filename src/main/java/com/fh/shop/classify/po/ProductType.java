package com.fh.shop.classify.po;



import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;


import java.io.Serializable;
@Data
@TableName("t_type")
public class ProductType implements Serializable {
    private Integer id;
    @TableField("typeName")
    private String typeName;
    private Integer pid;
}
