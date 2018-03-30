package vivek.wo.lifecyclemvp.sample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import javax.inject.Inject;

import vivek.wo.lifecyclemvp.BaseApplication;
import vivek.wo.lifecyclemvp.R;
import vivek.wo.lifecyclemvp.sample.detail.DetailFragment;
import vivek.wo.lifecyclemvp.sample.list.ListActivity;
import vivek.wo.lifecyclemvp.sample.main.MainFragment;

public class MainActivity extends AppCompatActivity implements MainContact.View {
    private static final String TAG = "MainActivity";
    @Inject
    MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerMainComponent.builder()
                .baseApplicationComponent(((BaseApplication) getApplicationContext())
                        .getBaseApplicationComponent())
                .mainModule(new MainModule(this))
                .build().inject(this);
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.main_container, new MainFragment(), "MainFragment")
                .commit();
        Log.d(TAG, "onCreate: " + mainPresenter);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
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
