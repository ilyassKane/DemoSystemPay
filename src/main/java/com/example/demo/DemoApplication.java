package com.example.demo;

import com.lyra.rest.client.Client;
import com.lyra.rest.client.ClientConfiguration;
import com.lyra.rest.client.ClientResource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		String username="73239078";
		String password="testpassword_SbEbeOueaMDyg8Rtei1bSaiB5lms9V0ZDjzldGXGAnIwH";
		System.out.println("password : "+password);

		Map<String, Object> parameters = new HashMap();
		parameters.put("amount", 100);
		parameters.put("currency", "EUR");

		String result = Client.post(ClientResource.CREATE_PAYMENT.toString(), parameters);
		System.out.println("RESULT : "+result);
	}

}
