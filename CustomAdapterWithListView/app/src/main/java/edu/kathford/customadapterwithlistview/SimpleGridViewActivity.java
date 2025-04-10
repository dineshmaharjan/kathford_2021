package edu.kathford.customadapterwithlistview;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SimpleGridViewActivity extends AppCompatActivity {

    private String[] datas= {
            "One","Two","Three","Four","Five", "Six", "Seven",
            "Eight", "Nine", "Ten"
    };

    private GridView gridView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simple_gridview_activity);
        gridView = findViewById(R.id.gridView);

        ArrayAdapter adapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1,
                datas);
        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ///TODO: add onItem click listener: assignment

            }
        });
    }
}
