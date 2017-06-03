package gv.mvp_dagger.ui.splash;

import java.util.concurrent.TimeUnit;

import javax.inject.Inject;

import gv.mvp_dagger.ui.base.BasePresenter;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by hi on 5/24/2017.
 */
public class SplashPresenter extends BasePresenter<SplashMvpView>  {

    private static final int SPLASH_TIME_SECONDS = 3;

    @Inject
    public SplashPresenter(){

    }


    @Override
    public void attachView(SplashMvpView mvpView) {
        super.attachView(mvpView);
    }

    @Override
    public void detachView() {
        super.detachView();
    }

    public void startSplash() {
        Observable.timer(SPLASH_TIME_SECONDS, TimeUnit.SECONDS)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(time -> getMvpView().openMainActivity());
    }

}
