package com.example.harshitgakhar.recyleroffline;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Book> lstbook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstbook = new ArrayList<>();
        lstbook.add(new Book("Book1","categorybook","Description",R.drawable.aaa));
        lstbook.add(new Book("Book2","categorybook","Description",R.drawable.bbb));
        lstbook.add(new Book("Book3","categorybook","Description",R.drawable.ccc));
        lstbook.add(new Book("Book4","categorybook","Description",R.drawable.ddd));
        lstbook.add(new Book("Book5","categorybook","Description",R.drawable.eee));
        lstbook.add(new Book("Book6","categorybook","Description",R.drawable.fff));
        lstbook.add(new Book("Book7","categorybook","Description",R.drawable.ggg));

        RecyclerView myrv = (RecyclerView)findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter= new RecyclerViewAdapter(this,lstbook);
        myrv.setLayoutManager(new GridLayoutManager(this,3));
        myrv.setAdapter(myAdapter);
    }
}
