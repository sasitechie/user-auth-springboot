package org.learning.service;

import org.learning.vo.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

	User getUser();

	User updateUser();

}
