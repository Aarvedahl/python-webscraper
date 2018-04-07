package io.github.aarvedahl.twitternewsintegration;

import io.github.aarvedahl.twitternewsintegration.controller.TwitterController;
import io.github.aarvedahl.twitternewsintegration.dto.Status;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TwitterControllerTest {

    TwitterController twitterController;

    @Before
    public void init() {
        twitterController = new TwitterController();
    }


    @Test
    public void searchTweets() {
        Status status = new Status("From pilot to astronaut, Robert H. Lawrence was the first African-American to be selected as an astronaut by any na… https://t.co/FjPEWnh804");
        Status twitterStatus = twitterController.searchTweets("test");
        assertEquals(status.getText(), twitterStatus.getText());
    }





}
