package vivek.wo.lifecyclemvp.sample;

import dagger.Component;
import vivek.wo.lifecyclemvp.BaseApplicationComponent;
import vivek.wo.lifecyclemvp.Scoped;

/**
 * Created by VIVEK-WO on 2018/3/23.
 */
@Scoped
@Component(dependencies = BaseApplicationComponent.class, modules = MainModule.class)
public interface MainComponent {
    void inject(MainActivity mainActivity);
}
