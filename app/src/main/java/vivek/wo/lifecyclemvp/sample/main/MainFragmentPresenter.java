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

    MainFragmentContact.View mView;
    TaskRepository mTaskRepository;
    SharedPreferences mSharedPreferences;

    @Inject
    MainFragmentPresenter(MainFragmentContact.View view, TaskRepository taskRepository,
                          SharedPreferences sharedPreferences) {
        mView = view;
        mTaskRepository = taskRepository;
        mSharedPreferences = sharedPreferences;
        Log.d(TAG, "MainFragmentPresenter: " + mTaskRepository);
        Log.d(TAG, "MainFragmentPresenter: " + mSharedPreferences);
    }

}
