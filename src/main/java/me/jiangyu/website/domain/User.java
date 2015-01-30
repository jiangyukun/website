package me.jiangyu.website.domain;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by jiangyukun on 2014/11/21.
 */
@Entity
@Table(name = "yun_user")
public class User extends IdEntity {
    private String username;
    private String nickname;
    private String password;
    private String email;
    private String mobile;
    private String introduce;
    private String registrationDate;
    private int loginTimes;
    private boolean isUsed;
    private boolean isActivity;
    private List<Memo> memos;

    private List<Journal> journals;

    /* add */
    private UserSetting userSetting;

    @Column(unique = true, nullable = false, length = 20)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Column(length = 50)
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Length(min = 4)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Email
    @Column(unique = true, nullable = false, length = 30)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Length(min = 11, max = 11)
    @Column(unique = true, nullable = false, length = 20)
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    public int getLoginTimes() {
        return loginTimes;
    }

    public void setLoginTimes(int loginTimes) {
        this.loginTimes = loginTimes;
    }

    public boolean isUsed() {
        return isUsed;
    }

    public void setUsed(boolean isUsed) {
        this.isUsed = isUsed;
    }

    public boolean isActivity() {
        return isActivity;
    }

    public void setActivity(boolean isActivity) {
        this.isActivity = isActivity;
    }

    @OneToMany
    @JoinColumn(name = "user_id")
    public List<Memo> getMemos() {
        return memos;
    }

    public void setMemos(List<Memo> memos) {
        this.memos = memos;
    }

    @OneToMany
    @JoinColumn(name = "user_id")
    public List<Journal> getJournals() {
        return journals;
    }

    public void setJournals(List<Journal> journals) {
        this.journals = journals;
    }

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "setting_id")
    public UserSetting getUserSetting() {
        return userSetting;
    }

    public void setUserSetting(UserSetting userSetting) {
        this.userSetting = userSetting;
    }
}
