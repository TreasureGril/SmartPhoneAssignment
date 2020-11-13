package com.example.a18990255_007.bean;

import com.example.a18990255_007.R;

import java.util.ArrayList;

public class GoodsInfo {
    public long rowid; // 行号
    public int sn; // 序号
    public String name; // 名称
    public String desc; // 描述
    public float price; // 价格
    public String thumb_path; // 小图的保存路径
    public String pic_path; // 大图的保存路径
    public int thumb; // 小图的资源编号
    public int pic; // 大图的资源编号

    public GoodsInfo() {
        rowid = 0L;
        sn = 0;
        name = "";
        desc = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
    }

    private static String[] mNameArray = {
            "huaweimate30", "huaweip40", "huawei plus20", "huaweipro30", "huaweip40", "huaweipro20",
    };
    // 声明一个手机商品的描述数组
    private static String[] mDescArray = {
            "mate 30 pr 全网通5G手机",
            "huaweip 40 全网通5G手机",
            "huawei  plus20 全网通5G手机",
            "huawei pro 30 全网通4G智能手机",
            "huawei p40 pr+ 全网通5G手机",
            "huawei 畅想20 pro  全网通5G手机"
    };
    // 声明一个手机商品的价格数组
    private static float[] mPriceArray = {5649, 7499, 2249, 2449, 6199, 2249,};
    // 声明一个手机商品的小图数组

    private static int[] mThumbArray = {
            R.drawable.huawei_mate30_s, R.drawable.huawei_p40_s, R.drawable.huawei_plus20_s,
            R.drawable.huawei_pro30_s, R.drawable.huawei_p40_pro_s, R.drawable.huawei_pro20_s,
    };
    // 声明一个手机商品的大图数组
    private static int[] mPicArray = {
            R.drawable.huawei_mate30, R.drawable.huawei_p40, R.drawable.huawei_plus20,
            R.drawable.huawei_pro30, R.drawable.huawei_p40_pro, R.drawable.huawei_pro20,
    };

    // 获取默认的手机信息列表
    public static ArrayList<GoodsInfo> getDefaultList() {
        ArrayList<GoodsInfo> goodsList = new ArrayList<GoodsInfo>();
        for (int i = 0; i < mNameArray.length; i++) {
            GoodsInfo info = new GoodsInfo();
            info.name = mNameArray[i];
            info.desc = mDescArray[i];
            info.price = mPriceArray[i];
            info.thumb = mThumbArray[i];
            info.pic = mPicArray[i];
            goodsList.add(info);
        }
        return goodsList;
    }
}
