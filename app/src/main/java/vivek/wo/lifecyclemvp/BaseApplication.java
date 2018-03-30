package vivek.wo.lifecyclemvp;

import android.app.Application;

/**
 * Created by VIVEK-WO on 2018/3/23.
 */

public class BaseApplication extends Application {

    private BaseApplicationComponent mBaseApplicationComponent;

    public void onCreate() {
        super.onCreate();
        mBaseApplicationComponent = DaggerBaseApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }

    public BaseApplicationComponent getBaseApplicationComponent() {
        return mBaseApplicationComponent;
    }

}
