package cn.pelime.hello.spring.cloud.web.admin.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
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

    @HystrixCommand(fallbackMethod = "sayHiError")
    public String sayHi(String message){
        return restTemplate.getForObject("http://HELLO-SPRING-CLOUD-SERVICE-ADMIN/hi?message="+message,String.class);
    }

    public String sayHiError(String message){
        return "Hi，your message is :\"" + message + "\" but request error.";
    }
}
