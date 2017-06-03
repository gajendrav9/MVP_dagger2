package gv.mvp_dagger.dagger.component;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Component;
import gv.mvp_dagger.MyApplication;
import gv.mvp_dagger.dagger.ApplicationContext;
import gv.mvp_dagger.dagger.module.AppModule;
import gv.mvp_dagger.ui.base.BaseActivity;

/**
 * A component whose lifetime is the life of the application.
 */
@Singleton  // Constraints this component to one-per-application or unscoped bindings.
@Component(modules = AppModule.class)
public interface AppComponent {

    void inject(BaseActivity baseActivity);


    //Exposed to sub-graphs.
    @ApplicationContext
    Context context();


    MyApplication application();

}
