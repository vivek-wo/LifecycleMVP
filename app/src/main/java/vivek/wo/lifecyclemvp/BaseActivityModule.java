package vivek.wo.lifecyclemvp;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import vivek.wo.lifecyclemvp.sample.BaseFragmentModule;
import vivek.wo.lifecyclemvp.sample.MainActivity;
import vivek.wo.lifecyclemvp.sample.list.ListActivity;

/**
 * Created by VIVEK-WO on 2018/3/26.
 */
@Module
public abstract class BaseActivityModule {

    @ContributesAndroidInjector(modules = BaseFragmentModule.class)
    abstract MainActivity mainActivity();

    @ContributesAndroidInjector
    abstract ListActivity listActivity();
}
