package me.jiangyu.website.domain;

import org.hibernate.validator.constraints.CreditCardNumber;
import org.hibernate.validator.constraints.Range;

import javax.persistence.*;

/**
 * Created by jiangyukun on 2015/1/30.
 */
@Entity
@Table(name = "yun_settting")
public class UserSetting extends IdEntity {
    private short hour;
    private short minute;
    private short second;

    @Range(min = 0, max = 23)
    public short getHour() {
        return hour;
    }

    public void setHour(short hour) {
        this.hour = hour;
    }

    @Range(min = 0, max = 59)
    public short getMinute() {
        return minute;
    }

    public void setMinute(short minute) {
        this.minute = minute;
    }

    @Range(min = 0, max = 59)
    public short getSecond() {
        return second;
    }

    public void setSecond(short second) {
        this.second = second;
    }

}
