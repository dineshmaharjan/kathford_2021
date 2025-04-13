package edu.kathford.customadapterwithlistview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class CustomRecyclerViewAdapter  extends
        RecyclerView.Adapter<CustomRecyclerViewAdapter.CustomViewHolder>{

    private ArrayList<Movie> movieArrayList;

    private CustomClickListener onClickListener;

    public CustomRecyclerViewAdapter(ArrayList<Movie> movieArrayList, CustomClickListener onClickListener) {
        this.movieArrayList = movieArrayList;
        this.onClickListener = onClickListener;
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View view=layoutInflater.inflate(R.layout.item_movie, parent,false);
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
        Movie movie=movieArrayList.get(position);
        holder.movieNameTextView.setText(movie.getName());
        holder.genreTextView.setText(movie.getGenre());
        holder.languageTextView.setText(movie.getLanguage());
        Picasso.get().load(movie.getImageUrl()).into(holder.posterImageView);
        holder.posterImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickListener.onClick(movie);
            }
        });
    }

    @Override
    public int getItemCount() {
        return movieArrayList.size();
    }

    class CustomViewHolder extends  RecyclerView.ViewHolder{
        private ImageView posterImageView;
        private TextView movieNameTextView;
        private TextView languageTextView;

        private TextView genreTextView;


        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);
            posterImageView = itemView.findViewById(R.id.posterImageView);
            movieNameTextView = itemView.findViewById(R.id.movieNameTextView);
            languageTextView = itemView.findViewById(R.id.languageTextView);
            genreTextView = itemView.findViewById(R.id.genreTextView);

        }
    }


    interface CustomClickListener{
        void onClick(Movie movie);

    }

}
