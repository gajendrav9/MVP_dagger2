package gv.mvp_dagger.ui.splash;

import android.content.Intent;
import android.os.Bundle;

import javax.inject.Inject;

import gv.mvp_dagger.R;
import gv.mvp_dagger.ui.base.BaseActivity;
import gv.mvp_dagger.ui.main.MainActivity;

/**
 * Created by hi on 5/24/2017.
 */

public class SplashActivity extends BaseActivity implements SplashMvpView {

    @Inject
    SplashPresenter splashPresenter;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        getActivityComponent().inject(this);

        splashPresenter.attachView(SplashActivity.this);

        splashPresenter.startSplash();

    }


    @Override
    public void openMainActivity() {
        Intent intent= MainActivity.getStartIntent(SplashActivity.this);
        startActivity(intent);
        finish();
    }



    @Override
    protected  void onDestroy(){
        splashPresenter.detachView();
        super.onDestroy();

    }




}
