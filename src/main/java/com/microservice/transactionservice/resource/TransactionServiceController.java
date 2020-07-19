package com.microservice.transactionservice.resource;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transaction-service")
public class TransactionServiceController {

	@GetMapping("/message")
	public String test(HttpServletRequest request, HttpServletResponse response) {
		Enumeration<String> headers = request.getHeaderNames();
		while(headers.hasMoreElements()) {
			String headerKey = headers.nextElement();
			String headerValue = request.getHeader(headerKey);
			System.out.println(headerKey +" : "+headerValue);
		}
		return "Hello from Transaction-Service Service";
	}
}
