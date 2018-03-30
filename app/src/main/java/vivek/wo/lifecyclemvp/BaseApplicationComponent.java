package vivek.wo.lifecyclemvp;

import android.content.SharedPreferences;

import javax.inject.Singleton;

import dagger.Component;
import vivek.wo.lifecyclemvp.data.PersistentModule;
import vivek.wo.lifecyclemvp.data.TaskRepository;
import vivek.wo.lifecyclemvp.data.source.ApiServiceModule;
import vivek.wo.lifecyclemvp.data.source.OkHttpClientModule;

/**
 * Created by VIVEK-WO on 2018/3/23.
 */
@Singleton
@Component(modules = {PersistentModule.class,
        ApiServiceModule.class,
        OkHttpClientModule.class,
        ApplicationModule.class})
public interface BaseApplicationComponent {

    TaskRepository getTaskRepository();

    SharedPreferences getSharedPreferences();
}
