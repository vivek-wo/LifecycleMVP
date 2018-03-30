package vivek.wo.lifecyclemvp.sample.detail;

import dagger.Module;
import dagger.Provides;

/**
 * Created by VIVEK-WO on 2018/3/26.
 */
@Module
public class DetaiFragmentlModule {

    private DetailFragmentContact.View mView;

    public DetaiFragmentlModule(DetailFragmentContact.View view) {
        mView = view;
    }

    @Provides
    DetailFragmentContact.View provideDetailFragmentContactView() {
        return mView;
    }
}
