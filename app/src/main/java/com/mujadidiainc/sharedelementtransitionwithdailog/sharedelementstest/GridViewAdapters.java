package com.mujadidiainc.sharedelementtransitionwithdailog.sharedelementstest;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.mujadidiainc.sharedelementtransitionwithdailog.R;

public class GridViewAdapters extends BaseAdapter {

    private static final int SIZE = 50;

    private final LayoutInflater mInflater;
    private Context mContext;

    public GridViewAdapters(Context context) {
        mContext = context;
        mInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return SIZE;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        final View v = mInflater.inflate(R.layout.grid_item, null);

        v.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                Intent i = new Intent(new Intent(mContext, DialogActivity.class));
                ActivityOptions options = ActivityOptions
                        .makeSceneTransitionAnimation((Activity) mContext,
                                Pair.create(v.findViewById(R.id.image), "image_transition"));
                mContext.startActivity(i, options.toBundle());
            }
        });

        v.findViewById(R.id.image).refreshDrawableState();

        return v;
    }
}
