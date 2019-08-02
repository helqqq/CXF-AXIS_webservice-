package com.helq3.test;

import java.rmi.RemoteException;

import javax.xml.namespace.QName;
import javax.xml.rpc.ParameterMode;
import javax.xml.rpc.ServiceException;
import javax.xml.rpc.encoding.XMLType;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;

public class ClientDemo {
	public static final String url = "http://localhost:8080/axis2/services/AxisService?wsdl";

	public static void main(String[] args) {
		testAxis2Service();
		testAxis1_4Service();
	}
	public static void testAxis2Service() {
		Service service = new Service();
		Call call = null;
		try {
			call = (Call) service.createCall();
			call.setTargetEndpointAddress(url);
			QName qName = new QName("http://impl.service.helq3.com",
					"getUserInfo");
			call.setOperationName(qName);
			Object result = null;
			try {
				result = call.invoke(new Object[] { "Ð¡ºÚ" });
				System.out.println(result.toString());
			} catch (RemoteException e) {
				e.printStackTrace();
			}
		} catch (ServiceException e) {
			e.printStackTrace();
		}
	}
	public static void testAxis1_4Service() {
		Service service = new Service();
		Call call = null;
		try {
			call = (Call) service.createCall();
			call.setTargetEndpointAddress(new java.net.URL(url));
			QName qName = new QName("http://impl.service.helq3.com","getUserInfo");
			call.setOperationName(qName);
			call.addParameter("userids", XMLType.XSD_STRING, ParameterMode.IN);
			call.setReturnType(XMLType.XSD_STRING);
			Object result = call.invoke(new Object[] { "Ð¡¼ª" });
			System.out.println(result.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
