package org.a2kyung.meching;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TabHost;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    TabHost tabHost = (TabHost)findViewById(R.id.tabHost);
    tabHost.setup();

    TabHost.TabSpec spec;
    spec = tabHost.newTabSpec("Tab 00");
    spec.setIndicator("HOME");
    spec.setContent(R.id.Home);
    tabHost.addTab(spec);


    spec=tabHost.newTabSpec("Tab 01");
    spec.setContent(R.id.Topic);
    spec.setIndicator("MY PAGE");
    tabHost.addTab(spec);

    tabHost.setCurrentTab(0);
    }

    public void startsurvey(View v) {
        Toast.makeText(this, "start survey.", Toast.LENGTH_LONG).show();

        Intent intent = new Intent(this, survey.class);
        startActivity(intent);
    }

    //설정 버튼 클릭 이벤트__nhk(2017-11-06 02:31);
    public void onSettingsButtonClicked(View v){
        Intent intent = new Intent(this, SettingsActivity.class);
        startActivity(intent);
    }
}
