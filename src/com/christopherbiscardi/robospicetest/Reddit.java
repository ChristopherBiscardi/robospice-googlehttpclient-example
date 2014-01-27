package com.christopherbiscardi.robospicetest;

import com.google.api.client.util.Key;

public class Reddit {
	@Key
	private String kind;
	@Key
	private RedditData data;

	public Reddit() {
	}

	public String getKind() {
		return this.kind;
	}

	public RedditData getData() {
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
		Reddit other = (Reddit) obj;
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
		return "Reddit [kind=" + kind + " " + data + "]";
	}
}
