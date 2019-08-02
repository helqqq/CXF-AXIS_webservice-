package cn.sm1234.service;

import java.util.List;

import javax.jws.WebService;
import cn.sm1234.model.User;
/**
 * 
 * @author Administrator
 *
 */
@WebService
public interface UserService {
	public int loadUser();
	public void addUser();
	public List listUser();
	public String getXml();
}
