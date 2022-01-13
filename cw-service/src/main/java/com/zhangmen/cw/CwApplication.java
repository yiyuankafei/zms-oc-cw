package com.zhangmen.cw;

@EnableSolarService
public class CwApplication extends SpringBootServletInitializer implements CommandLineRunner {

    public static void main(String[] args) {
        new SpringApplicationBuilder(EpApplication.class).run(args);
    }

    @Override
    public void run(String... args) {
        System.out.println("SAAS备课系统-试卷服务启动完成...");
    }

}
