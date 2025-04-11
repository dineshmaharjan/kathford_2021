package edu.kathford.customadapterwithlistview;

import android.os.Bundle;
import android.widget.GridView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class CustomGridViewActivity extends AppCompatActivity {
    private ArrayList<Movie> movieArrayList;

    private CustomGridViewAdapter customAdapter;
    private GridView gridView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simple_gridview_activity);
        gridView = findViewById(R.id.gridView);
        setDataSource();
        customAdapter = new CustomGridViewAdapter(this, movieArrayList);
        gridView.setAdapter(customAdapter);
        //TODO: add onItemClickListener


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

        movie = new Movie(1, "Alone", "English", "Action,Drama", "1hrs 30min" +
                "",
                "https://marketplace.canva.com/EAFTl0ixW_k/1/0/1131w/canva-black-white-minimal-alone-movie-poster-YZ-0GJ13Nc8.jpg");
        movieArrayList.add(movie);

        movie = new Movie(2, "Lajsaranam", "Nepali", "Comedy,Drama", "1hrs 30min" +
                "",
                "https://m.media-amazon.com/images/M/MV5BNmVkYzczY2MtZGViNi00Y2Q5LWFkMTUtODNmMTkxY2ZmMGE5XkEyXkFqcGc@._V1_.jpg");
        movieArrayList.add(movie);

        movie = new Movie(1, "Alone", "English", "Action,Drama", "1hrs 30min" +
                "",
                "https://marketplace.canva.com/EAFTl0ixW_k/1/0/1131w/canva-black-white-minimal-alone-movie-poster-YZ-0GJ13Nc8.jpg");
        movieArrayList.add(movie);

        movie = new Movie(2, "Lajsaranam", "Nepali", "Comedy,Drama", "1hrs 30min" +
                "",
                "https://m.media-amazon.com/images/M/MV5BNmVkYzczY2MtZGViNi00Y2Q5LWFkMTUtODNmMTkxY2ZmMGE5XkEyXkFqcGc@._V1_.jpg");
        movieArrayList.add(movie);


        movie = new Movie(1, "Alone", "English", "Action,Drama", "1hrs 30min" +
                "",
                "https://marketplace.canva.com/EAFTl0ixW_k/1/0/1131w/canva-black-white-minimal-alone-movie-poster-YZ-0GJ13Nc8.jpg");
        movieArrayList.add(movie);

        movie = new Movie(2, "Lajsaranam", "Nepali", "Comedy,Drama", "1hrs 30min" +
                "",
                "https://m.media-amazon.com/images/M/MV5BNmVkYzczY2MtZGViNi00Y2Q5LWFkMTUtODNmMTkxY2ZmMGE5XkEyXkFqcGc@._V1_.jpg");
        movieArrayList.add(movie);
    }
}
