package com.example.homework005.bean;

import com.example.homework005.R;

import java.util.ArrayList;

public class Planet {

    public int image;
    public String name;
    public String desc;

    public Planet(int image, String name, String desc) {
        this.image = image;
        this.name = name;
        this.desc = desc;
    }

    private static int[] iconArray = { R.drawable.huawei_mate30_s, R.drawable.huawei_p40_s, R.drawable.huawei_plus20_s,
            R.drawable.huawei_pro30_s, R.drawable.huawei_p40_pro_s, R.drawable.huawei_pro20_s,
            };
    private static String[] nameArray = {"huaweimate30", "huaweip40", "huawei plus20", "huaweipro30", "huaweip40", "huaweipro20","iphone","oppo"};
    private static String[] descArray = {
            "mate 30 pr 全网通5G手机",
            "huaweip 40 全网通5G手机",
            "huawei  plus20 全网通5G手机",
            "huawei pro 30 全网通4G智能手机",
            "huawei p40 pr+ 全网通5G手机",
            "huawei 畅想20 pro  全网通5G手机",
            "苹果手机大甩卖",
            "oppo 新款手机"
    };

    public static ArrayList<Planet> getDefaultList() {
        ArrayList<Planet> planetList = new ArrayList<Planet>();
        for (int i = 0; i < iconArray.length; i++) {
            planetList.add(new Planet(iconArray[i], nameArray[i], descArray[i]));
        }
        return planetList;
    }
}