package com.rahul.busseats;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView1;
    private RecyclerView recyclerView2;
    private RecyclerView recyclerView3;
    private RecyclerView recyclerView4;
    private List<String> list4 = new ArrayList<>();
    private List<String> list3 = new ArrayList<>();
    private List<String> list1 = new ArrayList<>();
    private List<String> list0 = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView1 = findViewById(R.id.recyclerview1);

        addToList();
        ViewAdapter1 viewAdapter1 = new ViewAdapter1(list4);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 4);
        recyclerView1.setLayoutManager(gridLayoutManager);
        recyclerView1.setAdapter(viewAdapter1);
    }

    private void addToList() {
        try {
            String jsonDataString = readJSONDataFromFile();
            JSONArray jsonArray = new JSONArray(jsonDataString);

            for (int i = 0; i < jsonArray.length(); ++i) {

                JSONObject itemObj = jsonArray.getJSONObject(i);
                JSONObject a = itemObj.getJSONObject("0");
                JSONObject b = itemObj.getJSONObject("1");
                JSONObject c = itemObj.getJSONObject("3");
                JSONObject d = itemObj.getJSONObject("4");
                String h = a.getString("n");
                String g = b.getString("n");
                String k = c.getString("n");
                String j = d.getString("n");

                list4.add(h);
                list4.add(g);
                list4.add(k);
                list4.add(j);
            }

        } catch (JSONException | IOException e) {
            Log.d("Main", "addItemsFromJSON: ", e);
        }
    }

    private String readJSONDataFromFile() throws IOException {

        InputStream inputStream = null;
        StringBuilder builder = new StringBuilder();

        try {

            String jsonString = null;
            inputStream = getResources().openRawResource(R.raw.response);
            BufferedReader bufferedReader = new BufferedReader(
                    new InputStreamReader(inputStream, "UTF-8"));

            while ((jsonString = bufferedReader.readLine()) != null) {
                builder.append(jsonString);
            }

        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
        }
        return new String(builder);
    }
}