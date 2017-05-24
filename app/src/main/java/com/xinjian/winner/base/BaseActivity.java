package com.xinjian.winner.base;

import javax.inject.Inject;

/**
 * Created by 57490 on 2017/5/23.
 */

public abstract class BaseActivity<T extends BasePresenter> extends SimpleActivity implements BaseView {

    @Inject
    protected T mPresenter;

    protected ActivityComponent getActivityComponent(){

        return null;
    }


}
