package azmimuhammad.com.materialdesign.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import azmimuhammad.com.materialdesign.R;
import azmimuhammad.com.materialdesign.recyclerview.adapter.SimpleAdapter;

public class RecyclerViewActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private SimpleAdapter adapter;
    private LinearLayoutManager linearLayoutManager;
    private Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        recyclerView = findViewById(R.id.recyclerView);
        toolbar = findViewById(R.id.toolbar);
        adapter = new SimpleAdapter(this);

        toolbar.setTitle("Recycler View");
        linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);

        recyclerView.setItemAnimator(new DefaultItemAnimator());
    }
}
