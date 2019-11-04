package com.kangyj.carnameselect.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.kangyj.carnameselect.model.CarBrand;
import com.kangyj.carnameselect.R;
import com.kangyj.carnameselect.SpellUtil;
import com.kangyj.carnameselect.view.WrapHeightGridView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * author:Mr.kang
 * e-mail:kangyoujie@aliyun.com
 * github:https://github.com/Mrkangyj
 * date:2019-10-08
 * desc: 车品牌
 */
public class CarBrandAdapter extends BaseAdapter {
    private static final int VIEW_TYPE_COUNT = 3;

    private Context mContext;
    private LayoutInflater inflater;
    private List<CarBrand.DataBean.AllBean> mList;
    private List<CarBrand.DataBean.HotBean> hotList;
    private HashMap<String, Integer> letterIndexes;
    private String[] sections;
    private OnItemClickListener onitemClickListener;

    public CarBrandAdapter(Context mContext, List<CarBrand.DataBean.AllBean> mList, List<CarBrand.DataBean.HotBean> hotList) {
        this.mContext = mContext;
        this.mList = mList;
        this.hotList = hotList;
        this.inflater = LayoutInflater.from(mContext);
        if (mList == null) {
            mList = new ArrayList<>();
        }
        mList.add(0, new CarBrand.DataBean.AllBean("0"));
        mList.add(1, new CarBrand.DataBean.AllBean("1"));
        int size = mList.size();
        letterIndexes = new HashMap<>();
        sections = new String[size];
        for (int index = 0; index < size; index++) {
            //当前拼音首字母
            String currentLetter = SpellUtil.getFirstLetter(SpellUtil.getSpell(mList.get(index).getName()));
            //上个首字母，如果不存在设为""
            String previousLetter = index >= 1 ? SpellUtil.getFirstLetter(SpellUtil.getSpell(mList.get(index - 1).getName())) : "";
            if (!TextUtils.equals(currentLetter, previousLetter)) {
                letterIndexes.put(currentLetter, index);
                sections[index] = currentLetter;
            }
        }
    }


    /**
     * 获取字母索引的位置
     *
     * @param letter
     * @return
     */
    public int getLetterPosition(String letter) {
        Integer integer = letterIndexes.get(letter);
        return integer == null ? -1 : integer;
    }

    @Override
    public int getViewTypeCount() {
        return VIEW_TYPE_COUNT;
    }

    @Override
    public int getItemViewType(int position) {
        return position < VIEW_TYPE_COUNT - 1 ? position : VIEW_TYPE_COUNT - 1;
    }

    @Override
    public int getCount() {
        return mList == null ? 0 : mList.size();
    }

    @Override
    public CarBrand.DataBean.AllBean getItem(int position) {
        return mList == null ? null : mList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View view, ViewGroup parent) {
        CarViewHolder holder;
        int viewType = getItemViewType(position);
        switch (viewType) {
            case 0: // 热门
                view = inflater.inflate(R.layout.item_car_hot_grid, parent, false);
                WrapHeightGridView gridView = view.findViewById(R.id.grid_view);
                final HotCarGridAdapter adapter = new HotCarGridAdapter(mContext, hotList);
                gridView.setAdapter(adapter);
                gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        if (onitemClickListener != null) {
                            onitemClickListener.onHotClick(adapter.getItem(position));
                        }
                    }
                });
                break;
            case 1:  //*
                view = inflater.inflate(R.layout.item_car_all, parent, false);
                holder = new CarViewHolder();
                holder.letter = view.findViewById(R.id.car_letter);
                holder.name = view.findViewById(R.id.car_brand);
                holder.logo = view.findViewById(R.id.car_image);
                holder.layout = view.findViewById(R.id.layout);

                holder.letter.setText(mList.get(position).getName());
                holder.name.setText("不限品牌");
                holder.logo.setVisibility(View.GONE);
                holder.layout.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (onitemClickListener != null) {
                            onitemClickListener.onAllClick(mList.get(position));
                        }
                    }
                });
                break;
            case 2:     //所有
                if (view == null) {
                    view = inflater.inflate(R.layout.item_car_all, parent, false);
                    holder = new CarViewHolder();
                    holder.letter = view.findViewById(R.id.car_letter);
                    holder.name = view.findViewById(R.id.car_brand);
                    holder.logo = view.findViewById(R.id.car_image);
                    holder.layout = view.findViewById(R.id.layout);
                    view.setTag(holder);
                } else {
                    holder = (CarViewHolder) view.getTag();
                }
                if (position >= 1) {
                    final String city = mList.get(position).getName();
                    holder.name.setText(city);
                    String currentLetter = SpellUtil.getFirstLetter(SpellUtil.getSpell(mList.get(position).getName()));
                    String previousLetter = position >= 1 ? SpellUtil.getFirstLetter(SpellUtil.getSpell(mList.get(position - 1).getName())) : "";
                    if (!TextUtils.equals(currentLetter, previousLetter)) {
                        holder.letter.setVisibility(View.VISIBLE);
                        holder.letter.setText(currentLetter);
                    } else {
                        holder.letter.setVisibility(View.GONE);
                    }
                    holder.layout.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (onitemClickListener != null) {
                                onitemClickListener.onAllClick(mList.get(position));
                            }
                        }
                    });
                }
                break;
        }
        return view;
    }


    public static class CarViewHolder {
        TextView letter;
        TextView name;
        ImageView logo;
        LinearLayout layout;
    }

    public void setOnItemClickListener(OnItemClickListener listener) {
        this.onitemClickListener = listener;
    }

    public interface OnItemClickListener {

        void onAllClick(CarBrand.DataBean.AllBean infoBean);

        void onHotClick(CarBrand.DataBean.HotBean infoBean);

    }
}
