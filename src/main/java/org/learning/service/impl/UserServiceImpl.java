package org.learning.service.impl;

import org.learning.service.UserService;
import org.learning.vo.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	@Override
	public User getUser() {
		User val = new User();
		val.setUserId("101");
		val.setMobile("9535487543");
		val.setUserName("John");
		return val;
	}

	@Override
	public User updateUser() {
		User val = new User();
		val.setMsg("User Updated Successfully");
		return val;
	}

}
