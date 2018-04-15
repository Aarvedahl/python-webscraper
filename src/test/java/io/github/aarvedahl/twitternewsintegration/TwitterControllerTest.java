package io.github.aarvedahl.twitternewsintegration;

import io.github.aarvedahl.twitternewsintegration.controller.TwitterController;
import org.junit.Before;
import org.junit.Test;
import twitter4j.Status;

import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class TwitterControllerTest {

    TwitterController twitterController;

    @Before
    public void init() {
        twitterController = new TwitterController();
    }


    @Test
    public void searchRealTweets() {
        List<Status> list = twitterController.searchTweets("aarvedahl twitter4j");
        assertEquals("Twitter4j Testing 1 2 3", list.get(1).getText());
    }

    // Change so we add a status if there was no search result and with that, perhaps map all objects from twitter4j status to twitterstatus so we dont send a lot of dumb information
    @Test(expected = java.lang.IndexOutOfBoundsException.class)
    public void searchNotExisting() {
        List<Status> list = twitterController.searchTweets("aarvedahl aaaalexasd");
        String status = list.get(0).getText();
    }

    @Test
    public void getUserTimeline() {
        List<Status> list = twitterController.getUserTimeLine("AArvedahl");
        assertEquals("Twitter4j Testing 1 2 3", list.get(2).getText());
    }




}
