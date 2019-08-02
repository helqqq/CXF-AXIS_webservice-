package com.helq3.client;

import javax.xml.namespace.QName;

import org.apache.axis2.AxisFault;
import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.client.Options;
import org.apache.axis2.rpc.client.RPCServiceClient;

public class ClientDemo {
	private static final String url="http://localhost:8080/axis2/services/AxisService?wsdl";
	private static final String targetNameSpace = "http://impl.service.helq3.com";
	public static void main(String[] args) {
		testRpc();
	}
	public static void testRpc(){
		try {
			RPCServiceClient service = new RPCServiceClient();
			//设置wsdl路径
			Options options = service.getOptions();
			options.setTo(new EndpointReference(url));
			//设置命名空间和调用的方法名
			QName qName = new QName(targetNameSpace, "getUserInfo");
			//设置名称信息，参数信息，参数类型信息
			Object[] c = service.invokeBlocking(qName, new Object[]{"helq3"}, new Class[]{String.class});
			System.out.println(c[0]);
		} catch (AxisFault e) {
			e.printStackTrace();
		}
		
	}
}
