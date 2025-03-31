package edu.kathford.menuexample;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.option_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if(item.getItemId() == R.id.notification){

            Toast.makeText(this,
                    "Notification clicked",
                    Toast.LENGTH_SHORT).show();
        }else if (item.getItemId() == R.id.about){
            Toast.makeText(this,
                    "About clicked",
                    Toast.LENGTH_SHORT).show();
        }else if (item.getItemId() == R.id.logout){
            Toast.makeText(this,
                    "Logout clicked",
                    Toast.LENGTH_SHORT).show();
        }



        return super.onOptionsItemSelected(item);
    }
}
