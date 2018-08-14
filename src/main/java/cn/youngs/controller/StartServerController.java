package cn.youngs.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;

/**
 * @Auther: zhanghao
 * @Date: 2018/8/14 21:56
 * @Description:
 * @Version:1.0
 */
@SpringBootApplication
public class StartServerController {
    public static void main(String[] args) {
        SpringApplication.run(StartServerController.class);

        HashSet s = new HashSet();
        s.iterator();
    }

}
