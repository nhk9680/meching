package org.a2kyung.meching;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class survey extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survey);
    }

    public void backbutton1(View v) {
        Intent intent = new Intent(this, popup.class);
        startActivity(intent);
    }
    public void surveybackbutton(View v) {
        this.finish();
    }
}
