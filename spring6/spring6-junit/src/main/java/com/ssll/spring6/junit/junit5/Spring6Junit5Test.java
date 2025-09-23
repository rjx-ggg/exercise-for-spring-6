package com.ssll.spring6.junit.junit5;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * ClassName: Spring6Junit6Test
 * Description:
 *
 * @Author 染染熊
 * @Version 1.0
 * @Create 2025/9/23 22:24
 */
//两种方式均可
//方式一
//@ExtendWith(SpringExtension.class)
//@ContextConfiguration("classpath:beans.xml")
//方式二
@SpringJUnitConfig(locations = "classpath:bean.xml")
public class Spring6Junit5Test {

    @Autowired
    private User user;

    @Test
    public void testUser(){
        user.run();
    }



}
