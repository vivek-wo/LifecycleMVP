package vivek.wo.lifecyclemvp.sample.detail;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import javax.inject.Inject;

import vivek.wo.lifecyclemvp.BaseApplication;

/**
 * Created by VIVEK-WO on 2018/3/26.
 */

public class DetailFragment extends Fragment implements DetailFragmentContact.View {

    @Inject
    DetailFragmentPresenter detailFragmentPresenter;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DaggerDetailFragmentComponent.builder()
                .baseApplicationComponent(((BaseApplication) getActivity().getApplicationContext())
                        .getBaseApplicationComponent())
                .detaiFragmentlModule(new DetaiFragmentlModule(this))
                .build().inject(this);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable
            Bundle savedInstanceState) {
        FrameLayout layout = new FrameLayout(getContext());
        layout.setBackgroundColor(Color.RED);
        return layout;
    }
}
