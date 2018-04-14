package io.github.aarvedahl.twitternewsintegration;

import io.github.aarvedahl.twitternewsintegration.controller.TwitterController;
import org.junit.Before;
import org.junit.Test;
import twitter4j.Status;

import java.util.List;
import org.junit.Assert;

import static junit.framework.TestCase.assertEquals;

public class TwitterControllerTest {

    TwitterController twitterController;
    private Object IndexOutOfBoundsException;

    @Before
    public void init() {
        twitterController = new TwitterController();
    }


    @Test
    public void searchRealTweets() {
        List<Status> list = twitterController.searchTweets("20180414 testing");
        assertEquals("20180414 testing", list.get(1).getText());
    }

    @Test(expected = java.lang.IndexOutOfBoundsException.class)
    public void searchNotExisting() {
        List<Status> list = twitterController.searchTweets("aaaalexasd");
        String status = list.get(0).getText();
    }





}
