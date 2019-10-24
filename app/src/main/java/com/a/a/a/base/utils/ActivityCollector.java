package com.a.a.a.base.utils;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2019/6/27 0027.
 */

public class ActivityCollector {

    public   List<Activity> activities = new ArrayList<>();
    private static ActivityCollector activitycollector;

    private ActivityCollector() {

    }

    /**
     * 单一实例
     */
    public static ActivityCollector getAppManager() {
        if (activitycollector == null) {
            activitycollector = new ActivityCollector();
        }
        return activitycollector;
    }


    public void addActivity(Activity activity){
        activities.add(activity);
    }

    public void removeActivity(Activity activity){
        activities.remove(activity);
    }

    public void finishAll(){
        for(Activity activity : activities){
            if(!activity.isFinishing()){
                activity.finish();
            }
        }
    }
    /**
     * 结束指定类名的Activity
     */
    public void finishActivity(Class<?> cls) {
        for (Activity activity : activities) {
            if (activity.getClass().equals(cls)) {
                finishActivity(activity);
            }
        }
    }
    /**
     * 结束指定的Activity
     */
    public void finishActivity(Activity activity) {
        if (activity != null) {
            activities.remove(activity);
            activity.finish();
            activity = null;
        }
    }
}
