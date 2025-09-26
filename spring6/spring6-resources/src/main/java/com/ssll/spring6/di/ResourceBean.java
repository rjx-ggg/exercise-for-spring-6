package com.ssll.spring6.di;

import org.springframework.core.io.Resource;

/**
 * ClassName: ResourceBean
 * Description:
 *
 * @Author 染染熊
 * @Version 1.0
 * @Create 2025/9/25 23:49
 */
public class ResourceBean {

    private Resource res;

    public void setRes(Resource res) {
        this.res = res;
    }
    public Resource getRes() {
        return res;
    }

    public void parse(){
        System.out.println(res.getFilename());
        System.out.println(res.getDescription());
    }

}
