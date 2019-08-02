package com.helq3.service;

import javax.jws.WebService;

@WebService
public interface UserService {
	public String getUserInfo(String userids);
}
