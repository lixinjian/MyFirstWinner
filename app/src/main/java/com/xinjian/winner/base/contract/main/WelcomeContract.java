package com.xinjian.winner.base.contract.main;


import com.xinjian.winner.base.BasePresenter;
import com.xinjian.winner.base.BaseView;
import com.xinjian.winner.model.bean.WelcomeBean;

/**
 * Created by codeest on 16/8/15.
 */

public interface WelcomeContract {

    interface View extends BaseView {

        void showContent(WelcomeBean welcomeBean);

        void jumpToMain();

    }

    interface  Presenter extends BasePresenter<View> {

        void getWelcomeData();

    }
}
