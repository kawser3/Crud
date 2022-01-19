package com.crud.Crud.service;

import com.crud.Crud.model.User;
import com.crud.Crud.web.dto.UserRegistrationDto;

public interface UserService {
	User save(UserRegistrationDto registrationDto);

}
