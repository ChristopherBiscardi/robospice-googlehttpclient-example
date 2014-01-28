package com.christopherbiscardi.robospicetest.lists;

import java.util.ArrayList;

import com.christopherbiscardi.robospicetest.R;
import com.christopherbiscardi.robospicetest.RedditChild;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class RedditChildAdapter extends ArrayAdapter<RedditChild> {
	private static class ViewHolder {
        TextView title;
        TextView author;
        TextView domain;
    }
	
	public RedditChildAdapter(Context context, ArrayList<RedditChild> redditChildren) {
		super(context, R.layout.item_reddit_listing, redditChildren);
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// Get the data item for this position
		RedditChild child = getItem(position);    
		// Check if an existing view is being reused, otherwise inflate the view
	       ViewHolder viewHolder; // view lookup cache stored in tag
	       if (convertView == null) {
	          viewHolder = new ViewHolder();
	          LayoutInflater inflater = LayoutInflater.from(getContext());
	          convertView = inflater.inflate(R.layout.item_reddit_listing, null);
	          viewHolder.title = (TextView) convertView.findViewById(R.id.rTitle);
	          viewHolder.author = (TextView) convertView.findViewById(R.id.rAuthor);
	          viewHolder.domain = (TextView) convertView.findViewById(R.id.rDomain);
	          convertView.setTag(viewHolder);
	       } else {
	           viewHolder = (ViewHolder) convertView.getTag();
	       }
	       // Populate the data into the template view using the data object
	       viewHolder.title.setText(child.getData().getTitle());
	       viewHolder.author.setText(child.getData().getAuthor());
	       viewHolder.domain.setText(child.getData().getDomain());
	       // Return the completed view to render on screen
	       return convertView;
	}
}
