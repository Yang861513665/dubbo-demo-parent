package com.yxj.dubbo.entity;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * @author yangxj
 * @date 2019/7/6-22:09
 */
@Data
@Builder
public class User implements Serializable {
    private String name;
    private int age;
}
