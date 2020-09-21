package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        System.out.print("Hello");

        // Create an array of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("one","lutti"));
        words.add(new Word("two","otiiko"));
        words.add(new Word("three","tolookosu"));
        words.add(new Word("four","oyysia"));
        words.add(new Word("five","massokka"));
        words.add(new Word("six","temmokka"));
        words.add(new Word("seven","kenekaku"));
        words.add(new Word("eight","kawinta"));
        words.add(new Word("nine","wo'e"));
        words.add(new Word("ten","na'aacha"));

        words.add(new Word("father","ede"));
        words.add(new Word("mother","eta"));
        words.add(new Word("son","angsi"));
        words.add(new Word("daughter","tune"));
        words.add(new Word("elder brother","taachi"));
        words.add(new Word("younger brother","chalitti"));
        words.add(new Word("older sister","tete"));
        words.add(new Word("younger sister","kolliti "));
        words.add(new Word("grandmother","ama "));
        words.add(new Word("grandfather","paapa "));
        
        words.add(new Word("red","wetetti"));
        words.add(new Word("mustard yello","chiwitte"));
        words.add(new Word("dusty yellow","topiise"));
        words.add(new Word("green","chokokki"));
        words.add(new Word("brown","takaaki"));
        words.add(new Word("gray","topoopi"));
        words.add(new Word("black","kululli"));
        words.add(new Word("white","kelelli "));



        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this,words);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }

}