package com.example.movies;

import com.example.movies.client.JsonPlaceholderService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.support.RestClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@SpringBootApplication
public class MoviesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviesApplication.class, args);
	}

	@Bean
	JsonPlaceholderService jsonPlaceholderService() {
		RestClient client = RestClient.create("http://localhost:8080");
		HttpServiceProxyFactory factory = HttpServiceProxyFactory
				.builderFor(RestClientAdapter.create(client))
				.build();
		return factory.createClient(JsonPlaceholderService.class);
	}

}
