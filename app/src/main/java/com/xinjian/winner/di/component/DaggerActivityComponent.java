package com.xinjian.winner.di.component;

import android.app.Activity;

import com.xinjian.winner.base.BaseActivity;
import com.xinjian.winner.model.DataManager;
import com.xinjian.winner.presenter.main.WelcomePresenter;
import com.xinjian.winner.ui.main.activity.WelcomeActivity;

import javax.annotation.Generated;
import javax.inject.Provider;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import dagger.internal.ScopedProvider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class DaggerActivityComponent implements ActivityComponent {
  private Provider<Activity> provideActivityProvider;
  private Provider<DataManager> getDataManagerProvider;
  private Provider<WelcomePresenter> welcomePresenterProvider;
  private MembersInjector<BaseActivity<WelcomePresenter>> baseActivityMembersInjector;
  private MembersInjector<WelcomeActivity> welcomeActivityMembersInjector;
//  private Provider<MainPresenter> mainPresenterProvider;
//  private MembersInjector<BaseActivity<MainPresenter>> baseActivityMembersInjector1;
//  private MembersInjector<MainActivity> mainActivityMembersInjector;
//  private Provider<ZhihuDetailPresenter> zhihuDetailPresenterProvider;
//  private MembersInjector<BaseActivity<ZhihuDetailPresenter>> baseActivityMembersInjector2;
//  private MembersInjector<RootActivity<ZhihuDetailPresenter>> rootActivityMembersInjector;
//  private MembersInjector<ZhihuDetailActivity> zhihuDetailActivityMembersInjector;
//  private Provider<ThemeChildPresenter> themeChildPresenterProvider;
//  private MembersInjector<BaseActivity<ThemeChildPresenter>> baseActivityMembersInjector3;
//  private MembersInjector<RootActivity<ThemeChildPresenter>> rootActivityMembersInjector1;
//  private MembersInjector<ThemeActivity> themeActivityMembersInjector;
//  private Provider<SectionChildPresenter> sectionChildPresenterProvider;
//  private MembersInjector<BaseActivity<SectionChildPresenter>> baseActivityMembersInjector4;
//  private MembersInjector<RootActivity<SectionChildPresenter>> rootActivityMembersInjector2;
//  private MembersInjector<SectionActivity> sectionActivityMembersInjector;
//  private Provider<RepliesPresenter> repliesPresenterProvider;
//  private MembersInjector<BaseActivity<RepliesPresenter>> baseActivityMembersInjector5;
//  private MembersInjector<RootActivity<RepliesPresenter>> rootActivityMembersInjector3;
//  private MembersInjector<RepliesActivity> repliesActivityMembersInjector;
//  private Provider<NodePresenter> nodePresenterProvider;
//  private MembersInjector<BaseActivity<NodePresenter>> baseActivityMembersInjector6;
//  private MembersInjector<RootActivity<NodePresenter>> rootActivityMembersInjector4;
//  private MembersInjector<NodeListActivity> nodeListActivityMembersInjector;

  private DaggerActivityComponent(Builder builder) {  
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {  
    return new Builder();
  }

  private void initialize(final Builder builder) {  
    this.provideActivityProvider = ScopedProvider.create(ActivityModule_ProvideActivityFactory.create(builder.activityModule));
    this.getDataManagerProvider = new Factory<DataManager>() {
      private final AppComponent appComponent = builder.appComponent;
      @Override public DataManager get() {
        DataManager provided = appComponent.getDataManager();
        if (provided == null) {
          throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
        return provided;
      }
    };
    this.welcomePresenterProvider = WelcomePresenter_Factory.create((MembersInjector) MembersInjectors.noOp(), getDataManagerProvider);
    this.baseActivityMembersInjector = BaseActivity_MembersInjector.create((MembersInjector) MembersInjectors.noOp(), welcomePresenterProvider);
    this.welcomeActivityMembersInjector = MembersInjectors.delegatingTo(baseActivityMembersInjector);
    this.mainPresenterProvider = MainPresenter_Factory.create((MembersInjector) MembersInjectors.noOp(), getDataManagerProvider);
    this.baseActivityMembersInjector1 = BaseActivity_MembersInjector.create((MembersInjector) MembersInjectors.noOp(), mainPresenterProvider);
    this.mainActivityMembersInjector = MembersInjectors.delegatingTo(baseActivityMembersInjector1);
    this.zhihuDetailPresenterProvider = ZhihuDetailPresenter_Factory.create((MembersInjector) MembersInjectors.noOp(), getDataManagerProvider);
    this.baseActivityMembersInjector2 = BaseActivity_MembersInjector.create((MembersInjector) MembersInjectors.noOp(), zhihuDetailPresenterProvider);
    this.rootActivityMembersInjector = MembersInjectors.delegatingTo(baseActivityMembersInjector2);
    this.zhihuDetailActivityMembersInjector = MembersInjectors.delegatingTo(rootActivityMembersInjector);
    this.themeChildPresenterProvider = ThemeChildPresenter_Factory.create((MembersInjector) MembersInjectors.noOp(), getDataManagerProvider);
    this.baseActivityMembersInjector3 = BaseActivity_MembersInjector.create((MembersInjector) MembersInjectors.noOp(), themeChildPresenterProvider);
    this.rootActivityMembersInjector1 = MembersInjectors.delegatingTo(baseActivityMembersInjector3);
    this.themeActivityMembersInjector = MembersInjectors.delegatingTo(rootActivityMembersInjector1);
    this.sectionChildPresenterProvider = SectionChildPresenter_Factory.create((MembersInjector) MembersInjectors.noOp(), getDataManagerProvider);
    this.baseActivityMembersInjector4 = BaseActivity_MembersInjector.create((MembersInjector) MembersInjectors.noOp(), sectionChildPresenterProvider);
    this.rootActivityMembersInjector2 = MembersInjectors.delegatingTo(baseActivityMembersInjector4);
    this.sectionActivityMembersInjector = MembersInjectors.delegatingTo(rootActivityMembersInjector2);
    this.repliesPresenterProvider = RepliesPresenter_Factory.create((MembersInjector) MembersInjectors.noOp(), getDataManagerProvider);
    this.baseActivityMembersInjector5 = BaseActivity_MembersInjector.create((MembersInjector) MembersInjectors.noOp(), repliesPresenterProvider);
    this.rootActivityMembersInjector3 = MembersInjectors.delegatingTo(baseActivityMembersInjector5);
    this.repliesActivityMembersInjector = MembersInjectors.delegatingTo(rootActivityMembersInjector3);
    this.nodePresenterProvider = NodePresenter_Factory.create((MembersInjector) MembersInjectors.noOp(), getDataManagerProvider);
    this.baseActivityMembersInjector6 = BaseActivity_MembersInjector.create((MembersInjector) MembersInjectors.noOp(), nodePresenterProvider);
    this.rootActivityMembersInjector4 = MembersInjectors.delegatingTo(baseActivityMembersInjector6);
    this.nodeListActivityMembersInjector = MembersInjectors.delegatingTo(rootActivityMembersInjector4);
  }

  @Override
  public Activity getActivity() {  
    return provideActivityProvider.get();
  }

  @Override
  public void inject(WelcomeActivity welcomeActivity) {  
    welcomeActivityMembersInjector.injectMembers(welcomeActivity);
  }

  @Override
  public void inject(MainActivity mainActivity) {  
    mainActivityMembersInjector.injectMembers(mainActivity);
  }

  @Override
  public void inject(ZhihuDetailActivity zhihuDetailActivity) {  
    zhihuDetailActivityMembersInjector.injectMembers(zhihuDetailActivity);
  }

  @Override
  public void inject(ThemeActivity themeActivity) {  
    themeActivityMembersInjector.injectMembers(themeActivity);
  }

  @Override
  public void inject(SectionActivity sectionActivity) {  
    sectionActivityMembersInjector.injectMembers(sectionActivity);
  }

  @Override
  public void inject(RepliesActivity repliesActivity) {  
    repliesActivityMembersInjector.injectMembers(repliesActivity);
  }

  @Override
  public void inject(NodeListActivity nodeListActivity) {  
    nodeListActivityMembersInjector.injectMembers(nodeListActivity);
  }

  public static final class Builder {
    private ActivityModule activityModule;
    private AppComponent appComponent;
  
    private Builder() {  
    }
  
    public ActivityComponent build() {  
      if (activityModule == null) {
        throw new IllegalStateException("activityModule must be set");
      }
      if (appComponent == null) {
        throw new IllegalStateException("appComponent must be set");
      }
      return new DaggerActivityComponent(this);
    }
  
    public Builder activityModule(ActivityModule activityModule) {  
      if (activityModule == null) {
        throw new NullPointerException("activityModule");
      }
      this.activityModule = activityModule;
      return this;
    }
  
    public Builder appComponent(AppComponent appComponent) {  
      if (appComponent == null) {
        throw new NullPointerException("appComponent");
      }
      this.appComponent = appComponent;
      return this;
    }
  }
}

