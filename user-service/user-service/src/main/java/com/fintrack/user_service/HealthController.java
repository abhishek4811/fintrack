package com.fintrack.user_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/apin/health")
public class HealthController {
	@GetMapping
	public String chekcHealth() {
		return "user-service is running";
	}
}
