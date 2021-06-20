package com.lagou.config;

/**
 * @author lane
 * @date 2021年04月20日 上午11:03
 */
public class JarObject {

    private String name;
    private String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "JarObject{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}



