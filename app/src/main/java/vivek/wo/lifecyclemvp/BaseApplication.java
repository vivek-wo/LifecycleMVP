package vivek.wo.lifecyclemvp;

import android.app.Activity;
import android.app.Application;
import android.util.Log;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;
import dagger.android.support.DaggerApplication;
import vivek.wo.lifecyclemvp.data.TaskRepository;

/**
 * Created by VIVEK-WO on 2018/3/23.
 */

public class BaseApplication extends Application implements HasActivityInjector {
    private static final String TAG = "BaseApplication";

    @Inject
    DispatchingAndroidInjector<Activity> dispatchingAndroidInjector;
    @Inject
    TaskRepository taskRepository;

    @Override
    public void onCreate() {
        super.onCreate();
        DaggerBaseApplicationComponent.builder().applicationContext(this).build().inject(this);
        Log.d(TAG, "onCreate: " + dispatchingAndroidInjector);
        Log.d(TAG, "onCreate: " + taskRepository);
    }

    @Override
    public AndroidInjector<Activity> activityInjector() {
        return dispatchingAndroidInjector;
    }
}
