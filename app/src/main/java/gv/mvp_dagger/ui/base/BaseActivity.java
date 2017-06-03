package gv.mvp_dagger.ui.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import gv.mvp_dagger.MyApplication;
import gv.mvp_dagger.dagger.component.ActivityComponent;
import gv.mvp_dagger.dagger.component.AppComponent;
import gv.mvp_dagger.dagger.component.DaggerActivityComponent;
import gv.mvp_dagger.dagger.module.ActivityModule;

/**
 * Class activity that every other Activity in this application must implement. It handles
 * creation of Dagger components and makes sure that instances of ConfigPersistentComponent survive
 * across configuration changes.
 */
public  class BaseActivity extends AppCompatActivity {
    private ActivityComponent mActivityComponent;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        this.getAppComponent().inject(this);
    }



    protected ActivityComponent getActivityComponent() {
        if (mActivityComponent == null) {
            mActivityComponent = DaggerActivityComponent.builder()
                    .appComponent(getAppComponent())
                    .activityModule(getActivityModule())
                    .build();
        }
        return mActivityComponent;
    }

    // Activity module for dependency injection
    protected ActivityModule getActivityModule(){
        return new ActivityModule(this);
    }

   // Main Application component for dependency injection.
    protected AppComponent getAppComponent() {
        return ((MyApplication) getApplication()).getAppComponent();
    }

}