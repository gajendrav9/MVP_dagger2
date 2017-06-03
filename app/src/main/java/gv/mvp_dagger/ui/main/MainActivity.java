package gv.mvp_dagger.ui.main;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import gv.mvp_dagger.R;
import gv.mvp_dagger.model.MainModel;
import gv.mvp_dagger.ui.base.BaseActivity;

public class MainActivity extends BaseActivity implements MainMvpView {

    @Inject
    MainPresenter mMainPresenter;

    @Inject
    MainAdapter mMainAdapter;


    @BindView(R.id.recycleview_list) RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        getActivityComponent().inject(this);
        mMainPresenter.attachView(MainActivity.this);
        //mMainPresenter.loadData(true);
       // mMainPresenter.init();
        //showList();
       // mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        List<MainModel> list= mMainPresenter.loadData(true);

        showData(list);
     //   mMainPresenter.init(list);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setAdapter(mMainAdapter);
       // mMainPresenter.init();
    }


    public static Intent getStartIntent(Context context) {
        Intent intent = new Intent(context, MainActivity.class);
        return intent;
    }




    @Override
    public void showData(List<MainModel> modelList) {
       // mMainAdapter.setData(modelList);
       // mMainAdapter=new MainAdapter(this,modelList);
        mMainAdapter.setDatas(modelList);
        mMainAdapter.notifyDataSetChanged();
      //  mRecyclerView.setAdapter(mMainAdapter);
        //mMainAdapter.setData(modelList);

    }


}
