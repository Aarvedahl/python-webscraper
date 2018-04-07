package io.github.aarvedahl.twitternewsintegration.controller;

import io.github.aarvedahl.twitternewsintegration.dto.Post;
import io.github.aarvedahl.twitternewsintegration.dto.AbstractUser;

public abstract class SocialController {

    public abstract AbstractUser findUser(String name);

    public abstract Post findPosts(String hashtag);


}
