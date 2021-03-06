package gv.mvp_dagger.ui.base;

/**
 * Created by hi on 5/24/2017.
 */

public abstract class BasePresenter<V extends MvpView> implements Presenter<V> {

    private V mMvpView;

    @Override
    public void attachView(V mvpView) {
        mMvpView=mvpView;

    }

    @Override
    public void detachView() {
        mMvpView=null;
    }

    public V getMvpView(){
        return mMvpView;
    }

    public boolean isViewAttached(){
        return mMvpView !=null;
    }

    public void checkViewAttached(){
        if(!isViewAttached()) throw new MvpViewNotAttachedException();
    }

    //  }


    public static  class MvpViewNotAttachedException extends RuntimeException {

        public MvpViewNotAttachedException() {
            super("Please call Presenter.attachView(MvpView) before" +
                    " requesting data to the Presenter");
        }
    }
}
