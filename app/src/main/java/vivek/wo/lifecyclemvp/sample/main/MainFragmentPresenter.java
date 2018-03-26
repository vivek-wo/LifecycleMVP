package vivek.wo.lifecyclemvp.sample.main;

import android.content.SharedPreferences;
import android.util.Log;

import javax.inject.Inject;

import vivek.wo.lifecyclemvp.data.TaskRepository;

/**
 * Created by VIVEK-WO on 2018/3/26.
 */

public class MainFragmentPresenter implements MainFragmentContact.Presenter {
    private static final String TAG = "MainFragmentPresenter";

    TaskRepository mTaskRepository;
    SharedPreferences mSharedPreferences;

    @Inject
    MainFragmentPresenter(TaskRepository taskRepository, SharedPreferences sharedPreferences) {
        mTaskRepository = taskRepository;
        mSharedPreferences = sharedPreferences;
        Log.d(TAG, "MainFragmentPresenter: " + mTaskRepository);
        Log.d(TAG, "MainFragmentPresenter: " + mSharedPreferences);
    }
}
