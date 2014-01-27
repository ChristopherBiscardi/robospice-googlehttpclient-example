package com.christopherbiscardi.robospicetest;

import com.google.api.client.util.Key;

public class RedditListing {
	@Key
	private String domain;
    @Key
	private String author;
    @Key
	private String permalink;
    @Key
	private String title;
    
    public RedditListing() {
	}

	public String getDomain() {
		return this.domain;
	}
	public String getAuthor() {
		return this.author;
	}
	public String getPermalink() {
		return this.permalink;
	}
	public String getTitle() {
		return this.title;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ( domain == null ? 0 : domain.hashCode() ) + ( permalink == null ? 0 : permalink.hashCode() );
		return result;
	}

	@Override
	public boolean equals( Object obj ) {
		if ( this == obj ) {
			return true;
		}
		if ( obj == null ) {
			return false;
		}
		if ( getClass() != obj.getClass() ) {
			return false;
		}
		RedditListing other = (RedditListing) obj;
		if ( domain == null ) {
			if ( other.domain != null ) {
				return false;
			}
		} else if ( !domain.equals( other.domain ) ) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "RedditListing [domain=" + domain + " author=" + author + " title=" + title + " permalink" + permalink + "]";
	}
}
