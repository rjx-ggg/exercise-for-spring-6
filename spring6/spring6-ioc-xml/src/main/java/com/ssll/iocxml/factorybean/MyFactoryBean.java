package com.ssll.iocxml.factorybean;

import org.springframework.beans.factory.FactoryBean;

/**
 * ClassName: MyFactoryBean
 * Description:
 *
 * @Author 染染熊
 * @Version 1.0
 * @Create 2025/9/9 22:57
 */
public class MyFactoryBean implements FactoryBean<UserBean> {
    @Override
    public UserBean getObject() throws Exception {
        return new UserBean();
    }

    @Override
    public Class<?> getObjectType() {
        return UserBean.class;
    }
}
