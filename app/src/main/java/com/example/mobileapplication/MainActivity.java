package com.example.mobileapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    String Names[] = {"Grand Prix","Halloween Party","NBA","Memorial Day"};
    int Images[]={R.drawable.grandprix,R.drawable.halloween,R.drawable.nba,R.drawable.memorial};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.list_view);

        CustomAdapter customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("names", Names[position]);
                intent.putExtra("images",Images[position]);
                startActivity(intent);
            }
        });

    }

    public class CustomAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return Names.length;
        }

        @Override
        public Object getItem(int position) {
            return position;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            convertView = getLayoutInflater().inflate(R.layout.second, null);

            TextView textView = (TextView) convertView.findViewById(R.id.textView);
            textView.setText(Names[position]);

            return convertView;
        }
    }
}
