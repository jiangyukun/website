package me.jiangyu.website.domain;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Created by jiangyukun on 2015/1/30.
 */
@Entity
@Table(name = "yun_journal")
public class Journal extends IdEntity {
    private String content;
    private long writeDate;
    private String description;
    private User user;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getWriteDate() {
        return writeDate;
    }

    public void setWriteDate(long writeDate) {
        this.writeDate = writeDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @ManyToOne
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
