package cn.pelime.hello.spring.cloud.web.admin.ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author ：xcx
 * @date ：Created in 2019/8/27 0027 上午 10:51
 * @Description :
 * @modified By：
 * @version: 1.0
 */
@Service
public class AdminService {
    @Autowired
    RestTemplate restTemplate;

    public String sayHi(String message){
        return restTemplate.getForObject("http://HELLO-SPRING-CLOUD-SERVICE-ADMIN/hi?message="+message,String.class);
    }
}
