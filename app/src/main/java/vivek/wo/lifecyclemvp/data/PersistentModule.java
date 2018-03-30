package vivek.wo.lifecyclemvp.data;

import android.content.Context;
import android.content.SharedPreferences;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by VIVEK-WO on 2018/3/23.
 */
@Module
public class PersistentModule {

    @Provides
    @Singleton
    SharedPreferences provideSharedPreferences(Context context) {
        return context.getSharedPreferences("shared_pref", Context.MODE_PRIVATE);
    }

}
