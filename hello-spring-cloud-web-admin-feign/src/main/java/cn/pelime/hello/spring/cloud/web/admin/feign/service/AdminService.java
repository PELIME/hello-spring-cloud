package cn.pelime.hello.spring.cloud.web.admin.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author ：xcx
 * @date ：Created in 2019/8/27 0027 上午 11:03
 * @Description :
 * @modified By：
 * @version: 1.0
 */
@FeignClient(value ="hello-spring-cloud-service-admin")
public interface AdminService {
    @RequestMapping(value = "hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam("message") String message);
}
