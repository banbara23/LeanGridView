package com.ikemura.leangridview;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import java.util.List;

public class GridAdapter extends BaseAdapter {
    private Context mContext;
    private LayoutInflater mLayoutInflater;
    private int layoutId;
    private List<Integer> imageList;

    public GridAdapter(Context context, int layoutId, List<Integer> imageList) {
        mContext = context;
        mLayoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.layoutId = layoutId;
        this.imageList = imageList;
    }

    @Override
    public int getCount() {
        return imageList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        int image = imageList.get(i);
        if (view == null) {
            view = mLayoutInflater.inflate(layoutId, viewGroup, false);
        }
        ImageView imageView = view.findViewById(R.id.image);
        if (imageView != null) {
            imageView.setImageDrawable(ContextCompat.getDrawable(mContext, image));
        }
        return view;
    }
}
