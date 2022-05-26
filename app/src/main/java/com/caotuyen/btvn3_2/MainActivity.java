package com.caotuyen.btvn3_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.RelativeLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rcvData;
    private UserAdapter userAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rcvData = findViewById(R.id.rcv_data);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        rcvData.setLayoutManager(linearLayoutManager);

        userAdapter = new UserAdapter(getListUser());
        rcvData.setAdapter(userAdapter);
    }

    private List<User> getListUser() {


        List<User> list = new ArrayList<>();
        list.add(new User(R.drawable.uni, "To Kill a Mockingbird ", R.drawable.ic_more_vert));

        list.add(new User(R.drawable.uni, "To Kill a Mockingbird ", R.drawable.ic_more_vert));

        list.add(new User(R.drawable.uni, "To Kill a Mockingbird ", R.drawable.ic_more_vert));
        list.add(new User(R.drawable.uni, "To Kill a Mockingbird ", R.drawable.ic_more_vert));

        list.add(new User(R.drawable.uni, "To Kill a Mockingbird ", R.drawable.ic_more_vert));


        return list;

    }


}