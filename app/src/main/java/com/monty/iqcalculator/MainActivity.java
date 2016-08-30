package com.monty.iqcalculator;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    GridView gridview;

    private String[] name={"Tchr1","Tchr2","tchr3","tchr4","tchr5","tchr6","tchr7","tchr8","tchr9","tchr10",
            "tchr11","tchr12","tchr13","tchr14","tchr15","tchr16"};
    private int[] imageid={R.drawable.teacher,R.drawable.teacher,R.drawable.teacher,R.drawable.teacher,
            R.drawable.teacher,R.drawable.teacher,R.drawable.teacher,R.drawable.teacher,R.drawable.teacher,
            R.drawable.teacher,R.drawable.teacher,R.drawable.teacher,R.drawable.teacher,R.drawable.teacher,
            R.drawable.teacher,R.drawable.teacher};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        gridview= (GridView) findViewById(R.id.gridView1) ;
        gridview.setAdapter(new ImageAdapter(this,name,imageid));

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                startActivity(new Intent(MainActivity.this,FinalActivity.class));

            }
        });

      ////  FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
       // fab.setOnClickListener(new View.OnClickListener() {
            //@Override
          //  public void onClick(View view) {
           //     Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
          //              .setAction("Action", null).show();
          //  }
      //  });
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
}
