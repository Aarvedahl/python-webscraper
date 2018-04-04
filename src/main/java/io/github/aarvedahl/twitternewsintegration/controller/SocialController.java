package io.github.aarvedahl.twitternewsintegration.controller;

import io.github.aarvedahl.twitternewsintegration.dto.Post;
import io.github.aarvedahl.twitternewsintegration.dto.User;

public abstract class SocialController {
    
    public abstract User findUser(String name);

    public abstract Post findPosts(String hashtag);


}
