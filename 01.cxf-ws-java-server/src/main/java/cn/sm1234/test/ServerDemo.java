package cn.sm1234.test;

import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

import cn.sm1234.service.UserService;
import cn.sm1234.service.impl.UserServiceImpl;

public class ServerDemo {
	public static void main(String[] args) {
		JaxWsServerFactoryBean factory = new JaxWsServerFactoryBean();
		//���ò���
		//���÷��ʵ�ַ
		factory.setAddress("http://localhost:8080/userService");
		//���ýӿ�����
		factory.setServiceClass(UserService.class);
		//����ʵ�������
		factory.setServiceBean(new UserServiceImpl());
		//�����ӿ�
		factory.create();
		System.out.println("�����ɹ�......");
	}
}
