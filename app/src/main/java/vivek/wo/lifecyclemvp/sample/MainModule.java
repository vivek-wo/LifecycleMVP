package vivek.wo.lifecyclemvp.sample;

import dagger.Module;
import dagger.Provides;

/**
 * Created by VIVEK-WO on 2018/3/23.
 */
@Module
public class MainModule {

    private MainContact.View mView;

    public MainModule(MainContact.View view) {
        mView = view;
    }

    @Provides
    MainContact.View provideMainContactView() {
        return mView;
    }
}

