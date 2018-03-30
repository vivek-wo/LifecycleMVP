package vivek.wo.lifecyclemvp.data;

import javax.inject.Inject;
import javax.inject.Singleton;

import vivek.wo.lifecyclemvp.data.source.ApiService;

/**
 * Created by VIVEK-WO on 2018/3/23.
 */
@Singleton
public class TaskRepository {
    private ApiService mApiService;

    @Inject
    TaskRepository(ApiService apiService) {
        mApiService = apiService;
    }

}
