package com.hsm.dubbo.consumer2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hsm.dubbo.inter.DemoService;

public class Consumer {
	public static void main(String[] args) {
        //测试常规服务
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer2.xml");
        context.start();
        System.out.println("consumer2 start");
        DemoService demoService = context.getBean(DemoService.class);
        System.out.println("consumer2");
        System.out.println(demoService.getPermissions(1L));
    }
}
