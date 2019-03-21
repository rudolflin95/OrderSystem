package tw.tcnr.cos.c0201.recyclerAdpter;

import android.widget.ImageView;

public class MyItem {
    private String mImageUrl;
    private String mTitle;
    private int mArrow;

    public MyItem(String imageUrl, String title, int arrow){
        mImageUrl=imageUrl;
        mTitle=title;
        mArrow=arrow;
    }

    public String getImageUrl(){
        return mImageUrl;
    }

    public String getTitle(){
        return mTitle;
    }

    public int getmArrow(){
        return mArrow;
    }
}
