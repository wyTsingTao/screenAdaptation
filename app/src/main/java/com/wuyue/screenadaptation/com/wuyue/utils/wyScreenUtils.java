package com.wuyue.screenadaptation.com.wuyue.utils;

import android.content.Context;
import android.graphics.Point;
import android.view.Display;
import android.view.WindowManager;

import com.wuyue.screenadaptation.com.wuyue.main.WYScreenAppliaction;

/**
 * @author wuyue
 * @date 2015/10/27
 * @time 14:42
 */
public class wyScreenUtils {
    /**
     * 得到屏幕的宽度
     *
     * @return
     */
    public static int getScreenWidth() {
        WindowManager manager = (WindowManager) WYScreenAppliaction.getInstance()
                .getSystemService(Context.WINDOW_SERVICE);
        Display display = manager.getDefaultDisplay();
        // 低于版本13的
        if (android.os.Build.VERSION.SDK_INT <
                android.os.Build.VERSION_CODES.HONEYCOMB_MR2) {
            return display.getWidth();
        } else {
            Point point = new Point();
            display.getSize(point);
            return point.x;
        }
    }

    /**
     * 得到屏幕的高度
     *
     * @return
     */
    public static int getScreenHeight() {
        WindowManager manager = (WindowManager) WYScreenAppliaction.getInstance()
                .getSystemService(Context.WINDOW_SERVICE);
        Display display = manager.getDefaultDisplay();
        // 低于版本13的
        if (android.os.Build.VERSION.SDK_INT <
                android.os.Build.VERSION_CODES.HONEYCOMB_MR2) {
            return display.getHeight();
        } else {
            Point point = new Point();
            display.getSize(point);

            return point.y;
        }
    }

    /**
     * dp转px
     * @param dp
     * @return
     */
    public static float dpToPx(int dp) {
        return dp * WYScreenAppliaction.getInstance().getResources().getDisplayMetrics().density;
    }

    /**
     * px转dp
     * @param pxValue
     * @return
     */
    public static int pxTodp( float pxValue) {
        final float scale =WYScreenAppliaction.getInstance().getResources().getDisplayMetrics().density;
        return (int) (pxValue / scale + 0.5f);
    }
}
