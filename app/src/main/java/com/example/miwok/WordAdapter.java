package com.example.miwok;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    //resource id for the background color for this list of words
    private int mColorResourceId;

    public WordAdapter(Activity context, ArrayList<Word> words, int colorResourceId){
        super(context, 0, words);
        mColorResourceId = colorResourceId;
    }

    public View getView(int position, View convertView, ViewGroup parent){
        //check if the existing view is being reused, otherwise inflated the view
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext())
                    .inflate(R.layout.list_item, parent, false);
        }

        //get the word object located at this position in the list
        Word currentWord = getItem(position);

        //find the TextView in the list_item.xml layout with the id miwok_text_view
        TextView miwokTextView = (TextView)listItemView.findViewById(R.id.miwok_text_view);
        //get the miwok translation from the currentWord object
        // and set this text on the Miwok TextView
        miwokTextView.setText(currentWord.getMiwokTranslation());

        //find the TextView in the list_item.xml layout with the id default_text_view
        TextView defaultTextView = (TextView)listItemView.findViewById(R.id.default_text_view);
        //get the default translation from the currentWord object
        // and set this text on the default TextView
        defaultTextView.setText(currentWord.getmDefaultTranslation());

        //find the ImageView in the list_item.xml layout with the id image
        ImageView imageView = (ImageView)listItemView.findViewById(R.id.image);

        if(currentWord.hasImage()) {
            //set the ImageView to the image resource specified in the current word
            imageView.setImageResource(currentWord.getImageResourceId());

            //make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        }else{
            //hide the ImageView
            imageView.setVisibility(View.GONE);
        }

        //set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        //find the color that the resource id maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);

            //return the list_item layout
            return listItemView;
    }


}
