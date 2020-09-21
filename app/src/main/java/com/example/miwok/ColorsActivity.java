package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        System.out.print("Hello");

        // Create an array of words
        ArrayList<Word> words = new ArrayList<Word>();
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