package com.a.a.a.base.base.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by Administrator on 2019/5/13 0013.
 */

public abstract class BaseAdapter <T>  extends RecyclerView.Adapter<ViewHolder>{
    public Context mContext;
    public List<T> mList;

    public BaseAdapter(Context mContext, List<T> list){
        this.mContext=mContext;
        this.mList=list;
    }

    @Override
    public int getItemViewType(int position) {
        if(getItemViewType(position,mList.get(position))!=0){
            return  getItemViewType(position,mList.get(position));
        }
        return super.getItemViewType(position);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return ViewHolder.getViewHolder(mContext,parent,layoutId( parent,viewType));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        myBindViewHolder( holder,mList,mList.get(position), position,holder.getAdapterPosition(),getItemViewType(position));
    }

    public void onNotifyDataSetChanged(List<T> list){
        this.mList=list;
        notifyDataSetChanged();
    }

    public ViewHolder getHolder(RecyclerView rv, int position){
        return  (ViewHolder) rv.findViewHolderForAdapterPosition( position); //得到要更新的item的view
    }

    public void addItem(int position,T t){
        mList.add(position,t);
        notifyItemInserted(position);
    }

    public void onItem(int pos){
        notifyItemInserted(pos);
    }

    public void onDelitem(int position ){
        mList.remove(position);
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }
    protected abstract int layoutId(ViewGroup parent, int viewType);//布局
    protected abstract int getItemViewType(int position, T t);//多种item
    //相关逻辑
    protected abstract void myBindViewHolder( ViewHolder holder, List<T> itemList, T itemData, int position, int adapterPosition, int itemViewType);
}
