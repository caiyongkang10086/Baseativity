package com.cvte.ativity;

import android.app.Activity;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class ActivityController {
    private static final String TAG = "ActivityController";
    private static List<Activity> activities = new ArrayList<>();
    public static ActivityController getInstance () {
        ActivityController activityController = new ActivityController();
        return  activityController;
    }
    void addActivity(Activity activity) {
        Log.d(TAG,"addActivity : " + activity);
        activities.add(activity);
    }
    void removeActivity(Activity activity) {
        Log.d(TAG,"removeActivity : " + activity);
        activities.remove(activity);
    }
    void activityAllFinish() {
        Log.d(TAG,"activityAllFinish");
        for(Activity activity : activities) {
            if (!activity.isFinishing()) {
                activity.finish();
            }
        }
        activities.clear();
    }
}
