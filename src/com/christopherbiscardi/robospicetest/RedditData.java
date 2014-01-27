package com.christopherbiscardi.robospicetest;

import java.util.ArrayList;
import java.util.List;

import com.google.api.client.util.Key;

public class RedditData {
	@Key
	private String modhash;
	@Key
	private ArrayList<RedditChild> children;
	@Key
	private String after;
	@Key
	private String before;

	public RedditData() {
	}

	public String getModhash() {
		return this.modhash;
	}

	public List<RedditChild> getChildren() {
		return this.children;
	}
	
	public String getAfter() {
		return this.after;
	}
	public String getBefore() {
		return this.before;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ( modhash == null ? 0 : modhash.hashCode() ) + ( children == null ? 0 : children.hashCode() );
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
		RedditData other = (RedditData) obj;
		if ( modhash == null ) {
			if ( other.modhash != null ) {
				return false;
			}
		} else if ( !modhash.equals( other.modhash ) ) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "RedditData [modhash=" + modhash + " " + children + "]";
	}
}
