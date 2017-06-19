package com.xinjian.winner.ui.main.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.miguelcatalan.materialsearchview.MaterialSearchView;
import com.xinjian.winner.R;
import com.xinjian.winner.app.Constants;
import com.xinjian.winner.base.BaseActivity;
import com.xinjian.winner.base.contract.main.MainContract;
import com.xinjian.winner.presenter.main.MainPresenter;

import butterknife.BindView;
import me.yokeyword.fragmentation.SupportFragment;

/**
 * Created by Administrator on 2017/6/12 0012.
 */

public class MainActivity extends BaseActivity<MainPresenter> implements MainContract.View {


    @BindView(R.id.drawer)
    DrawerLayout mDrawerLayout;
    @BindView(R.id.toolbar)
    Toolbar mToolbar;
    @BindView(R.id.navigation)
    NavigationView mNavigationView;
    @BindView(R.id.view_search)
    MaterialSearchView mSearchView;




    MenuItem mLastMenuItem;
    MenuItem mSearchMenuItem;
    ActionBarDrawerToggle mDrawerToggle;

    private int hideFragment = Constants.TYPE_ZHIHU;
    private int showFragment = Constants.TYPE_ZHIHU;

    @Override
    protected void initInject() {
        getActivityComponent().inject(this);
    }

    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }

    /**
     * 由于recreate 需要特殊处理夜间模式
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            mPresenter.setNightModeState(false);
        } else {
            showFragment = mPresenter.getCurrentItem();
            hideFragment = Constants.TYPE_ZHIHU;
            showHideFragment(getTargetFragment(showFragment), getTargetFragment(hideFragment));
            mNavigationView.getMenu().findItem(R.id.drawer_zhihu).setChecked(false);
            mToolbar.setTitle(mNavigationView.getMenu().findItem(getCurrentItem(showFragment)).getTitle().toString());
            hideFragment = showFragment;
        }
    }

    private SupportFragment getTargetFragment(int item) {
        switch (item) {
//            case Constants.TYPE_ZHIHU:
//                return mZhihuFragment;
//            case Constants.TYPE_GANK:
//                return mGankFragment;
//            case Constants.TYPE_WECHAT:
//                return mWechatFragment;
//            case Constants.TYPE_GOLD:
//                return mGoldFragment;
//            case Constants.TYPE_VTEX:
//                return mVtexFragment;
//            case Constants.TYPE_LIKE:
//                return mLikeFragment;
//            case Constants.TYPE_SETTING:
//                return mSettingFragment;
//            case Constants.TYPE_ABOUT:
//                return mAboutFragment;
        }
//        return mZhihuFragment;
        return null;
    }

    private int getCurrentItem(int item) {
        switch (item) {
            case Constants.TYPE_ZHIHU:
                return R.id.drawer_zhihu;
            case Constants.TYPE_GANK:
                return R.id.drawer_gank;
            case Constants.TYPE_WECHAT:
                return R.id.drawer_wechat;
            case Constants.TYPE_GOLD:
                return R.id.drawer_gold;
            case Constants.TYPE_VTEX:
                return R.id.drawer_vtex;
            case Constants.TYPE_LIKE:
                return R.id.drawer_like;
            case Constants.TYPE_SETTING:
                return R.id.drawer_setting;
            case Constants.TYPE_ABOUT:
                return R.id.drawer_about;
        }
        return R.id.drawer_zhihu;
    }


    @Override
    protected void initEventAndData() {

    }

    @Override
    public void showUpdateDialog(String versionContent) {

    }

    @Override
    public void startDownloadService() {

    }
}
