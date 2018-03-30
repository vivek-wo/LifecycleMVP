package vivek.wo.lifecyclemvp.sample;

import android.content.SharedPreferences;
import android.util.Log;

import javax.inject.Inject;

import vivek.wo.lifecyclemvp.data.TaskRepository;

/**
 * Created by VIVEK-WO on 2018/3/23.
 */

public class MainPresenter implements MainContact.Presenter {
    private static final String TAG = "MainPresenter";

    MainContact.View mView;
    TaskRepository mTaskRepository;
    SharedPreferences mSharedPreferences;

    @Inject
    MainPresenter(MainContact.View view, TaskRepository taskRepository, SharedPreferences
            sharedPreferences) {
        mView = view;
        mTaskRepository = taskRepository;
        mSharedPreferences = sharedPreferences;
        Log.d(TAG, "MainPresenter: " + mTaskRepository);
        Log.d(TAG, "MainPresenter: " + mSharedPreferences);
    }

}
