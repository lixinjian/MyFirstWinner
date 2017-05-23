package com.xinjian.winner.di.component;


import com.xinjian.winner.app.App;
import com.xinjian.winner.di.module.AppModule;
import com.xinjian.winner.di.module.HttpModule;
import com.xinjian.winner.model.DataManager;
import com.xinjian.winner.model.db.RealmHelper;
import com.xinjian.winner.model.http.RetrofitHelper;
import com.xinjian.winner.model.prefs.ImplPreferencesHelper;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by codeest on 16/8/7.
 */

@Singleton
@Component(modules = {AppModule.class, HttpModule.class})
public interface AppComponent {

    App getContext();  // 提供App的Context

    DataManager getDataManager(); //数据中心

    RetrofitHelper retrofitHelper();  //提供http的帮助类

    RealmHelper realmHelper();    //提供数据库帮助类

    ImplPreferencesHelper preferencesHelper(); //提供sp帮助类
}
