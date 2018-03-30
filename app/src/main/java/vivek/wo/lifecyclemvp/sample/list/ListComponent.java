package vivek.wo.lifecyclemvp.sample.list;

import dagger.Component;
import vivek.wo.lifecyclemvp.BaseApplicationComponent;
import vivek.wo.lifecyclemvp.Scoped;

/**
 * Created by VIVEK-WO on 2018/3/23.
 */
@Scoped
@Component(dependencies = BaseApplicationComponent.class, modules = ListModule.class)
public interface ListComponent {
    void inject(ListActivity listActivity);
}
