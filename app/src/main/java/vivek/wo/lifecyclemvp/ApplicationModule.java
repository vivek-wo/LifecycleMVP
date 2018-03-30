package vivek.wo.lifecyclemvp;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by VIVEK-WO on 2018/3/29.
 */
@Singleton
@Module
public class ApplicationModule {
    private final Context mContext;

    public ApplicationModule(Context context) {
        mContext = context;
    }

    @Provides
    BaseApplication provideBaseApplication() {
        return (BaseApplication) mContext;
    }

    @Provides
    Context provideContext() {
        return mContext;
    }
}
