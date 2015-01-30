package me.jiangyu.website.spi;

/**
 * Created by jiangyukun on 2015/1/30.
 */
public class JournalRemind {
    private short hour;
    private short minute;
    private short second;

    JournalRemind(short hour, short minute, short second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public short getHour() {
        return hour;
    }

    public short getMinute() {
        return minute;
    }

    public short getSecond() {
        return second;
    }
}
