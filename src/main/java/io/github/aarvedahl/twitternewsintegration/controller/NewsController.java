package io.github.aarvedahl.twitternewsintegration.controller;

import io.github.aarvedahl.twitternewsintegration.dto.Article;

public abstract class NewsController {

    public abstract Article topArticles();

    public abstract Article relatedArticles(Article article);

    public abstract Article articlesByCategory(String category);
}
