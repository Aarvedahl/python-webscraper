package io.github.aarvedahl.twitternewsintegration.util;

import io.github.aarvedahl.twitternewsintegration.dto.TwitterStatus;
import io.github.aarvedahl.twitternewsintegration.dto.TwitterUser;
import twitter4j.Status;
import twitter4j.User;

import java.util.ArrayList;
import java.util.List;

public class TwitterDtoConvert {

    public List<TwitterStatus> getTwitterStatuses(List<Status> statuses) {
        List<TwitterStatus> twitterStatuses = new ArrayList<>();
        statuses.forEach((status) ->twitterStatuses.add(getTwitterStatus(status)));
        return twitterStatuses;
    }


    public TwitterUser getTwitterUser(User user) {
        TwitterUser twitterUser = new TwitterUser();
        twitterUser.setName(user.getName());
        twitterUser.setEmail(user.getEmail());
        twitterUser.setDescription(user.getDescription());
        twitterUser.setLocation(user.getLocation());
        twitterUser.setScreenname(user.getScreenName());
        return twitterUser;
    }

    public TwitterStatus getTwitterStatus(Status status) {
        TwitterStatus twitterStatus = new TwitterStatus();
        twitterStatus.setText(status.getText());
        twitterStatus.setDate(status.getCreatedAt());
        twitterStatus.setRetweeted(status.isRetweeted());
        twitterStatus.setRetweet(status.isRetweet());
        return twitterStatus;
    }
}
