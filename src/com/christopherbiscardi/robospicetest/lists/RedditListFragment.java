package com.christopherbiscardi.robospicetest.lists;

import java.util.ArrayList;

import com.christopherbiscardi.robospicetest.RedditChild;

import android.app.ListFragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class RedditListFragment extends ListFragment {

	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		Log.e("RedditListingsClick",position + " " + id);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		ArrayList<RedditChild> redditChildren = new ArrayList<RedditChild>();
		RedditChildAdapter adapter = new RedditChildAdapter(inflater.getContext(), redditChildren);
		setListAdapter(adapter);
		return super.onCreateView(inflater, container, savedInstanceState);
	}
}
