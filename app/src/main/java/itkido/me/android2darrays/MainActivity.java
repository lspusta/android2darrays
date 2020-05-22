package itkido.me.android2darrays;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    ArrayList<ArrayList<String>> listOfLists = new ArrayList<ArrayList<String>>();
    Button btnAdd2dArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnAdd2dArrayList = findViewById(R.id.btnAdd2dArrayList);

        btnAdd2dArrayList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                add2dArrayList();
            }
        });



    }

    private void add2dArrayList(){
        for(int i = 0; i < 3; i++)  {
            listOfLists.add(new ArrayList<String>());
            listOfLists.get(0).add("doc id");
        }
        Log.d(TAG, "add2dArrayList: whole list of lists = " + listOfLists);

        Log.d(TAG, "add2dArrayList: item 0 = " + listOfLists.get(0).get(0));
    }


}
