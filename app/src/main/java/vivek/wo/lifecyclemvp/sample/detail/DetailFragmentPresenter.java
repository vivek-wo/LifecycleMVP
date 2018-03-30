package vivek.wo.lifecyclemvp.sample.detail;

import android.content.SharedPreferences;
import android.util.Log;

import javax.inject.Inject;

import vivek.wo.lifecyclemvp.data.TaskRepository;

/**
 * Created by VIVEK-WO on 2018/3/26.
 */

public class DetailFragmentPresenter implements DetailFragmentContact.Presenter {
    private static final String TAG = "DetailFragmentPresenter";
    DetailFragmentContact.View mView;
    TaskRepository mTaskRepository;
    SharedPreferences mSharedPreferences;

    @Inject
    DetailFragmentPresenter(DetailFragmentContact.View view, TaskRepository taskRepository,
                            SharedPreferences sharedPreferences) {
        mView = view;
        mTaskRepository = taskRepository;
        mSharedPreferences = sharedPreferences;
        Log.d(TAG, "DetailFragmentPresenter: " + mTaskRepository);
        Log.d(TAG, "DetailFragmentPresenter: " + mSharedPreferences);
    }

}
