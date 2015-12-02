package de.softsolu.uda_project0;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        // code is from androidpeople.com/tag/scrollbar
        //ScrollView scrollView = (ScrollView)findViewById(R.id.linearLayout)
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void btn_SpotifyStreamer_OnClick(View view){
        AppStartMock(getString(R.string.SPOTIFY_STREAMER));
     }

    public void btnScoresApp_OnClick(View view){
        AppStartMock(getString(R.string.SCORES_APP));
    }

    public void btnLibraryApp_OnClick(View view){
        AppStartMock(getString(R.string.LIBRARY_APP));
    }

    public void btnBuildItBigger_OnClick(View view){
        AppStartMock(getString(R.string.BUILD_IT_BIGGER));
    }

    public void btnBaconReaderApp_OnClick(View view){
        AppStartMock(getString(R.string.BACON_READER));
    }

    public void btnCapstoneApp_OnClick(View view){
        AppStartMock(getString(R.string.CAPSTONE));
    }

    private void AppStartMock(String strApp)  {
        Context context = getApplicationContext();
        CharSequence text = "App " + strApp + " is out of order!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
