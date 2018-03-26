package vivek.wo.lifecyclemvp.sample.list;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;

import javax.inject.Inject;

import dagger.android.AndroidInjection;

/**
 * Created by VIVEK-WO on 2018/3/26.
 */

public class ListActivity extends AppCompatActivity implements ListContact.View {

    @Inject
    ListPresenter listPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        FrameLayout layout = new FrameLayout(this);
        layout.setBackgroundColor(Color.GREEN);
        Button button = new Button(this);
        button.setText("BACK");
        layout.addView(button, new FrameLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                FrameLayout.LayoutParams.WRAP_CONTENT));
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                //System.exit(0);//退出进程
            }
        });
        setContentView(layout);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
