package com.app.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

	InetAddress localHost;

	@GetMapping("/welcome")
	public String welcome() {
		try {
			localHost = InetAddress.getLocalHost();
		} catch (UnknownHostException e) {
			System.err.println("Error getting hostname: " + e.getMessage());
		}
		return "application deployed successfully on" + localHost.getHostName();
	}

}
