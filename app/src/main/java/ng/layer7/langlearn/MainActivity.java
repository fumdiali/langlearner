package ng.layer7.langlearn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.main_list);

        String[] topics = {
                "Learn Numbers",
                 "Learn Phrases",
                 "Learn Objects" };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                   android.R.layout.simple_list_item_1,android.R.id.text1,topics);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                switch (position){
                    case 0:
                        Intent numbers = new Intent(view.getContext(),Numbers.class);
                        startActivity(numbers);
                        break;

                    case 1:
                        Intent phrases = new Intent(view.getContext(),Phrases.class);
                        startActivity(phrases);
                        break;

                    case 2:
                        Intent objects = new Intent(view.getContext(),Objects.class);
                        startActivity(objects);
                        break;

                }
            }
        });
    }// end of on create method
}
