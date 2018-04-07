package io.github.aarvedahl.twitternewsintegration.controller;


import io.github.aarvedahl.twitternewsintegration.dto.Status;
import org.springframework.web.client.RestTemplate;

public class TwitterController {
    RestTemplate template;

    public Status searchTweets(String searchTweets) {
        // Set the correct header
        template  = new RestTemplate();
        Status status = template.getForObject("https://api.twitter.com/1.1/search/tweets.json?q=nasa&result_type=popular", Status.class);
        return status;
    }
}
