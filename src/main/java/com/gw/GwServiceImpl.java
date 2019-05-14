package com.gw;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @DATA 2019-05-14 14:10
 * @Author 张国伟  WeChat:17630376104
 * @Description
 */
public class GwServiceImpl  implements GwService{
    @Autowired
    GwProperties properties;

    @Override
    public void Hello()
    {
        String name=properties.getName();
        System.out.println(name+"说:你们好啊");
    }
}
