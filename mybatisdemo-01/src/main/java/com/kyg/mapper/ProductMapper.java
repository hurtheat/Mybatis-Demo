package com.kyg.mapper;

import com.kyg.pojo.Product;

import java.util.List;

/**
 * @author kyg
 * @version 1.0
 * @description
 * @since 2020/11/9 15:46
 */
public interface ProductMapper {
    List<Product> getProductById(Integer id);
}
