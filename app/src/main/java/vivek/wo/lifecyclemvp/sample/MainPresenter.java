package vivek.wo.lifecyclemvp.sample;

import android.content.SharedPreferences;
import android.util.Log;

import javax.inject.Inject;

import vivek.wo.lifecyclemvp.data.TaskRepository;

/**
 * Created by VIVEK-WO on 2018/3/23.
 */

public class MainPresenter implements MainContact.Presenter {
    MainContact.View mView;

    private static final String TAG = "MainPresenter";

    TaskRepository mTaskRepository;
    SharedPreferences mSharedPreferences;

    @Inject
    MainPresenter(TaskRepository taskRepository, SharedPreferences sharedPreferences) {
        mTaskRepository = taskRepository;
        mSharedPreferences = sharedPreferences;
        Log.d(TAG, "MainPresenter: " + mTaskRepository);
        Log.d(TAG, "MainPresenter: " + mSharedPreferences);
    }

    @Override
    public void takeView(MainContact.View view) {
        mView = view;
    }

    @Override
    public void dropView() {
        mView = null;
    }
}
