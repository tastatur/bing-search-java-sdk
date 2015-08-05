/*
 * Copyright 2010 Nabeel Mukhtar 
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 * 
 *  http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 * 
 */

package com.google.code.bing.search.schema.news;

import com.google.code.bing.search.schema.SchemaEntity;

import java.util.List;


/**
 * The Class NewsCollection.
 */
public class NewsCollection
    extends SchemaEntity
{

    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The name. */
    protected String name;
    
    /** The news articles. */
    protected List<NewsArticle> newsArticles;

    /**
     * Gets the name.
     * 
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name.
     * 
     * @param value the new name
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the news articles.
     * 
     * @return the news articles
     */
    public List<NewsArticle> getNewsArticles() {
        return newsArticles;
    }

    /**
     * Sets the news articles.
     * 
     * @param value the new news articles
     */
    public void setNewsArticles(List<NewsArticle> value) {
        this.newsArticles = value;
    }
}
