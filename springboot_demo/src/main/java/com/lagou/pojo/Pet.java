package com.lagou.pojo;

import org.springframework.stereotype.Component;

/**
 * @author lane
 * @date 2021年04月18日 下午3:33
 */
@Component
public class Pet {
    // 类型
    private String type;
    // 名称
    private String name;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
