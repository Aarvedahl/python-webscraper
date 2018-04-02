package io.github.aarvedahl.twitternewsintegration.controller;

import twitter4j.*;

public class TwitterController {

    public void searchTweets(String string) {
        try {
            Twitter twitter = TwitterFactory.getSingleton();
            // Query query = new Query(string);
            Query query = new Query("source:twitter4j yusukey");
            QueryResult result = twitter.search(query);
            for (Status status : result.getTweets()) {
                System.out.println("@" + status.getUser().getScreenName() + ":" + status.getText());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
