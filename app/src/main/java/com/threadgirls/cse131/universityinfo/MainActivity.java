package com.threadgirls.cse131.universityinfo;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button ulab_btn = (Button)findViewById(R.id.ulab_btn);
        ulab_btn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        ulab_btn.getBackground().setAlpha(50);
                        break;
                    case MotionEvent.ACTION_UP:
                        Intent intent=new Intent(MainActivity.this, ULABInfo.class);
                        startActivity(intent);
                        ulab_btn.getBackground().setAlpha(255);
                        break;
                    case MotionEvent.ACTION_MOVE:

                        break;

                    default:
                        break;
                }
                return false;
            }
        });

        final Button ewu_btn = (Button)findViewById(R.id.ewu_btn);
        ewu_btn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        ewu_btn.getBackground().setAlpha(50);
                        break;
                    case MotionEvent.ACTION_UP:
                        Intent intent=new Intent(MainActivity.this, EWUInfo.class);
                        startActivity(intent);
                        ewu_btn.getBackground().setAlpha(255);
                        break;
                    case MotionEvent.ACTION_MOVE:

                        break;

                    default:
                        break;
                }
                return false;
            }
        });

        final Button aiub_btn = (Button)findViewById(R.id.aiub_btn);
        aiub_btn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        aiub_btn.getBackground().setAlpha(50);
                        break;
                    case MotionEvent.ACTION_UP:
                        Intent intent=new Intent(MainActivity.this, AIUBInfo.class);
                        startActivity(intent);
                        aiub_btn.getBackground().setAlpha(255);
                        break;
                    case MotionEvent.ACTION_MOVE:

                        break;

                    default:
                        break;
                }
                return false;
            }
        });

        final Button iub_btn = (Button)findViewById(R.id.iub_btn);
        iub_btn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        iub_btn.getBackground().setAlpha(50);
                        break;
                    case MotionEvent.ACTION_UP:
                        Intent intent=new Intent(MainActivity.this, IUBInfo.class);
                        startActivity(intent);
                        iub_btn.getBackground().setAlpha(255);
                        break;
                    case MotionEvent.ACTION_MOVE:

                        break;

                    default:
                        break;
                }
                return false;
            }
        });

        final Button brac_btn = (Button)findViewById(R.id.brac_btn);
        brac_btn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        brac_btn.getBackground().setAlpha(50);
                        break;
                    case MotionEvent.ACTION_UP:
                        Intent intent=new Intent(MainActivity.this, BRACInfo.class);
                        startActivity(intent);
                        brac_btn.getBackground().setAlpha(255);
                        break;
                    case MotionEvent.ACTION_MOVE:

                        break;

                    default:
                        break;
                }
                return false;
            }
        });

        final Button aust_btn = (Button)findViewById(R.id.aust_btn);
        aust_btn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        aust_btn.getBackground().setAlpha(50);
                        break;
                    case MotionEvent.ACTION_UP:
                        Intent intent=new Intent(MainActivity.this, AUSTInfo.class);
                        startActivity(intent);
                        aust_btn.getBackground().setAlpha(255);
                        break;
                    case MotionEvent.ACTION_MOVE:

                        break;

                    default:
                        break;
                }
                return false;
            }
        });

        final Button nsu_btn = (Button)findViewById(R.id.nsu_btn);
        nsu_btn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        nsu_btn.getBackground().setAlpha(50);
                        break;
                    case MotionEvent.ACTION_UP:
                        Intent intent=new Intent(MainActivity.this, NSUInfo.class);
                        startActivity(intent);
                        nsu_btn.getBackground().setAlpha(255);
                        break;
                    case MotionEvent.ACTION_MOVE:

                        break;

                    default:
                        break;
                }
                return false;
            }
        });
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
