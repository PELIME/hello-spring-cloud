package cn.pelime.hello.spring.cloud.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import zipkin.server.internal.EnableZipkinServer;

/**
 * @author ：xcx
 * @date ：Created in 2019/8/29 0029 下午 2:18
 * @Description :
 * @modified By：
 * @version: 1.0
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZipkinServer
public class ZipKinApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZipKinApplication.class,args);
    }
}
