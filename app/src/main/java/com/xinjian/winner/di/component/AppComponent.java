package com.xinjian.winner.di.component;

import com.xinjian.winner.app.App;
import com.xinjian.winner.di.module.AppModule;

import dagger.Component;

/**
 * Created by Administrator on 2017/5/19 0019.
 */

@javax.inject.Singleton
@Component(modules = AppModule.class,HttpModule.class)
public interface AppComponent {

    App getContext(); //提供app的context

}
