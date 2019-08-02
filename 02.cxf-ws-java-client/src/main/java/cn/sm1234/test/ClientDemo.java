package cn.sm1234.test;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;

import cn.sm1234.service.UserService;

public class ClientDemo {
	public static void main(String[] args) {
		//��̬����webservice�ӿ�
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setServiceClass(UserService.class);
		factory.setAddress("http://localhost:8080/userService?wsdl");
		UserService userService = (UserService) factory.create();
		userService.addUser();
		//��̬����webservice�ӿ�
		JaxWsDynamicClientFactory clientFactory = JaxWsDynamicClientFactory.newInstance();
		//���wsdl��ַ
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
