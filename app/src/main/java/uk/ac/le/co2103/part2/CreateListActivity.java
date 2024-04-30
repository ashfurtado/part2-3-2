package uk.ac.le.co2103.part2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class CreateListActivity extends AppCompatActivity {

    private int listID;


    public Button saveButton;
    public EditText inputText;
    public ListView listView;
    public ArrayList<String> lists = new ArrayList<>();
    public ArrayAdapter<String> listAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_list);

        saveButton = (Button) findViewById(R.id.saveButton);
        inputText = (EditText) findViewById(R.id.inputText);
        listView = (ListView) findViewById(R.id.listView);
        listAdapter = new ArrayAdapter<>(CreateListActivity.this, android.R.layout.simple_list_item_1, lists);

        listView.setAdapter(listAdapter);
        listAdapter.notifyDataSetChanged();


        saveButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                EditText inputText = findViewById(R.id.inputText);
                String text = inputText.getText().toString();

//                if (text == null || text.trim().equals("")) {
//                    Toast.makeText(CreateListActivity.this, "Item is empty", Toast.LENGTH_SHORT).show();
//                    return;
//                }
//
//                if (lists.contains(text)) {
//                    Toast.makeText(CreateListActivity.this, "Item has already been added", Toast.LENGTH_SHORT).show();
//                    return;
//                }
//                lists.add(text);
//                listAdapter.notifyDataSetChanged();
//                inputText.setText("");

                finish();
            };
        });
    };

//    private void saveData(){
//        SharedPreferences sp = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
//        SharedPreferences.Editor editor = sp.edit();
//        Gson gson = new Gson();
//
//        String jsonString = gson.toJson(lists);
//        editor.putString(SHARED_PREFS_KEY, jsonString);
//        editor.apply();
//    }
//
//    private void loadData(){
//        SharedPreferences sp = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
//        Gson gson = new Gson();
//        String json = sp.getString(SHARED_PREFS_KEY, "");
//
//        if (json.isEmpty()){
//            return;
//        }
//
//        Type type = new TypeToken<>() .getType();
//        lists.addAll((gson.fromJson(json, (java.lang.reflect.Type) type)));
//    }
}
