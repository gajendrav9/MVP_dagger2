package gv.mvp_dagger.dagger.component;

import android.app.Activity;

import dagger.Component;
import gv.mvp_dagger.dagger.PerActivity;
import gv.mvp_dagger.dagger.module.ActivityModule;
import gv.mvp_dagger.ui.main.MainActivity;
import gv.mvp_dagger.ui.splash.SplashActivity;

/**
 * Created by hi on 5/26/2017.
 */
@PerActivity
@Component(dependencies = AppComponent.class,modules = ActivityModule.class)
public interface ActivityComponent {

    Activity activity();
    void inject(SplashActivity activity);
    void inject(MainActivity mainActivity);
}
