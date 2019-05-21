package com.a.a.a.base.base.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

/**
 * Created by Administrator on 2019/5/13 0013.
 */

public class ViewHolder extends RecyclerView.ViewHolder{

    private View mConvertView;
    private Context mContext;
    private SparseArray<View> mViews;

    public ViewHolder(View itemView,Context context) {
        super(itemView);
        this.mContext = context;
        this.mConvertView = itemView;
        this.mViews = new SparseArray<>();
    }
    public static ViewHolder getViewHolder(Context context, ViewGroup parent, int layoutId){
        View itemView = LayoutInflater.from(context).inflate(layoutId, parent, false);
        ViewHolder holder = new ViewHolder( itemView, context);
        return holder;
    }

    public <T extends View> T getView(int viewId){
        View view = mViews.get(viewId);
        if (view == null){
            view = mConvertView.findViewById(viewId);
            mViews.put(viewId, view);
        }
        return (T) view;
    }

    public ViewHolder setText(int viewId,String text){
        if(text!=null){
            TextView view = getView(viewId);
            view.setText(text);
        }
        return this;
    }
    public ViewHolder setTextColor(int viewId,int colorId){
        TextView view = getView(viewId);
        view.setTextColor(mContext.getResources().getColor(colorId));
        return this;
    }
    public ViewHolder setTextSize(int viewId,int size){
        TextView view = getView(viewId);
        view.setTextSize(size);
        return this;
    }
    public ViewHolder setTextBackgroundResource(int viewId, int backgroundId){//设置背景图片
        TextView view = getView(viewId);
        view.setBackgroundResource(backgroundId);
        return this;
    }
    public ViewHolder setImageResource(int viewId, int resId){
        ImageView view = getView(viewId);
        view.setImageResource(resId);
        return this;
    }
    public ViewHolder setIamgeBackground(int viewId,String url){
        ImageView view = getView(viewId);
//        .placeholder(R.mipmap.def_loading_avatar).error(R.mipmap.def_loading_avatar)
        Glide.with(view.getContext()).load(url).asBitmap().into(view);
        return this;
    }
    public ViewHolder setIamgeBackground(ImageView view,String url){
        Glide.with(view.getContext()).load(url).asBitmap().into(view);
        return this;
    }


//    /** 图片 高斯模糊
//     */
//    public ViewHolder setIamgeBackground(int viewId,String url ,int s){
//        ImageView view = getView(viewId);
//        Glide.with(mContext).load(url)
//                .transform(new BlurTransformation(view.getContext(), s))
//                .crossFade()
//                .into(view);
//        return this;
//    }

    public ViewHolder setGifBackground(int viewId,String url){
        ImageView view = getView(viewId);
        return this;
    }

    public ViewHolder setOnClickListener(int viewId, View.OnClickListener listener){
        View view = getView(viewId);
        view.setOnClickListener(listener);
        return this;
    }
    public ViewHolder setVisibility(int viewId,int type){
        View view = getView(viewId);
        view.setVisibility(type);
        return this;
    }
    public ViewHolder setTag(int id,boolean type){
        getView(id).setTag(type);
        return this;
    }
    public ViewHolder setAlpha(int id,int alpha){
        View v = getView(id);
        v.getBackground().mutate().setAlpha(alpha);
        return this;
    }

}
