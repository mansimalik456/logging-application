package com.loggingDemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogerSource {
	
	Logger logger = LoggerFactory.getLogger(LogerSource.class);
	@RequestMapping("/")
	public String home() {
		logger.trace("This is a TRACE statement");
		logger.debug("This is a DEBUG statement");
		logger.info("This is a INFO statement");
		logger.warn("This is a WARN statement");
		logger.error("This is a ERROR statement");
	
		return "Hello Readers";
	}

}
