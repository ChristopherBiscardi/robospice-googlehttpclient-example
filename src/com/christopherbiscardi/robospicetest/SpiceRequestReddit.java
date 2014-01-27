package com.christopherbiscardi.robospicetest;

import java.io.IOException;

import roboguice.util.temp.Ln;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.json.jackson.JacksonFactory;
import com.octo.android.robospice.request.googlehttpclient.GoogleHttpClientSpiceRequest;

public class SpiceRequestReddit extends GoogleHttpClientSpiceRequest<Reddit> {
	private String baseUrl;

    public SpiceRequestReddit( String subreddit ) {
        super( Reddit.class );
        this.baseUrl = String.format( "http://www.reddit.com/r/Riak.json", subreddit );
    }

    @Override
    public Reddit loadDataFromNetwork() throws IOException {
        Ln.d( "Call web service " + baseUrl );
        HttpRequest request = getHttpRequestFactory()//
                .buildGetRequest( new GenericUrl( baseUrl ) );
        request.setParser( new JacksonFactory().createJsonObjectParser() );
        return request.execute().parseAs( getResultType() );
    }
}
