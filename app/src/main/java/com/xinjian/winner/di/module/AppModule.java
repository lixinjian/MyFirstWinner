package com.xinjian.winner.di.module;

import com.xinjian.winner.app.App;
import com.xinjian.winner.model.http.HttpHelper;
import com.xinjian.winner.model.http.RetrofitHelper;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Administrator on 2017/5/19 0019.
 */

@Module
public class AppModule {

    private final App application;


    public AppModule(App application) {
        this.application = application;
    }

    @Provides
    @Singleton
    App provideApplicitionContext() {
        return application;
    }

    HttpHelper provideHttpHelper(RetrofitHelper retrofitHelper) {
        return retrofitHelper;
    }


}
