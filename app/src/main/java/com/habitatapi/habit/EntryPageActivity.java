package com.habitatapi.habit;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class EntryPageActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entry_page);
    }

    public void onClickGetStarted(View view) {
        Intent i = new Intent(this, Dashboard.class);
        startActivity(i);
    }
}
