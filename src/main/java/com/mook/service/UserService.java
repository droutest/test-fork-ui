package com.mook.service;

import com.mook.domain.User;

public interface UserService {
	User login(String name, String password);
}
