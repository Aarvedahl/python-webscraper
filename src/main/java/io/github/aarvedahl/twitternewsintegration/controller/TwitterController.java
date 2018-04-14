package io.github.aarvedahl.twitternewsintegration.controller;



import twitter4j.*;

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


}
