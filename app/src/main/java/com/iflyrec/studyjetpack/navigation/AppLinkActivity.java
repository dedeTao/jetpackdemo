package com.iflyrec.studyjetpack.navigation;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.iflyrec.studyjetpack.R;

/**
 * author : twq
 * date : 2019/11/25 15:49
 * desc :
 */
public class AppLinkActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_applink);
        initView();
    }

    private void initView() {
        TextView txtClick = findViewById(R.id.txtClick);
        txtClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri data = Uri.parse("http://www.iflyrec.com/fragment4");
                Intent intent = new Intent(Intent.ACTION_VIEW, data);
                startActivity(intent);
            }
        });
    }
}
