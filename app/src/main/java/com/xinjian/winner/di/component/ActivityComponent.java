package com.xinjian.winner.di.component;

import android.app.Activity;


import com.xinjian.winner.di.module.ActivityModule;
import com.xinjian.winner.di.scope.ActivityScope;
import com.xinjian.winner.ui.main.activity.WelcomeActivity;

import dagger.Component;

/**
 * Created by codeest on 16/8/7.
 */

@ActivityScope
@Component(dependencies = AppComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    Activity getActivity();

    void inject(WelcomeActivity welcomeActivity);
//
//    void inject(MainActivity mainActivity);
//
//    void inject(ZhihuDetailActivity zhihuDetailActivity);
//
//    void inject(ThemeActivity themeActivity);
//
//    void inject(SectionActivity sectionActivity);
//
//    void inject(RepliesActivity repliesActivity);
//
//    void inject(NodeListActivity nodeListActivity);
}
