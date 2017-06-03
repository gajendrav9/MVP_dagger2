package gv.mvp_dagger.dagger.module;

import android.content.Context;

import dagger.Module;
import dagger.Provides;
import gv.mvp_dagger.MyApplication;
import gv.mvp_dagger.dagger.ApplicationContext;

/**
 * Dagger module that provides objects which will live during the application lifecycle.
 */
@Module
public class AppModule {

    private final MyApplication mApplication;

    public AppModule(MyApplication application) {
        this.mApplication =application;
    }

    @Provides
    MyApplication provideApplication(){
        return mApplication;
    }

    @Provides
    @ApplicationContext
    Context provideContext(){
        return mApplication;
    }


}
