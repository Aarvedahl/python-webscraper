package io.github.aarvedahl.twitternewsintegration;

import io.github.aarvedahl.twitternewsintegration.controller.TwitterController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TwitterNewsIntegrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(TwitterNewsIntegrationApplication.class, args);
	}
}
