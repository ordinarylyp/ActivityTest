package com.lyp.activitytest;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lyp on 2018/4/19.
 */

public class ActivityCollector {   //活动管理器
    public static List<Activity> activities=new ArrayList<>();
    public static void addActivity (Activity activity){
        activities.add(activity);    //将创建活动添加到活动管理器
    }
    public static void removeActivity(Activity activity){
        activities.remove(activity);   //移除活动
    }
    public static void finishAll(){
        for (Activity activity:activities){
            if(!activity.isFinishing()){
                activity.finish();
            }
        }
        activities.clear();  //结束所有活动
        android.os.Process.killProcess(android.os.Process.myPid());
    }
}
