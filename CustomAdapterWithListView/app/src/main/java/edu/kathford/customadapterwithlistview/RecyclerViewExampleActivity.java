package edu.kathford.customadapterwithlistview;

import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewExampleActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    //data source
    private ArrayList<Movie> movieArrayList;

    //adapter
    private CustomRecyclerViewAdapter adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview_example);
        recyclerView = findViewById(R.id.movieRecyclerView);
        setDataSource();
        adapter = new CustomRecyclerViewAdapter(movieArrayList, new CustomRecyclerViewAdapter.CustomClickListener() {
            @Override
            public void onClick(Movie movie) {
                Toast.makeText(RecyclerViewExampleActivity.this,
                        movie.getName(), Toast.LENGTH_SHORT).show();
            }
        });
        RecyclerView.LayoutManager layoutManager =
                new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

    }


    private void setDataSource() {
        movieArrayList = new ArrayList<Movie>();
        Movie movie = new Movie(1, "Alone", "English", "Action,Drama", "1hrs 30min" +
                "",
                "https://marketplace.canva.com/EAFTl0ixW_k/1/0/1131w/canva-black-white-minimal-alone-movie-poster-YZ-0GJ13Nc8.jpg");
        movieArrayList.add(movie);

        movie = new Movie(2, "Lajsaranam", "Nepali", "Comedy,Drama", "1hrs 30min" +
                "",
                "https://m.media-amazon.com/images/M/MV5BNmVkYzczY2MtZGViNi00Y2Q5LWFkMTUtODNmMTkxY2ZmMGE5XkEyXkFqcGc@._V1_.jpg");
        movieArrayList.add(movie);
    }
}
