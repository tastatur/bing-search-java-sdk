
package com.google.code.bing.search.schema.adapter.jaxb.news;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.google.code.bing.search.schema.news.NewsArticle;
import com.google.code.bing.search.schema.news.NewsArticles;
public class NewsArticlesImpl
    implements Serializable, NewsArticles
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected List<NewsArticle> newsArticleList;

    public List<NewsArticle> getNewsArticleList() {
        if (newsArticleList == null) {
            newsArticleList = new ArrayList<NewsArticle>();
        }
        return this.newsArticleList;
    }

}
