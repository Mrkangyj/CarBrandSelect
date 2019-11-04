package com.kangyj.carnameselect.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.kangyj.carnameselect.R;
import com.kangyj.carnameselect.model.CarSries;

import java.util.List;

/**
 * author Mr.kang
 * e-mail:kangyoujie@aliyun.com
 * github:https://github.com/Mrkangyj
 * date 2019-10-09
 * desc 车系
 */
public class CarSeriesAdapter extends BaseAdapter {

    private Context mContext;
    private List<CarSries.InfoBean> mList;
    private LayoutInflater inflater;

    public CarSeriesAdapter(Context mContext, List<CarSries.InfoBean> mList) {
        this.mContext = mContext;
        this.mList = mList;
        this.inflater = LayoutInflater.from(mContext);
        mList.add(0, new CarSries.InfoBean("不限车系"));
    }

    @Override
    public int getCount() {
        return mList == null ? 0 : mList.size();
    }

    @Override
    public CarSries.InfoBean getItem(int position) {
        return mList == null ? null : mList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        CarViewHolder holder;
        if (view == null) {
            holder = new CarViewHolder();
            view = inflater.inflate(R.layout.item_car_series, parent, false);
            holder.name = view.findViewById(R.id.car_brand);
            holder.num = view.findViewById(R.id.car_num);
            holder.logo = view.findViewById(R.id.car_image);
            holder.layout = view.findViewById(R.id.layout);
            view.setTag(holder);
        } else {
            holder = (CarViewHolder) view.getTag();
        }
        if (position==0){
            holder.logo.setVisibility(View.GONE);
            holder.num.setVisibility(View.GONE);
        }else {
            holder.logo.setVisibility(View.VISIBLE);
            holder.num.setVisibility(View.VISIBLE);
        }
        holder.name.setText(mList.get(position).getName());
//        holder.num.setText("约"+mList.get(position).getId()+"辆");
        return view;
    }

    public static class CarViewHolder {
        TextView name;
        TextView num;
        ImageView logo;
        LinearLayout layout;
    }
}
