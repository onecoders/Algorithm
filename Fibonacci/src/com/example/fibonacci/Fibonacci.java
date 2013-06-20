package com.example.fibonacci;

import java.util.Arrays;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Fibonacci extends Activity {

	private TextView textview;
	private Button btn;
	private EditText edittext;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		textview = (TextView) findViewById(R.id.textview);
		btn = (Button) findViewById(R.id.btn);
		edittext = (EditText) findViewById(R.id.edittext);
		btn.setOnClickListener(new OnClickListener() {

			@SuppressLint("NewApi")
			@Override
			public void onClick(View v) {
				if (edittext.getText().toString().isEmpty()) {
					Toast.makeText(v.getContext(), "Null!Please enter a num!",
							Toast.LENGTH_SHORT).show();
				} else if (!edittext.getText().toString().matches("[0-9]+")) {
					Toast.makeText(v.getContext(), "NaN!Please enter a num!",
							Toast.LENGTH_SHORT).show();
				} else {
					textview.setText(getFibonacci(Integer.valueOf(edittext
							.getText().toString())));
				}
			}
		});
	}

	private String getFibonacci(int pos) {
		//String fibonacci = "";
		int[] num = new int[pos];
		for (int i = 0; i < pos; i++) {
			if (i == 0) {
				num[0] = 1;
			} else if (i == 1) {
				num[1] = 1;
			} else {
				num[i] = num[i - 1] + num[i - 2];
			}
			//fibonacci += num[i] + "¡¢";
		}
		//return fibonacci;
		return Arrays.toString(num);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.fibonacci, menu);
		return true;
	}

}
