package gv.mvp_dagger.ui.main;

import java.util.List;

import gv.mvp_dagger.model.MainModel;
import gv.mvp_dagger.ui.base.MvpView;


/**
 * Created by hi on 5/21/2017.
 */

public interface MainMvpView extends MvpView {
    void showData(List<MainModel> modelList);


}
