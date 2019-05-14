package com.gw;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @DATA 2019-05-14 14:01
 * @Author 张国伟  WeChat:17630376104
 * @Description 配置类
 */
@Component
@ConfigurationProperties(prefix = "spring.gwname")
public class GwProperties {

    String name="zgw";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
