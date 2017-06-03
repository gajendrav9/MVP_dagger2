package gv.mvp_dagger.ui.main;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import gv.mvp_dagger.R;
import gv.mvp_dagger.model.MainModel;


/**
 * Created by hi on 5/21/2017.
 */

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MainViewHolder> {


    private List<MainModel> mMainModel;
   // private  Activity activity;


   @Inject
   public MainAdapter(){
       mMainModel=new ArrayList<>();
   }
   public void setDatas(List<MainModel> list){
       this.mMainModel.addAll(list);
   }



    @Override
    public MainViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycleview_row,parent,false);
        return new MainViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MainViewHolder holder, int position) {


        MainModel model=mMainModel.get(position);
        holder.setData(model);
        holder.tv1.setText(model.getmTitle());
        holder.tv2.setText(model.getmDiscription());

    }



    @Override
    public int getItemCount() {
        return mMainModel.size();
    }

    class MainViewHolder extends RecyclerView.ViewHolder{

        MainModel model;
        @BindView(R.id.title)  TextView tv1;
        @BindView(R.id.description) TextView tv2;
        public MainViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
        public void setData(MainModel model) {
            this.model = model;
        }
    }
}
