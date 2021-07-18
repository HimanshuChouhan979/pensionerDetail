package com.pms.pensionerDetail.restClients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

import com.pms.pensionerDetail.model.AuthResponse;

/**
 * To access Authorization microservice
 * 
 */
@FeignClient(name = "authorization-service", url = "http://23pmsauthorization-env.eba-ddmxjprc.us-east-1.elasticbeanstalk.com")
public interface AuthClient {

	@GetMapping("/validate")
	public AuthResponse getValidity(@RequestHeader("Authorization") String token);

}
