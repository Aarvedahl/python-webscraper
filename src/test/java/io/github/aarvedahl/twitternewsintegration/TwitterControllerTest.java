package io.github.aarvedahl.twitternewsintegration;

import io.github.aarvedahl.twitternewsintegration.controller.TwitterController;
import org.junit.Before;
import org.junit.Test;

public class TwitterControllerTest {

    TwitterController twitterController;

    @Before
    public void init() {
        twitterController = new TwitterController();
    }


    @Test
    public void searchTweets() {
        twitterController.searchTweets("test");
      //  TwitterStatus status = new TwitterStatus("From pilot to astronaut, Robert H. Lawrence was the first African-American to be selected as an astronaut by any na… https://t.co/FjPEWnh804");
     //   TwitterStatus twitterStatus = twitterController.searchTweets("test");
     //   assertEquals(status.getText(), twitterStatus.getText());
    }





}
