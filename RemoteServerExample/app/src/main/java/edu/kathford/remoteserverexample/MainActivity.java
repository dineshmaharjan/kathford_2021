package edu.kathford.remoteserverexample;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import edu.kathford.remoteserverexample.entity.request.PostRequest;
import edu.kathford.remoteserverexample.entity.response.PostResponse;
import edu.kathford.remoteserverexample.helper.ApiHelper;
import edu.kathford.remoteserverexample.helper.ApiService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {
    private EditText titleEditText, bodyEditText;
    private Button submitButton;

    private Retrofit retrofit;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        titleEditText = findViewById(R.id.titleEditText);
        bodyEditText = findViewById(R.id.bodyEditText);
        submitButton = findViewById(R.id.submitButton);

        retrofit = ApiHelper.getInstance();
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String title = titleEditText.getText().toString().trim();
                String body = bodyEditText.getText().toString().trim();

                if (!title.isEmpty() && !body.isEmpty()) {

                    PostRequest postRequest = new PostRequest();
                    postRequest.setTitle(title);
                    postRequest.setBody(body);
                    postRequest.setUserId(1);



                    ApiService apiService = retrofit.create(ApiService.class);

                    Call<PostResponse> call =apiService.submitPost(postRequest);
                    call.enqueue(new Callback<PostResponse>() {
                        @Override
                        public void onResponse(Call<PostResponse> call,
                                               Response<PostResponse> response) {

                            if (response.code() == 201) {
                                PostResponse postResponse = response.body();
                                System.out.println("title "+postResponse.getTitle());
                                System.out.println("body "+postResponse.getBody());
                                System.out.println("userId "+postResponse.getUserId());
                                System.out.println("ids "+postResponse.getId());
                                Log.d("Response body", postResponse.getBody());
                                Toast.makeText(MainActivity.this,
                                        "Post created successfully", Toast.LENGTH_SHORT).show();

                            } else {
                                Toast.makeText(MainActivity.this, "Post is not created", Toast.LENGTH_SHORT).show();
                            }

                        }

                        @Override
                        public void onFailure(Call<PostResponse> call, Throwable t) {
                            Toast.makeText(MainActivity.this,
                                    t.getMessage(), Toast.LENGTH_SHORT).show();

                        }
                    });


                } else {
                    Toast.makeText(MainActivity.this,
                            "All fields are required", Toast.LENGTH_SHORT).show();
                }
            }





//                    Call<List<PostResponse>> calls=apiService.getAllPosts();
//                    calls.enqueue(new Callback<List<PostResponse>>() {
//                        @Override
//                        public void onResponse(Call<List<PostResponse>> call, Response<List<PostResponse>> response) {
//                            List<PostResponse> posts =response.body();
//                            System.out.println(posts);
//                            for(int i=0; i <posts.size(); i ++){
//                                System.out.println(posts.get(i).getTitle());
//                                System.out.println(posts.get(i).getBody());
//                                System.out.println(posts.get(i).getId());
//                            }
//                        }
//
//                        @Override
//                        public void onFailure(Call<List<PostResponse>> call, Throwable t) {
//
//                        }
//                    });

        });

    }
}
