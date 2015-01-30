package me.jiangyu.website.spi;

import me.jiangyu.website.core.WebSiteException;

/**
 * Created by jiangyukun on 2015/1/30.
 */
public class JournalRemindBuilder {
    public static short hour;
    public static short minute;
    public static short second;

    public JournalRemind builder() {
        check();
        try {
            return new JournalRemind(hour, minute, second);
        } finally {
            hour = minute = second = 0;
        }
    }

    private void check() {
        if (hour < 0 || hour > 23) {
            throw new WebSiteException("incorrect hour setting");
        }
        if (minute < 0 || minute > 59) {
            throw new WebSiteException("incorrect minute setting");
        }
        if (second < 0 || second > 59) {
            throw new WebSiteException("incorrect minute setting");
        }
    }
}
