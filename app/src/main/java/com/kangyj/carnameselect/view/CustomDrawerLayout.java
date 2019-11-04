package com.kangyj.carnameselect.view;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.widget.DrawerLayout;
import android.util.AttributeSet;
import android.view.MotionEvent;

/**
 * author Mr.kang
 * e-mail:kangyoujie@aliyun.com
 * github:https://github.com/Mrkangyj
 * date 2019-10-09
 * desc
 */
public class CustomDrawerLayout extends DrawerLayout {
//    public CustomDrawerLayout(Context context) {
//        this(context, null);
//    }
//
//    public CustomDrawerLayout(Context context, AttributeSet attrs) {
//        this(context, attrs, 0);
//    }
//
//    public CustomDrawerLayout(Context context, AttributeSet attrs, int defStyle) {
//        super(context, attrs, defStyle);
//        final ViewConfiguration configuration = ViewConfiguration
//                .get(getContext());
//        mTouchSlop = configuration.getScaledTouchSlop();
//    }
//
//    private int mTouchSlop;
//    private float mLastMotionX;
//    private float mLastMotionY;
//
//    @Override
//    public boolean onInterceptTouchEvent(MotionEvent ev) {
//        try {
//            final float x = ev.getX();
//            final float y = ev.getY();
//
//            switch (ev.getAction()) {
//                case MotionEvent.ACTION_DOWN:
//                    mLastMotionX = x;
//                    mLastMotionY = y;
//                    break;
//
//                case MotionEvent.ACTION_MOVE:
//                    int xDiff = (int) Math.abs(x - mLastMotionX);
//                    int yDiff = (int) Math.abs(y - mLastMotionY);
//                    final int x_yDiff = xDiff * xDiff + yDiff * yDiff;
//
//                    boolean xMoved = x_yDiff > mTouchSlop * mTouchSlop;
//
//                    if (xMoved) {
//                        if (xDiff > yDiff * 4) {
//                            return true;
//                        } else {
//                            return false;
//                        }
//                    }
//                    break;
//                default:
//
//                    break;
//            }
//            return super.onInterceptTouchEvent(ev);
//        } catch (IllegalArgumentException ex) {
//        }
//        return false;
//    }
//
//    @Override
//    public boolean onTouchEvent(MotionEvent ev) {
//        try {
//            return super.onTouchEvent(ev);
//        } catch (IllegalArgumentException ex) {
//        }
//        return false;
//    }
    float downX;
    float moveX;
    float downY;
    float moveY;

    public CustomDrawerLayout(@NonNull Context context) {
        super(context);
    }

    public CustomDrawerLayout(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomDrawerLayout(@NonNull Context context, @Nullable AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent event) {
//        switch (event.getAction()) {
//            case MotionEvent.ACTION_DOWN:
//                downX = event.getX();
//                downY = event.getY();
//                break;
//            case MotionEvent.ACTION_UP:
//                break;
//            case MotionEvent.ACTION_MOVE:
//                moveX = event.getX();
//                moveY = event.getY();
//                if (moveX - downX > 800 & moveY - downY < 100) {
//                    closeDrawers();
//                }
//                break;
//
//
//        }

        return false;
    }




}
