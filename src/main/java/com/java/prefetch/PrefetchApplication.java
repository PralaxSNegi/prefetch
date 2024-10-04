package com.java.prefetch;

import com.java.prefetch.util.PrefetchUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PrefetchApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrefetchApplication.class, args);
	}

	@Bean
	public PrefetchUtil getInstance(){
		return new PrefetchUtil();
	}

}
