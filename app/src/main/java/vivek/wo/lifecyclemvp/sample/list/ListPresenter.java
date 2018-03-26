package vivek.wo.lifecyclemvp.sample.list;

import android.util.Log;

import javax.inject.Inject;

import vivek.wo.lifecyclemvp.data.TaskRepository;

/**
 * Created by VIVEK-WO on 2018/3/26.
 */

public class ListPresenter implements ListContact.Presenter {
    private static final String TAG = "ListPresenter";
    TaskRepository mTaskRepository;

    @Inject
    ListPresenter(TaskRepository taskRepository) {
        mTaskRepository = taskRepository;
        Log.d(TAG, "MainFragmentPresenter: " + mTaskRepository);
    }
}
