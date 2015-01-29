package me.jiangyu.website.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by jiangyukun on 2015/1/29.
 */
public abstract class DateUtil {
    public static String getCurrentDateTimeString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return dateFormat.format(new Date());
    }
}
