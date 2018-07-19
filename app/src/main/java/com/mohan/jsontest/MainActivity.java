package com.mohan.jsontest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ListView listView = findViewById(R.id.list_view);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Api.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        Api api = retrofit.create(Api.class);

        Call<List<SuperHeros>> call = api.getHeros();

        call.enqueue(new Callback<List<SuperHeros>>() {
            @Override
            public void onResponse(Call<List<SuperHeros>> call, Response<List<SuperHeros>> response) {
                List<SuperHeros> superHerosList = response.body();

                String[] heroNames = new String[superHerosList.size()];

                for (int i = 0; i<superHerosList.size(); i++){

                    heroNames[i] = superHerosList.get(i).getName();
                }

                listView.setAdapter(
                        new ArrayAdapter<String>(
                                getApplicationContext(),
                                android.R.layout.simple_list_item_1,
                                heroNames
                        )
                );

            }

            @Override
            public void onFailure(Call<List<SuperHeros>> call, Throwable t) {
                Toast.makeText(getApplicationContext(),t.getMessage(), Toast.LENGTH_SHORT).show();

            }
        });
    }
}
