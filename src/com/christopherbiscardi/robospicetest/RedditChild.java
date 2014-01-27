package com.christopherbiscardi.robospicetest;

import java.util.ArrayList;
import java.util.List;

import com.google.api.client.util.Key;

public class RedditChild {
	@Key
	private String kind;
	@Key
	private RedditListing data;



	public RedditChild() {
	}

	public String getKind() {
		return this.kind;
	}

	public RedditListing getData() {
		return this.data;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ( kind == null ? 0 : kind.hashCode() ) + ( data == null ? 0 : data.hashCode() );
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
		RedditChild other = (RedditChild) obj;
		if ( kind == null ) {
			if ( other.kind != null ) {
				return false;
			}
		} else if ( !kind.equals( other.kind ) ) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "RedditChild [kind=" + kind + " " + data + "]";
	}
}
