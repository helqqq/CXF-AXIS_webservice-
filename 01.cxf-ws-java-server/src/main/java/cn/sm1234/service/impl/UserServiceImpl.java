package cn.sm1234.service.impl;

import java.util.List;

import cn.sm1234.model.User;
import cn.sm1234.service.UserService;

public class UserServiceImpl implements UserService{

	public int loadUser() {
		return 1;
	}

	public void addUser() {
		System.out.println("------------>调用addUser");
		
	}

	public List listUser() {
		return null;
	}

	public String getXml() {
		System.out.println("getXml-----------被调用了");
		String a = "<?xml version=\"1.0\" encoding=\"utf-8\"?><sbp><head><guid>20E4DF9DF41740CB9D6C9F722F14034F</guid><appid>zb</appid><type>return</type><timestamp>20190701031709986</timestamp></head><body><request><data><items><item><year>2019</year><province>520100</province><guid>I20130609</guid><billtypecode>141002</billtypecode><bgtsumid>21342</bgtsumid><bgttypecode>ddd</bgttypecode><projectname>测试</projectname><projectcode>001001</projectcode><bgtsourcecode>002</bgtsourcecode><bgtversioncode>01</bgtversioncode><expfunccode>2012350</expfunccode><agencycode>025001</agencycode><filedate>2019-07-02</filedate><bgtdocnoname>[2019]</bgtdocnoname><govbgtecocode>50201</govbgtecocode><projtypecode>001</projtypecode><procatcode>001</procatcode><mofdepcode>001</mofdepcode><fundtypecode>001</fundtypecode><paytypecode>001001001</paytypecode><bgtamt>15.6</bgtamt><bgtsummaryname>1548641836000</bgtsummaryname><quotadate>2019-07-02</quotadate><payacccode>001</payacccode><hold1code>001</hold1code><hold2code>null</hold2code><hold3code>null</hold3code><hold3code>null</hold3code><hold5code>null</hold5code><hold6code>null</hold6code><hold7code>null</hold7code><hold8code>null</hold8code><hold9code>null</hold9code><hold10code>null</hold10code><purchaseflag>1</purchaseflag><buyserviceflag>2</buyserviceflag><salaryflag>0</salaryflag></item><item><year>2019</year><province>520100</province><guid>I20130610</guid><billtypecode>141002</billtypecode><bgtsumid>ddd</bgtsumid><bgttypecode>ddd</bgttypecode><projectname>测试</projectname><projectcode>001</projectcode><bgtsourcecode>002</bgtsourcecode><bgtversioncode>02</bgtversioncode><expfunccode>2012501</expfunccode><agencycode>028001</agencycode><filedate>2019-07-17</filedate><bgtdocnoname>财务</bgtdocnoname><govbgtecocode>50203</govbgtecocode><projtypecode>rrr</projtypecode><procatcode>dads</procatcode><mofdepcode>002</mofdepcode><fundtypecode>003</fundtypecode><paytypecode>001002001</paytypecode><bgtamt>13.89</bgtamt><bgtsummaryname>1548641836062</bgtsummaryname><quotadate>2019-06-28 00:00:00.0</quotadate><payacccode>好好的</payacccode><hold1code>ddda</hold1code><hold2code>asd</hold2code><hold3code>d</hold3code><hold3code>ads</hold3code><hold5code>d</hold5code><hold6code>d</hold6code><hold7code>d</hold7code><hold8code>null</hold8code><hold9code>null</hold9code><hold10code>null</hold10code><purchaseflag>1</purchaseflag><buyserviceflag>0</buyserviceflag><salaryflag>1</salaryflag></item></items></data></request></body></sbp>";
		return a;
	}

}
