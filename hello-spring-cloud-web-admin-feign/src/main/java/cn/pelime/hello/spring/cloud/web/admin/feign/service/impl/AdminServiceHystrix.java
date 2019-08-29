package cn.pelime.hello.spring.cloud.web.admin.feign.service.impl;

import cn.pelime.hello.spring.cloud.web.admin.feign.service.AdminService;
import org.springframework.stereotype.Component;

/**
 * @author ：xcx
 * @date ：Created in 2019/8/29 0029 上午 10:17
 * @Description :
 * @modified By：
 * @version: 1.0
 */
@Component
public class AdminServiceHystrix implements AdminService {
    @Override
    public String sayHi(String message) {
        return "Hi，your message is :\"" + message + "\" but request error.";
    }
}
