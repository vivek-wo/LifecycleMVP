package vivek.wo.lifecyclemvp.sample;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import javax.inject.Inject;

import dagger.android.AndroidInjection;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.HasSupportFragmentInjector;
import vivek.wo.lifecyclemvp.R;
import vivek.wo.lifecyclemvp.sample.detail.DetailFragment;
import vivek.wo.lifecyclemvp.sample.list.ListActivity;
import vivek.wo.lifecyclemvp.sample.main.MainFragment;

public class MainActivity extends AppCompatActivity implements HasSupportFragmentInjector {
    private static final String TAG = "MainActivity";

    @Inject
    DispatchingAndroidInjector<Fragment> dispatchingAndroidInjector;
    @Inject
    MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.main_container, new MainFragment(), "MainFragment")
                .commit();
        Log.d(TAG, "onCreate: " + dispatchingAndroidInjector);
        Log.d(TAG, "onCreate: " + mainPresenter);
    }

    @Override
    public AndroidInjector<Fragment> supportFragmentInjector() {
        return dispatchingAndroidInjector;
    }

    public void onIntentClick(View view) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.main_container, new DetailFragment(), "DetailFragment")
                .commit();
    }

    public void onIntentListClick(View view) {
        startActivity(new Intent(this, ListActivity.class));
        finish();
    }
}
