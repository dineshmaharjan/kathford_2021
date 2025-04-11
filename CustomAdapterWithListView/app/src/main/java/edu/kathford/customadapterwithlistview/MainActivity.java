package edu.kathford.customadapterwithlistview;

import android.os.Bundle;
import android.text.method.MovementMethod;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    private ListView movieListView;
    private ArrayList<Movie> movieArrayList;

    private CustomAdapter customAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        movieListView = findViewById(R.id.movieListView);
        setDataSource();
        customAdapter = new CustomAdapter(this,
                movieArrayList);
        movieListView.setAdapter(customAdapter);

        movieListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent,
                                    View view, int position, long id) {
                //TODO
                Movie movie = movieArrayList.get(position);
                Toast.makeText(MainActivity.this,
                        movie.getName(),
                        Toast.LENGTH_SHORT).show();
            }
        });

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
