package com.example.homework10;

import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.homework10.constant.ImageList;
import com.example.homework10.util.Utils;
import com.example.homework10.widget.BannerIndicator;

public class BannerIndicatorActivity extends AppCompatActivity implements BannerIndicator.BannerClickListener {
    private static final String TAG = "BannerIndicatorActivity";
    private TextView tv_pager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banner_indicator);
        // 从布局文件中获取名叫banner_indicator的横幅指示器
        BannerIndicator banner = findViewById(R.id.banner_indicator);
        tv_pager = findViewById(R.id.tv_pager);
        LayoutParams params = (LayoutParams) banner.getLayoutParams();
        params.height = (int) (Utils.getScreenWidth(this) * 250f / 640f);
        // 设置横幅指示器的布局参数
        banner.setLayoutParams(params);
        // 设置横幅指示器的广告图片队列
        banner.setImage(ImageList.getDefault());
        // 设置横幅指示器的广告点击监听器
        banner.setOnBannerListener(this);
    }

    // 一旦点击了广告图，就回调监听器的onBannerClick方法
    public void onBannerClick(int position) {
        String desc = String.format("您已进入第一张图片代表的商品页", position + 1);
        Log.d(TAG,desc );
        tv_pager.setText(desc);
    }
}