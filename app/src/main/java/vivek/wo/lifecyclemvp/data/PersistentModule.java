package vivek.wo.lifecyclemvp.data;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.prefs.Preferences;

import javax.inject.Singleton;

import dagger.Component;
import dagger.Module;
import dagger.Provides;

/**
 * Created by VIVEK-WO on 2018/3/23.
 */
@Module
public class PersistentModule {

    @Singleton
    @Provides
    SharedPreferences providePreference(Context context) {
        return context.getSharedPreferences("shared_pref", Context.MODE_PRIVATE);
    }

}
