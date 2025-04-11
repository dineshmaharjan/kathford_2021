package edu.kathford.customadapterwithlistview;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class CustomGridViewAdapter extends ArrayAdapter<Movie> {

    //data source
    private ArrayList<Movie> movieArrayList;
    //activity context
    private Activity context;



    public CustomGridViewAdapter(Activity context,
                         ArrayList<Movie> movieArrayList) {
        super(context, R.layout.gridview_item_movie, movieArrayList);
        this.movieArrayList = movieArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView,
                        @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater =context.getLayoutInflater();
        View view=layoutInflater.inflate(R.layout.gridview_item_movie,
                parent,false);
        ImageView posterImageView = view.findViewById(R.id.posterImageView);
        TextView movieNameTextView = view.findViewById(R.id.movieNameTextView);

        Movie movie =movieArrayList.get(position);

        movieNameTextView.setText(movie.getName());
        Picasso.get().load(movie.getImageUrl())
                .into(posterImageView);

        return view;
    }
}
