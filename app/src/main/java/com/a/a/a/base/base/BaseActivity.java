package com.a.a.a.base.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.a.a.a.base.R;
import com.a.a.a.base.utils.ActivityCollector;

/**
 * Created by Administrator on 2019/5/21 0021.
 */

public class BaseActivity extends AppCompatActivity implements View.OnClickListener{

    private ActivityCollector appManager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        appManager = ActivityCollector.getAppManager();
        appManager.addActivity(this);
        setOnclick();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(appManager!=null){
            appManager.removeActivity(this);
        }
    }

    public void setOnclick(){
        View image_lift = findViewById(R.id.image_lift);
        if(image_lift!=null){
            image_lift.setOnClickListener(this);
        }
    }
    public void setImage(int resId ,int type){
        ImageView image_lift = findViewById(R.id.image_lift);
        ImageView image_right = findViewById(R.id.image_right);
        if(image_lift!=null && type==1){
            image_lift.setImageResource(resId);
        }if(image_right!=null && type==2){
            image_right.setImageResource(resId);
        }
    }

    public void setTitle(String text,int type){
        TextView title = findViewById(R.id.title);
        TextView right_title = findViewById(R.id.right_title);
        if(title!=null && type==1){
            title.setText(text);
        }if(right_title!=null && type==2){
            right_title.setText(text);
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.image_lift:
                finish();
                break;
        }
    }
}
