package com.docu.ocr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by cpl on 2020/9/26.
 */
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan("com.docu.ocr")
public class BootStart {



    public static void main(String[] args){
        SpringApplication.run(BootStart.class, args);
    }
}
