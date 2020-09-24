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
        words.add(new Word("one","lutti",R.drawable.number_one));
        words.add(new Word("two","otiiko", R.drawable.number_two));
        words.add(new Word("three","tolookosu", R.drawable.number_three));
        words.add(new Word("four","oyysia", R.drawable.number_four));
        words.add(new Word("five","massokka", R.drawable.number_five));
        words.add(new Word("six","temmokka", R.drawable.number_six));
        words.add(new Word("seven","kenekaku", R.drawable.number_seven));
        words.add(new Word("eight","kawinta", R.drawable.number_eight));
        words.add(new Word("nine","wo'e", R.drawable.number_nine));
        words.add(new Word("ten","na'aacha", R.drawable.number_ten));

        words.add(new Word("father","ede", R.drawable.family_father));
        words.add(new Word("mother","eta", R.drawable.family_mother));
        words.add(new Word("son","angsi", R.drawable.family_son));
        words.add(new Word("daughter","tune", R.drawable.family_daughter));
        words.add(new Word("older brother","taachi", R.drawable.family_older_brother));
        words.add(new Word("younger brother","chalitti", R.drawable.family_younger_brother));
        words.add(new Word("older sister","tete", R.drawable.family_older_sister));
        words.add(new Word("younger sister","kolliti ", R.drawable.family_younger_sister));
        words.add(new Word("grandmother","ama ", R.drawable.family_grandmother));
        words.add(new Word("grandfather","paapa ", R.drawable.family_grandfather));

        words.add(new Word("red","wetetti", R.drawable.color_red));
        words.add(new Word("mustard yello","chiwitte", R.drawable.color_mustard_yellow));
        words.add(new Word("dusty yellow","topiise", R.drawable.color_dusty_yellow));
        words.add(new Word("green","chokokki", R.drawable.color_green));
        words.add(new Word("brown","takaaki", R.drawable.color_brown));
        words.add(new Word("gray","topoopi", R.drawable.color_gray));
        words.add(new Word("black","kululli", R.drawable.color_black));
        words.add(new Word("white","kelelli ", R.drawable.color_white));



        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this,words,R.color.category_phrases);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }

}