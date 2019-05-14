package com.gw;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @DATA 2019-05-14 14:08
 * @Author 张国伟  WeChat:17630376104
 * @Description
 */
@Configuration
@ConditionalOnClass(GwService.class)  //扫描类
@EnableConfigurationProperties(GwProperties.class) //让配置类生效
public class GwAutoConfiguration {

    /**
    * 功能描述 托管给spring
    * @author zgw
    * @return
    */
    @Bean
    @ConditionalOnMissingBean
    public GwService gwService()
    {
        return new GwServiceImpl();
    }
}
