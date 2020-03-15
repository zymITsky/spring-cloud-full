
package com.forezp.client.hystrix;

import com.forezp.client.AuthServiceClient;
import com.forezp.entity.JWT;
import org.springframework.stereotype.Component;

@Component
public class AuthServiceHystrix implements AuthServiceClient {

	@Override
	public JWT getToken(String authorization, String type, String username, String password) {
		System.out.println("--------opps getToken hystrix---------");
		return null;
	}
}