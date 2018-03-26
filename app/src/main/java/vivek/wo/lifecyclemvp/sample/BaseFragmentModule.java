package vivek.wo.lifecyclemvp.sample;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import vivek.wo.lifecyclemvp.sample.detail.DetaiFragmentlModule;
import vivek.wo.lifecyclemvp.sample.detail.DetailFragment;
import vivek.wo.lifecyclemvp.sample.main.MainFragment;

/**
 * Created by VIVEK-WO on 2018/3/26.
 */
@Module
public abstract class BaseFragmentModule {

    @ContributesAndroidInjector
    abstract MainFragment mainFragment();

    @ContributesAndroidInjector(modules = DetaiFragmentlModule.class)
    abstract DetailFragment detailFragment();
}
