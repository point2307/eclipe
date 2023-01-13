package com.ezen.biz.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ezen.biz.dto.UserVO;
import com.ezen.biz.dao.*;

@Service("userService")  //(2) 어노테이션 방식으로 객체 생성시
public class UserServiceImpl implements UserService {

	@Autowired //(2) 어노테이션 방식으로 객체 생성(의존성 주입)
	private UserDAO uDao;
	
	@Override
	public UserVO getUser(UserVO uvo) {
		return uDao.getUser(uvo);
	}

	public void setuDao(UserDAO uDao) {
		this.uDao = uDao;
	}
	


}
