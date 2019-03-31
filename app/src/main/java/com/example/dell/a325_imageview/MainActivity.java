package com.example.dell.a325_imageview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewManager;
import android.view.ViewParent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText editText;
    private ImageView imageView;
    private ProgressBar progressBar;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.button_1);
        editText = (EditText) findViewById(R.id.edit_text);
        imageView = (ImageView) findViewById(R.id.image_view);
        progressBar = (ProgressBar) findViewById(R.id.progress_bar);

        button1.setOnClickListener(this);

    }
    /*public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_1:
                imageView.setImageResource(R.drawable.ic_launcher_background);
                    break;
            default:
                break;
            }

        }
    */
    /*
    Page 89
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_1:
                if (progressBar.getVisibility() == View.GONE) {
                    progressBar.setVisibility(View.VISIBLE);
                } else {
                    progressBar.setVisibility(View.GONE);
                }
                break;
            default:
                break;
        }
    }*/

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_1:
                int progress = progressBar.getProgress();
                progress = progress + 10;
                progressBar.setProgress(progress);
                break;
            default:
                break;
        }
    }
}
