package com.aberdeenuni.acse;
public abstract class FeedParserFactory 
{
	static String newsUrl = "http://www.aces.ac.uk/news/rss.xml";
	static String eventUrl = "http://www.aces.ac.uk/events/rss.xml";
    static String facebookUrl = "http://www.facebook.com/feeds/page.php?id=128412697209351&format=rss20";
    static String youtubeUrl = "http://gdata.youtube.com/feeds/base/users/AberdeenCES/uploads?alt=rss&amp;v=2&amp;orderby=published&amp;client=ytapi-youtube-profile";
    //static String slideshareUrl = "http://www.slideshare.net/rss/user/AberdeenCES";
    static String slideshareUrl = "http://www.slideshare.net/rss/user/AberdeenCES/presentations";
    static String guardianUrl = "http://www.guardian.co.uk/environment/rss";
    static String bbcUrl = "http://feeds.bbci.co.uk/news/science_and_environment/rss.xml#";
    static String reutersUrl = "http://feeds.reuters.com/reuters/scienceNews";
    static String reluUrl = "http://planetearth.nerc.ac.uk/rss/multimedia.xml";
    static String pppcUrl = "http://homepages.see.leeds.ac.uk/~lecmsr/SOEE2400/RSS.xml";
    
	public static FeedParser getParser(ParserType type)
	{
	    switch (type)
	    {
		    case ANDROID_SAX_NEWS:
				return new AndroidSaxFeedParser(newsUrl);
			case ANDROID_SAX_EVENTS:
				return new AndroidSaxFeedParser(eventUrl);
			case ANDROID_SAX_FACEBOOK:
			    return new AndroidSaxFeedParser(facebookUrl);
            case ANDROID_SAX_YOUTUBE:
                return new AndroidSaxFeedParser(youtubeUrl);	
            case ANDROID_SAX_SLIDESHARE:
                return new AndroidSaxFeedParser(slideshareUrl);                		    
            case ANDROID_SAX_GUARDIAN:
                return new AndroidSaxFeedParser(guardianUrl);                		                    
            case ANDROID_SAX_BBC:
                return new AndroidSaxFeedParser(bbcUrl); 
            case ANDROID_SAX_REUTERS:
                return new AndroidSaxFeedParser(reutersUrl); 
            case ANDROID_SAX_RELU:
                return new AndroidSaxFeedParser(reluUrl);   
            case ANDROID_SAX_PPPC:
                return new AndroidSaxFeedParser(pppcUrl);                                 
		    default : return null;
        }				
	}
}

