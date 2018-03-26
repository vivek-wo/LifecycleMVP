package vivek.wo.lifecyclemvp;

import android.content.Context;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;
import vivek.wo.lifecyclemvp.data.PersistentModule;
import vivek.wo.lifecyclemvp.data.TaskRepository;

/**
 * Created by VIVEK-WO on 2018/3/23.
 */
@Singleton
@Component(modules = {AndroidInjectionModule.class,
        AndroidSupportInjectionModule.class,
        PersistentModule.class,
        BaseActivityModule.class})
public interface BaseApplicationComponent extends AndroidInjector<BaseApplication> {

    TaskRepository getTaskRepository();

    //Context getApplicationContext();

    @Component.Builder
    interface Builder {
        BaseApplicationComponent build();

        @BindsInstance
        Builder applicationContext(Context context);
    }

}
