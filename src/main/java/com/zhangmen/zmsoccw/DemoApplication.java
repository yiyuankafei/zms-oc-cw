package com.zhangmen.zmsoccw;

import com.zhangmen.solar.framework.service.annotation.EnableSolarService;
import org.springframework.boot.builder.SpringApplicationBuilder;

@EnableSolarService
public class DemoApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(DemoApplication.class).run(args);
	}
}
