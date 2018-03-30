package vivek.wo.lifecyclemvp.sample.main;

import dagger.Component;
import vivek.wo.lifecyclemvp.BaseApplicationComponent;
import vivek.wo.lifecyclemvp.Scoped;

/**
 * Created by VIVEK-WO on 2018/3/29.
 */
@Scoped
@Component(dependencies = BaseApplicationComponent.class, modules = MainFragmentModule.class)
public interface MainFragmentComponent {
    void inject(MainFragment mainFragment);
}
