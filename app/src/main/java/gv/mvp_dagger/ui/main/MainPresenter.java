package gv.mvp_dagger.ui.main;

import java.util.List;

import javax.inject.Inject;

import gv.mvp_dagger.model.MainModel;
import gv.mvp_dagger.model.MainModelList;
import gv.mvp_dagger.ui.base.BasePresenter;

/**
 * Created by hi on 6/1/2017.
 */

public class MainPresenter extends BasePresenter<MainMvpView> {

    @Inject
    public MainPresenter(){

    }


    @Override
    public void attachView(MainMvpView mvpView) {
        super.attachView(mvpView);
    }

    @Override
    public void detachView() {
        super.detachView();
    }


  //  public List<MainModel> loadModelList(boolean forceUpdate) {
   //     return MainModelList.getInstance().getModelList();
  //  }
  public void init(List<MainModel> data){
      //List<MainModel> data=new ArrayList<>();
       getMvpView().showData(data);


   }
    public List<MainModel> loadData(boolean forceUpdate){
        return MainModelList.getInstance().getModelList();
    }

}
