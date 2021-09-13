package com.rahul.busseats;

import androidx.appcompat.app.AppCompatActivity;
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
        recyclerView2 = findViewById(R.id.recyclerview2);
        recyclerView3 = findViewById(R.id.recyclerview3);
        recyclerView4 = findViewById(R.id.recyclerview4);

        addToList();
        ViewAdapter1 viewAdapter1 = new ViewAdapter1(list4);
        ViewAdapter2 viewAdapter2 = new ViewAdapter2(list3);
        ViewAdapter3 viewAdapter3 = new ViewAdapter3(list1);
        ViewAdapter4 viewAdapter4 = new ViewAdapter4(list0);

        LinearLayoutManager linearLayoutManager1 = new LinearLayoutManager(this);
        LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(this);
        LinearLayoutManager linearLayoutManager3 = new LinearLayoutManager(this);
        LinearLayoutManager linearLayoutManager4 = new LinearLayoutManager(this);
        recyclerView1.setLayoutManager(linearLayoutManager1);
        recyclerView2.setLayoutManager(linearLayoutManager2);
        recyclerView3.setLayoutManager(linearLayoutManager3);
        recyclerView4.setLayoutManager(linearLayoutManager4);
        recyclerView1.setAdapter(viewAdapter1);
        recyclerView2.setAdapter(viewAdapter2);
        recyclerView3.setAdapter(viewAdapter3);
        recyclerView4.setAdapter(viewAdapter4);
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
                String e = a.getString("n");
                String f = b.getString("n");
                String g = c.getString("n");
                String h = d.getString("n");

                list4.add(h);
                list3.add(g);
                list1.add(f);
                list0.add(e);

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