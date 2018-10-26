package com.tms.demo.controller;

import org.apache.logging.log4j.Logger;
import org.hibernate.validator.internal.util.logging.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class ErrorController {
	private static Logger logger = LoggerFactory.getLogger(ErrorController.class);
	
	@ExceptionHandler(Throwable.class)
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	public String exception(final Throwable throwable, final Model model) {
		logger.error("Error encountered while running application", throwable);
		String errorMessage = (throwable != null ? throwable .getMessage(): "Unknown error!");
		model.addAttribute("errorMessage", errorMessage);
		return "error";
	}
}
