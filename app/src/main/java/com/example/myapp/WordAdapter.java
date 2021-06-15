package com.example.myapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {
    private int mColorResourceId;

    private static final String LOG_TAG = WordAdapter.class.getSimpleName();

    public WordAdapter(Context context, ArrayList<Word> words, int colorResourceId) {
        super(context, 0, words);
        mColorResourceId = colorResourceId;
    }
//    public WordAdapter(FamilyActivity context, ArrayList<Word> Word){
//        super(context, 0, Word);
//    }
//
//    public WordAdapter(ColorsActivity context, ArrayList<Word> Word){
//        super(context, 0, Word);
//    }
//
//    public WordAdapter(PhrasesActivity context, ArrayList<Word> Word){
//        super(context, 0, Word);
//    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.englishWord);


        nameTextView.setText(currentWord.getEnglishWord());


        TextView numberTextView = (TextView) listItemView.findViewById(R.id.kannadaWord);

        numberTextView.setText(currentWord.getKannadaWord());

        ImageView imageView = (ImageView)  listItemView.findViewById(R.id.image);


        if(currentWord.hasImage()){
            imageView.setImageResource(currentWord.getImageId());
            imageView.setVisibility(View.VISIBLE);
        }
        else{
            imageView.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;




    }
}
