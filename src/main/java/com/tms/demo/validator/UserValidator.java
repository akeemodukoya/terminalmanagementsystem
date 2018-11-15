package com.tms.demo.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.tms.demo.model.User;
import com.tms.demo.service.TmsService;

@Component
public class UserValidator implements Validator{
	@Autowired
	private TmsService tmsService;
	
	@Override
	public boolean supports(Class<?> aClass) {
		return User.class.equals(aClass);
	}
	
	@Override
	public void validate(Object o, Errors errors) {
		User user = (User) 0;
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "NotEmpty");
		if (user.getEmail().length() < 6 || user.getEmail().length() > 32) {
			errors.rejectValue("email", "Size.userFrom.email");
		}
		if (tmsService.findByEmail(user.getEmail()) != null) {
			errors.rejectValue("email", "Duplicate.userFrom.email");
		}
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "NotEmpty");
		if (user.getPassword().length() < 8 || user.getPassword().length() > 32) {
			errors.rejectValue("password", "Size.userFrom.password");
		}
	}
}
