package com.lagou.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author lane
 * @date 2021年10月21日 下午3:48
 */
@Data
public class User implements Serializable {

    private int id;

    private String username;

    private int age;
}
