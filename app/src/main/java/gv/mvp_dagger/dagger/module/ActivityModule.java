package gv.mvp_dagger.dagger.module;

import android.app.Activity;
import android.content.Context;

import dagger.Module;
import dagger.Provides;
import gv.mvp_dagger.dagger.ActivityContext;
import gv.mvp_dagger.dagger.PerActivity;

/**
 * Created by hi on 5/26/2017.
 */
@Module
public class ActivityModule {
    private Activity mActivity;

    public ActivityModule(Activity activity){
        this.mActivity=activity;
    }




    @Provides
    @PerActivity
    public Activity provideActivity(){
        return mActivity;
    }


    @Provides
    @ActivityContext
    Context provideContext(){
        return mActivity;
    }



}
