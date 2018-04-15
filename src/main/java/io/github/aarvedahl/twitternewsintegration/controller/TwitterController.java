package io.github.aarvedahl.twitternewsintegration.controller;



import io.github.aarvedahl.twitternewsintegration.dto.TwitterStatus;
import io.github.aarvedahl.twitternewsintegration.dto.TwitterUser;
import twitter4j.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TwitterController {


    public List<Status> searchTweets(String searchTweets) {
        List<Status> list = new LinkedList<>();
        Twitter twitter = TwitterFactory.getSingleton();
        Query query = new Query(searchTweets);
        try{
            QueryResult result = twitter.search(query);
            for (Status status : result.getTweets()) {
                list.add(status);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public List<Status> getUserTimeLine(String username) {
        Twitter twitter = new TwitterFactory().getInstance();
        List<Status> statuses;
        try {
            String user;
            if (username.length() >= 1) {
                user = username;
                statuses = twitter.getUserTimeline(user);
            } else {
                user = twitter.verifyCredentials().getScreenName();
                statuses = twitter.getUserTimeline();
            }
            System.out.println("Showing @" + user + "'s user timeline.");
            for (Status status : statuses) {
                System.out.println("@" + status.getUser().getScreenName() + " - " + status.getText());
            }
            return statuses;
        } catch (TwitterException te) {
            te.printStackTrace();
            System.out.println("Failed to get timeline: " + te.getMessage());
            System.exit(-1);
            return new ArrayList<>();
        }

    }



}
