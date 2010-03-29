package com.google.code.bing.search.schema;

import com.google.code.bing.search.schema.instantanswer.InstantAnswer;
import com.google.code.bing.search.schema.instantanswer.InstantAnswerResult;
import com.google.code.bing.search.schema.mobileweb.MobileWeb;
import com.google.code.bing.search.schema.mobileweb.MobileWebRequest;
import com.google.code.bing.search.schema.mobileweb.MobileWebResult;
import com.google.code.bing.search.schema.multimedia.Image;
import com.google.code.bing.search.schema.multimedia.ImageRequest;
import com.google.code.bing.search.schema.multimedia.ImageResult;
import com.google.code.bing.search.schema.multimedia.Thumbnail;
import com.google.code.bing.search.schema.multimedia.Video;
import com.google.code.bing.search.schema.multimedia.VideoRequest;
import com.google.code.bing.search.schema.multimedia.VideoResult;
import com.google.code.bing.search.schema.news.News;
import com.google.code.bing.search.schema.news.NewsArticle;
import com.google.code.bing.search.schema.news.NewsCollection;
import com.google.code.bing.search.schema.news.NewsRelatedSearch;
import com.google.code.bing.search.schema.news.NewsRequest;
import com.google.code.bing.search.schema.news.NewsResult;
import com.google.code.bing.search.schema.phonebook.Phonebook;
import com.google.code.bing.search.schema.phonebook.PhonebookRequest;
import com.google.code.bing.search.schema.phonebook.PhonebookResult;
import com.google.code.bing.search.schema.relatedsearch.RelatedSearch;
import com.google.code.bing.search.schema.relatedsearch.RelatedSearchResult;
import com.google.code.bing.search.schema.spell.Spell;
import com.google.code.bing.search.schema.spell.SpellResult;
import com.google.code.bing.search.schema.translation.Translation;
import com.google.code.bing.search.schema.translation.TranslationRequest;
import com.google.code.bing.search.schema.translation.TranslationResult;
import com.google.code.bing.search.schema.web.DeepLink;
import com.google.code.bing.search.schema.web.Web;
import com.google.code.bing.search.schema.web.WebRequest;
import com.google.code.bing.search.schema.web.WebResult;
import com.google.code.bing.search.schema.web.WebSearchTag;

public interface SchemaElementFactory {

	/**
	 * Create an instance of {@link SpellResult }
	 * 
	 */
	public SpellResult createSpellResult();

	/**
	 * Create an instance of {@link MobileWebRequest }
	 * 
	 */
	public MobileWebRequest createMobileWebRequest();

	/**
	 * Create an instance of {@link PhonebookResult }
	 * 
	 */
	public PhonebookResult createPhonebookResult();

	/**
	 * Create an instance of {@link PhonebookRequest }
	 * 
	 */
	public PhonebookRequest createPhonebookRequest();

	/**
	 * Create an instance of {@link RelatedSearchResult }
	 * 
	 */
	public RelatedSearchResult createRelatedSearchResult();

	/**
	 * Create an instance of {@link PhonebookResponse }
	 * 
	 */
	public Phonebook createPhonebookResponse();

	/**
	 * Create an instance of {@link NewsRelatedSearch }
	 * 
	 */
	public NewsRelatedSearch createNewsRelatedSearch();

	/**
	 * Create an instance of {@link TranslationRequest }
	 * 
	 */
	public TranslationRequest createTranslationRequest();

	/**
	 * Create an instance of {@link NewsCollection }
	 * 
	 */
	public NewsCollection createNewsCollection();

	/**
	 * Create an instance of {@link DeepLink }
	 * 
	 */
	public DeepLink createDeepLink();

	/**
	 * Create an instance of {@link ImageResponse }
	 * 
	 */
	public Image createImageResponse();

	/**
	 * Create an instance of {@link NewsArticle }
	 * 
	 */
	public NewsArticle createNewsArticle();

	/**
	 * Create an instance of {@link TranslationResponse }
	 * 
	 */
	public Translation createTranslationResponse();

	/**
	 * Create an instance of {@link NewsRequest }
	 * 
	 */
	public NewsRequest createNewsRequest();

	/**
	 * Create an instance of {@link WebResult }
	 * 
	 */
	public WebResult createWebResult();

	/**
	 * Create an instance of {@link NewsResult }
	 * 
	 */
	public NewsResult createNewsResult();

	/**
	 * Create an instance of {@link VideoResponse }
	 * 
	 */
	public Video createVideoResponse();

	/**
	 * Create an instance of {@link VideoResult }
	 * 
	 */
	public VideoResult createVideoResult();

	/**
	 * Create an instance of {@link VideoRequest }
	 * 
	 */
	public VideoRequest createVideoRequest();

	/**
	 * Create an instance of {@link TranslationResult }
	 * 
	 */
	public TranslationResult createTranslationResult();

	/**
	 * Create an instance of {@link WebSearchTag }
	 * 
	 */
	public WebSearchTag createWebSearchTag();

	/**
	 * Create an instance of {@link SearchResponse }
	 * 
	 */
	public SearchResponse createSearchResponse();

	/**
	 * Create an instance of {@link NewsResponse }
	 * 
	 */
	public News createNewsResponse();

	/**
	 * Create an instance of {@link WebRequest }
	 * 
	 */
	public WebRequest createWebRequest();

	/**
	 * Create an instance of {@link ImageRequest }
	 * 
	 */
	public ImageRequest createImageRequest();

	/**
	 * Create an instance of {@link Query }
	 * 
	 */
	public Query createQuery();

	/**
	 * Create an instance of {@link MobileWebResponse }
	 * 
	 */
	public MobileWeb createMobileWebResponse();

	/**
	 * Create an instance of {@link WebResponse }
	 * 
	 */
	public Web createWebResponse();

	/**
	 * Create an instance of {@link RelatedSearchResponse }
	 * 
	 */
	public RelatedSearch createRelatedSearchResponse();

	/**
	 * Create an instance of {@link InstantAnswerResult }
	 * 
	 */
	public InstantAnswerResult createInstantAnswerResult();

	/**
	 * Create an instance of {@link Thumbnail }
	 * 
	 */
	public Thumbnail createThumbnail();

	/**
	 * Create an instance of {@link SpellResponse }
	 * 
	 */
	public Spell createSpellResponse();

	/**
	 * Create an instance of {@link SearchRequest }
	 * 
	 */
	public SearchRequest createSearchRequest();

	/**
	 * Create an instance of {@link InstantAnswerResponse }
	 * 
	 */
	public InstantAnswer createInstantAnswerResponse();

	/**
	 * Create an instance of {@link MobileWebResult }
	 * 
	 */
	public MobileWebResult createMobileWebResult();

	/**
	 * Create an instance of {@link Error }
	 * 
	 */
	public Error createError();

	/**
	 * Create an instance of {@link ImageResult }
	 * 
	 */
	public ImageResult createImageResult();

}