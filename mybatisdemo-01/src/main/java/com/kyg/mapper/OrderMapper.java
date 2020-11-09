package com.kyg.mapper;

import com.kyg.pojo.Order;

/**
 * @author kyg
 * @version 1.0
 * @description
 * @since 2020/11/9 16:13
 */
public interface OrderMapper {
    Order getOrderById(Integer id);
}
