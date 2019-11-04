package com.kangyj.carnameselect.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.kangyj.carnameselect.model.CarBrand;
import com.kangyj.carnameselect.R;

import java.util.List;

/**
 * author Mr.kang
 * e-mail:kangyoujie@aliyun.com
 * github:https://github.com/Mrkangyj
 * date 2019-10-08
 * desc 热门车牌
 */
public class HotCarGridAdapter extends BaseAdapter {
    private Context mContext;
    private List<CarBrand.DataBean.HotBean> mList;

    public HotCarGridAdapter(Context context, List<CarBrand.DataBean.HotBean> mList) {
        this.mContext = context;
        this.mList = mList;
    }


    @Override
    public int getCount() {
        return mList == null ? 0 : mList.size();
    }

    @Override
    public CarBrand.DataBean.HotBean getItem(int position) {
        return mList == null ? null : mList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        HotCarViewHolder holder;
        if (view == null) {
            view = LayoutInflater.from(mContext).inflate(R.layout.item_car_hot, parent, false);
            holder = new HotCarViewHolder();
            holder.name = view.findViewById(R.id.car_brand);
            view.setTag(holder);
        } else {
            holder = (HotCarViewHolder) view.getTag();
        }
        holder.name.setText(mList.get(position).getName());
        return view;
    }

    public static class HotCarViewHolder {
        TextView name;
    }
}

