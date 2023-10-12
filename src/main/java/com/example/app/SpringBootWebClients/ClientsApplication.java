package com.example.app.SpringBootWebClients;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.Banner;
import org.springframework.boot.builder.SpringApplicationBuilder;

import java.util.logging.Logger;

@SpringBootApplication
public class ClientsApplication {

	private static final Logger LOGGER =
			Logger.getLogger(ClientsApplication.class.getName());

	public static void main(String[] args) {
		new SpringApplicationBuilder(ClientsApplication.class)
				.bannerMode(Banner.Mode.OFF)
						.run(args);
		LOGGER.info("APP is running...");
	}
}
