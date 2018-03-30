package vivek.wo.lifecyclemvp.sample.list;

import android.util.Log;

import javax.inject.Inject;

import vivek.wo.lifecyclemvp.data.TaskRepository;

/**
 * Created by VIVEK-WO on 2018/3/26.
 */

public class ListPresenter implements ListContact.Presenter {
    private static final String TAG = "ListPresenter";
    ListContact.View mView;
    TaskRepository mTaskRepository;

    @Inject
    ListPresenter(ListContact.View view, TaskRepository taskRepository) {
        mView = view;
        mTaskRepository = taskRepository;
        Log.d(TAG, "MainFragmentPresenter: " + mTaskRepository);
    }
}
