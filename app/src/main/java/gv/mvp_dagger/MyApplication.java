package gv.mvp_dagger;

import android.app.Application;
import android.content.Context;

import gv.mvp_dagger.dagger.component.AppComponent;
import gv.mvp_dagger.dagger.component.DaggerAppComponent;
import gv.mvp_dagger.dagger.module.AppModule;

/**
 * Created by hi on 5/24/2017.
 */

public class MyApplication extends Application  {

    private AppComponent appComponent;

    @Override
    public void onCreate(){
        super.onCreate();
        this.createComponent();

    }


    public static MyApplication get(Context context){
        return (MyApplication)context.getApplicationContext();
    }


    private void createComponent(){
         this.appComponent=DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }



    public AppComponent getAppComponent() {

        return appComponent;

    }



    public void setComponent(AppComponent appComponent){
        this.appComponent=appComponent;
    }

}

