package com.rawks.jeremy.fancybuttons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity
{
    ImageButton btnThumbDown;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnThumbDown = findViewById(R.id.btnThumbDown);

        btnThumbDown.setOnTouchListener(new View.OnTouchListener()
        {
            @Override
            public boolean onTouch(View view, MotionEvent event)
            {
                switch (event.getAction())
                {
                    case MotionEvent.ACTION_DOWN:
                        btnThumbDown.setBackgroundColor(getResources().getColor(R.color.colorAccentDark));
                        break;
                    case MotionEvent.ACTION_UP:
                        btnThumbDown.setBackgroundColor(getResources().getColor(R.color.colorAccent));
                        view.performClick();
                        break;
                    default:
                        break;
                }
                return true;
            }

        });
    }
}
