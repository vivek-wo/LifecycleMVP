package vivek.wo.lifecyclemvp.sample.detail;

import dagger.Component;
import vivek.wo.lifecyclemvp.BaseApplicationComponent;
import vivek.wo.lifecyclemvp.Scoped;

/**
 * Created by VIVEK-WO on 2018/3/29.
 */
@Scoped
@Component(dependencies = BaseApplicationComponent.class, modules = DetaiFragmentlModule.class)
public interface DetailFragmentComponent {
    void inject(DetailFragment detailFragment);
}
