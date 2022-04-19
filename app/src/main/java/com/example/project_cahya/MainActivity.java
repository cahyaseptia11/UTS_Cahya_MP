package com.example.project_cahya;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.project_cahya.databinding.ActivityMainBinding;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        int[] imageId = {R.drawable.ica,R.drawable.teteh,R.drawable.ibu};

        String[] name = {"Cahya S", "Ibu Iti", "Teh Elis"};

        String[] lastMessage = {"secret", "flower", "masjid"};

        String[] lastmsgTime = {"12.11 am", "01.11 pm", "02:11 am"};

        String[] phoneNo = {"1109", "0201", "1357"};

        String[] country = {"Cilacap", "Pamulang", "Bogor"};

        ArrayList<User> userArrayList = new ArrayList<>();

        for (int i=0; i<imageId.length; i++) {

            User user = new User(name[i], lastMessage[i], lastmsgTime[i], phoneNo[i], country[i], imageId[i]);
            userArrayList.add(user);

        }

        ListAdapter listAdapter = new ListAdapter(MainActivity.this, userArrayList);

        binding.listView.setAdapter(listAdapter);
        binding.listView.setClickable(true);
        binding.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent i = new Intent(MainActivity.this,UserActivity.class);
                i.putExtra("name", name[position]);
                i.putExtra("phone", phoneNo[position]);
                i.putExtra("country", country[position]);
                i.putExtra("imageid", imageId[position]);
                startActivity(i);

            }
        });  
    }
}