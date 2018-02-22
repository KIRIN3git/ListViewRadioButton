package com.example.shinji.listviewradiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		ListView listView = (ListView)findViewById(R.id.ListView);
		listView.setAdapter(new ArrayAdapter<String>(
				this,
				android.R.layout.simple_list_item_single_choice,
				new String[]{"a", "b", "c", "d", "e"})
		);

		listView.setChoiceMode(ListView.CHOICE_MODE_SINGLE);

		// クリックイベント
		listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent,	View view, int position, long id) {
				String msg = position + "番目のアイテムがクリックされました";
				Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_LONG).show();
			}
		});
	}
}
