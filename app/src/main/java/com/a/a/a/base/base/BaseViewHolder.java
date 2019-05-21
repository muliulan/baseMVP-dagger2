package com.a.a.a.base.base;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * Created by zcs on 2018/6/15 0015.
 */

public class BaseViewHolder extends RecyclerView.ViewHolder{

    private View mConvertView;
    private Context mContext;
    private SparseArray<View> mViews;

    public BaseViewHolder(View itemView,Context context) {
        super(itemView);
        this.mContext = context;
        this.mConvertView = itemView;
        this.mViews = new SparseArray<>();
    }
     static BaseViewHolder getViewHolder(Context context, ViewGroup parent, int layoutId){
        View itemView = LayoutInflater.from(context).inflate(layoutId, parent, false);
        return new BaseViewHolder( itemView, context);
    }
//
//     <T extends View> T getView(int viewId){
//        View view = mViews.get(viewId);
//        if (view == null){
//            view = mConvertView.findViewById(viewId);
//            mViews.put(viewId, view);
//        }
//        return (T) view;
//    }
//
//    public BaseViewHolder setText(int viewId,String text){
//        if(text!=null){
//            TextView view = getView(viewId);
//            view.setText(text);
//        }
//        return this;
//    }
//    public BaseViewHolder setTextColor(int viewId,int colorId){
//        TextView view = getView(viewId);
//        view.setTextColor(mContext.getResources().getColor(colorId));
//        return this;
//    }
//    public BaseViewHolder setTextSize(int viewId,int size){
//        TextView view = getView(viewId);
//        view.setTextSize(size);
//        return this;
//    }
//    public BaseViewHolder setTextBackgroundResource(int viewId, int backgroundId){//设置背景图片
//        TextView view = getView(viewId);
//        view.setBackgroundResource(backgroundId);
//        return this;
//    }
//    public BaseViewHolder setImageResource(int viewId, int resId){
//        ImageView view = getView(viewId);
//        view.setImageResource(resId);
//        return this;
//    }
//    public BaseViewHolder setIamgeBackground(int viewId,String url){
//        ImageView view = getView(viewId);
//        Glide.with(view.getContext()).load(url).into(view);
//        return this;
//    }
//    public BaseViewHolder setIamgeBackground(ImageView view,String url){
//        Glide.with(view.getContext()).load(url).into(view);
//        return this;
//    }
//
//    public BaseViewHolder setGifBackground(int viewId,String url){
//        ImageView view = getView(viewId);
////        Glide.with(view.getContext()).load(url).placeholder(R.mipmap.def_loading_avatar).error(R.mipmap.def_loading_avatar)
////                .skipMemoryCache(true)//跳过内存缓存
////                .into(view);
//        return this;
//    }
//
//    public BaseViewHolder setOnClickListener(int viewId, View.OnClickListener listener){
//        View view = getView(viewId);
//        view.setOnClickListener(listener);
//        return this;
//    }
//    public BaseViewHolder setVisibility(int viewId,int type){
//        View view = getView(viewId);
//        view.setVisibility(type);
//        return this;
//    }
//    public BaseViewHolder setTag(int id,boolean type){
//        getView(id).setTag(type);
//        return this;
//    }
//    public BaseViewHolder setAlpha(int id,int alpha){
//        View v = getView(id);
//        v.getBackground().mutate().setAlpha(alpha);
//        return this;
//    }
}
