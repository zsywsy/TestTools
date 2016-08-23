package mzs.libapp.ctrl;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;

import butterknife.ButterKnife;
import butterknife.Unbinder;
import mzs.libapp.api.ClickLsn;
import mzs.libapp.app.AppManager;
import mzs.libapp.api.CtrlApi;


public abstract class BaseActivity extends FragmentActivity implements CtrlApi, ClickLsn {

    private Unbinder unbinder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (AppManager.getAppManager().getActivityStack().size() == 0) {
            onFirstActivityCreate();
        }
        AppManager.getAppManager().addActivity(this);
        init();
    }


    @Override
    public void init() {
        initUI();
        initData();
        unbinder = ButterKnife.bind(this);
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
    protected void onDestroy() {
        super.onDestroy();
        AppManager.getAppManager().finishActivity(this);
        if (AppManager.getAppManager().getActivityStack().size() == 0) {
            onAllActivityDestroy();
        }
//        unbindBK(unbinder);
    }

    private void onFirstActivityCreate() {
    }

    private void onAllActivityDestroy() {
    }

    private void unbindBK(Unbinder unbinder) {
        if (unbinder != null)
            unbinder.unbind();
    }

    @Override
    public void doClick(View v) {

    }

    @Override
    public void doItemClick(int position) {

    }
}
