package com.example.miwok;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    //handles play back for all the sound files
    private MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("Where are you going?", "minto wuksus", R.raw.phrase_where_are_you_going));
        words.add(new Word("What is your name?", "tinnə oyaase'nə", R.raw.phrase_what_is_your_name));
        words.add(new Word("My name is...", "oyaaset...", R.raw.phrase_my_name_is));
        words.add(new Word("How are you feeling?", "michəksəs?", R.raw.phrase_how_are_you_feeling));
        words.add(new Word("I’m feeling good.", "kuchi achit", R.raw.phrase_im_feeling_good));
        words.add(new Word("Are you coming?", "əənəs'aa?", R.raw.phrase_are_you_coming));
        words.add(new Word("Yes, I’m coming", "həə’ əənəm", R.raw.phrase_yes_im_coming));
        words.add(new Word("I’m coming.", "əənəm", R.raw.phrase_im_coming));
        words.add(new Word("Let’s go. ", "yoowutis", R.raw.phrase_lets_go));
        words.add(new Word("Come here. ", "ənni'nem", R.raw.phrase_come_here));


        //create ArrayAdapter contains Strings
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_phrases);

        //search for listView
        ListView listView = (ListView)findViewById(R.id.list);

        //associate the ArrayAdapter to the list
        listView.setAdapter(adapter);

        // Set a click listener to play the audio when the list item is clicked on
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(NumbersActivity.this, "List item clicked",Toast.LENGTH_SHORT).show();

                Word word = words.get(position);
                mMediaPlayer = MediaPlayer.create(PhrasesActivity.this, word.getAudioResourceId());
                mMediaPlayer.start();
            }
        });
}
    /*
    public void opensPhrasesList(View view){
        Intent i = new Intent(this, PhrasesActivity.class);
        startActivity(i);
    } */

}
