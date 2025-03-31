package edu.kathford.menuexample;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private TextView descriptionTextView;
    private Button popupButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        descriptionTextView = findViewById(R.id.descriptionTextView);
        popupButton = findViewById(R.id.popupButton);

        popupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popupMenu = new PopupMenu(MainActivity.this,
                        popupButton);
                MenuInflater menuInflater=popupMenu.getMenuInflater();
                menuInflater.inflate(R.menu.popup_menu, popupMenu.getMenu());
                popupMenu.show();

//                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
//                    @Override
//                    public boolean onMenuItemClick(MenuItem item) {
//                        return false;
//                    }
//                });
            }
        });

        registerForContextMenu(descriptionTextView);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.option_menu, menu);
        return true;
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.context_menu, menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.selectAll) {
            Toast.makeText(this, "Select All clicked", Toast.LENGTH_SHORT).show();
        } else if (item.getItemId() == R.id.copy) {
            Toast.makeText(this, "Copy clicked", Toast.LENGTH_SHORT).show();
        } else if (item.getItemId() == R.id.cut) {
            Toast.makeText(this, "Cut clicked", Toast.LENGTH_SHORT).show();
        }

        return super.onContextItemSelected(item);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId() == R.id.notification) {

            Toast.makeText(this,
                    "Notification clicked",
                    Toast.LENGTH_SHORT).show();
        } else if (item.getItemId() == R.id.about) {
            Toast.makeText(this,
                    "About clicked",
                    Toast.LENGTH_SHORT).show();
        } else if (item.getItemId() == R.id.logout) {
            Toast.makeText(this,
                    "Logout clicked",
                    Toast.LENGTH_SHORT).show();
        }


        return super.onOptionsItemSelected(item);
    }
}
