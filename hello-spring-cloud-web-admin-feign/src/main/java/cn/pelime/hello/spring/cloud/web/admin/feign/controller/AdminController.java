package cn.pelime.hello.spring.cloud.web.admin.feign.controller;

import cn.pelime.hello.spring.cloud.web.admin.feign.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：xcx
 * @date ：Created in 2019/8/27 0027 上午 11:06
 * @Description :
 * @modified By：
 * @version: 1.0
 */
@RestController
public class AdminController {
    @Autowired
    AdminService adminService;

    @RequestMapping(value = "hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam("message") String message){
        return adminService.sayHi(message);
    }
}
