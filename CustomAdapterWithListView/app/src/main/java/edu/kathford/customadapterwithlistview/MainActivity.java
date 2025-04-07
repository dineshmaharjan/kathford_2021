package edu.kathford.customadapterwithlistview;

import android.os.Bundle;
import android.text.method.MovementMethod;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    private ListView movieListView;
    private ArrayList<Movie> movieArrayList;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        movieListView = findViewById(R.id.movieListView);
        setDataSource();

    }

    private void setDataSource() {
        movieArrayList = new ArrayList<Movie>();
        Movie movie = new Movie(1, "Alone", "English", "Action,Drama", "1hrs 30min" +
                "");
        movieArrayList.add(movie);

        movie = new Movie(2, "Lajsaranam", "Nepali", "Comedy,Drama", "1hrs 30min" +
                "");
        movieArrayList.add(movie);
    }
}
