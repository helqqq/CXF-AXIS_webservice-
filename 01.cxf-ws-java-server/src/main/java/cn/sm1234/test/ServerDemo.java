package cn.sm1234.test;

import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

import cn.sm1234.service.UserService;
import cn.sm1234.service.impl.UserServiceImpl;

public class ServerDemo {
	public static void main(String[] args) {
		JaxWsServerFactoryBean factory = new JaxWsServerFactoryBean();
		//设置参数
		//设置访问地址
		factory.setAddress("http://localhost:8080/userService");
		//设置接口类型
		factory.setServiceClass(UserService.class);
		//设置实现类对象
		factory.setServiceBean(new UserServiceImpl());
		//发布接口
		factory.create();
		System.out.println("发布成功......");
	}
}
