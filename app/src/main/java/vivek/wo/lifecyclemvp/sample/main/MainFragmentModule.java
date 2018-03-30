package vivek.wo.lifecyclemvp.sample.main;

import dagger.Module;
import dagger.Provides;

/**
 * Created by VIVEK-WO on 2018/3/29.
 */
@Module
public class MainFragmentModule {

    private MainFragmentContact.View mView;

    public MainFragmentModule(MainFragmentContact.View view) {
        mView = view;
    }

    @Provides
    MainFragmentContact.View provideMainFragmentContactView() {
        return mView;
    }
}
