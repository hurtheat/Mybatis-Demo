package com.kyg.pojo;

import lombok.Data;

import java.util.List;

/**
 * @author kyg
 * @version 1.0
 * @description
 * @since 2020/11/9 15:51
 */
@Data
public class Order {

    private Integer id;

    private String number;

    private List<Product> products;

}
