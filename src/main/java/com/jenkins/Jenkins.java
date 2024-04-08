package com.jenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Jenkins {
	@GetMapping("/MyJenkins")
	public String getTo() {
		return "SUCCESFULLY RUN JENKINS";
	}
	

}
