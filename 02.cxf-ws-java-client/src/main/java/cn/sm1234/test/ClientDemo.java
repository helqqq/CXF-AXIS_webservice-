package cn.sm1234.test;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;

import cn.sm1234.service.UserService;

public class ClientDemo {
	public static void main(String[] args) {
		//静态调用webservice接口
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setServiceClass(UserService.class);
		factory.setAddress("http://localhost:8080/userService?wsdl");
		UserService userService = (UserService) factory.create();
		userService.addUser();
		//动态调用webservice接口
		JaxWsDynamicClientFactory clientFactory = JaxWsDynamicClientFactory.newInstance();
		//你的wsdl地址
		Client client = clientFactory.createClient("http://localhost:8080/userService?wsdl");
		Object[] res = null;
		try {
			res = client.invoke("getXml", new Object[]{});//.invoke("getXml",null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(res[0]);
	}
}
