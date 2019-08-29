package cn.pelime.hello.spring.cloud.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author ：xcx
 * @date ：Created in 2019/8/29 0029 上午 11:21
 * @Description :
 * @modified By：
 * @version: 1.0
 */
@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class ConfigApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigApplication.class,args);
    }
}
