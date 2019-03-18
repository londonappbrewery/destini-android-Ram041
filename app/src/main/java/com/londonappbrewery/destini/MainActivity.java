package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
        private Button topButton;
        private Button downButtton;
        private TextView storyLine;
        int index=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        topButton= findViewById(R.id.buttonTop);
        downButtton=findViewById(R.id.buttonBottom);
        storyLine=findViewById(R.id.storyTextView);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

        topButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (index==1||index==2){
                  index   =3;
                storyLine.setText(R.string.T3_Story);
            topButton.setText(R.string.T3_Ans1);
            downButtton.setText(R.string.T3_Ans2);
            }else if(index==3){
                        storyLine.setText(R.string.T6_End);
                            topButton.setVisibility(View.GONE);
                    downButtton.setVisibility(View.GONE);
                }

                }
                }
        );

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
            downButtton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (index == 1) {
                        index = 2;
                        storyLine.setText(R.string.T2_Story);
                        topButton.setText(R.string.T2_Ans1);
                        downButtton.setText(R.string.T2_Ans2);
                    } else if (index == 2) {
                        storyLine.setText(R.string.T4_End);
                        topButton.setVisibility(View.GONE);
                        downButtton.setVisibility(View.GONE);
                    } else if (index == 3) {
                        storyLine.setText(R.string.T5_End);
                        topButton.setVisibility(View.GONE);
                        downButtton.setVisibility(View.GONE);
                    }
                }        });

    }
}
