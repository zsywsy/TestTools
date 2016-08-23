package mzs.libapp.ctrl;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;
import butterknife.Unbinder;
import mzs.libapp.api.ClickLsn;
import mzs.libapp.api.CtrlApi;

/**
 * Created by 24275 on 2016/6/14.
 */
public abstract class BaseFragment extends Fragment implements CtrlApi, ClickLsn {

    private LayoutInflater inflater;
    private ViewGroup container;
    private View layout;
    private Unbinder unbinder;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        this.inflater = inflater;
        this.container = container;
        init();
        return layout;
    }


    @Override
    public void init() {
        initUI();
        initData();
        unbinder = ButterKnife.bind(this, layout);
        initView();
        initEvent();
    }

    @Override
    public void initData() {

    }

    @Override
    public void initView() {

    }

    @Override
    public void initEvent() {

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    protected void setContentView(int layoutResID) {
        layout = inflater.inflate(layoutResID, container, false);
    }

    @Override
    public void doClick(View v) {

    }

    @Override
    public void doItemClick(int position) {

    }



}
