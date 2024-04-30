package uk.ac.le.co2103.part2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

//    Button saveButton;
//    EditText inputText;


    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate()");
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        final ShoppingListListAdapter adapter = new ShoppingListListAdapter(new ShoppingListListAdapter.ShoppingListDiff());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        FloatingActionButton button = findViewById(R.id.fab);
        button.setOnClickListener(view -> {
            Log.d(TAG, "Floating action button clicked.");
            Intent intent = new Intent(this, CreateListActivity.class);
            startActivity(intent);
            Toast.makeText(getApplicationContext(), "Not implemented yet.", Toast.LENGTH_LONG).show();
        });

    }
}