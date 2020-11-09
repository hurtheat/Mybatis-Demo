package com.kyg.pojo;

import lombok.Data;

import java.util.List;

/**
 * @author kyg
 * @version 1.0
 * @description
 * @since 2020/11/9 15:48
 */
@Data
public class Product {

    private Integer id;

    private String name;

    private Double price;

    private List<Order> orders;

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
