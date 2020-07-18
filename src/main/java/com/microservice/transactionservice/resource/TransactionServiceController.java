package com.microservice.transactionservice.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transaction-service")
public class TransactionServiceController {

	@GetMapping("/message")
	public String test() {
		return "Hello from Transaction-Service Service";
	}
}
