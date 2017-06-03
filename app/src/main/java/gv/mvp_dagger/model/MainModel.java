package gv.mvp_dagger.model;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

/**
 * Created by hi on 5/22/2017.
 */

public class MainModel {



    @NonNull
    private final String mId;

     @Nullable
     private final String mTitle;

    @Nullable
    private  final  String mDiscription;

    public MainModel(@Nullable String title ,@Nullable String description,@NonNull String Id){
        mId=Id;
        mTitle=title;
        mDiscription=description;
    }

    @NonNull
    public String getmId() {
        return mId;
    }

    @Nullable
    public String getmTitle() {
        return mTitle;
    }

    @Nullable
    public String getmDiscription() {
        return mDiscription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MainModel model = (MainModel) o;
        return mId.equals(model.mId) &&
                mTitle.equals(model.mTitle) &&
                mDiscription.equals(model.mDiscription);
    }
}
