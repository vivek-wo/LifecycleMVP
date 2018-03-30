package vivek.wo.lifecyclemvp.sample.list;

import dagger.Module;
import dagger.Provides;

/**
 * Created by VIVEK-WO on 2018/3/23.
 */
@Module
public class ListModule {

    private ListContact.View mView;

    public ListModule(ListContact.View view) {
        mView = view;
    }

    @Provides
    ListContact.View provideListContactView() {
        return mView;
    }
}

