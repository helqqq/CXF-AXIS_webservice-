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
			//����wsdl·��
			Options options = service.getOptions();
			options.setTo(new EndpointReference(url));
			//���������ռ�͵��õķ�����
			QName qName = new QName(targetNameSpace, "getUserInfo");
			//����������Ϣ��������Ϣ������������Ϣ
			Object[] c = service.invokeBlocking(qName, new Object[]{"helq3"}, new Class[]{String.class});
			System.out.println(c[0]);
		} catch (AxisFault e) {
			e.printStackTrace();
		}
		
	}
}
