package com.apnatutorials.androidgridlayout;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showImage(View view) {

        switch (view.getId()) {

            case R.id.heritage1:
                showImageDetail(R.drawable.heritage1_min);
                break;
            case R.id.heritage2:
                showImageDetail(R.drawable.heritage2_min);
                break;

            case R.id.heritage3:
                showImageDetail(R.drawable.heritage3_min);
                break;

            case R.id.heritage4:
                showImageDetail(R.drawable.heritage4_min);
                break;

            case R.id.heritage5:
                showImageDetail(R.drawable.heritage5_min);
                break;

            case R.id.heritage6:
                showImageDetail(R.drawable.heritage6_min);
                break;

            case R.id.heritage7:
                showImageDetail(R.drawable.heritage6_min);
                break;
            case R.id.heritage8:
                showImageDetail(R.drawable.heritage7_min);
                break;
            case R.id.heritage9:
                showImageDetail(R.drawable.heritage6_min);
                break;
            case R.id.heritage10:
                showImageDetail(R.drawable.heritage6_min);
                break;

        }
    }

    public void showImageDetail(int img) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Image detail");
        ImageView iv = new ImageView(this);

        iv.setImageResource(img);

        iv.setBackgroundResource(R.drawable.round_shape);
        builder.setView(iv);
        builder.setNeutralButton("Close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        builder.show();
    }
}
