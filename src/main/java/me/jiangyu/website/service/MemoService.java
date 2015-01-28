package me.jiangyu.website.service;

import me.jiangyu.website.domain.Memo;

/**
 * Created by jiangyukun on 2014/11/23.
 */
public interface MemoService {
    void saveMemo(Memo memo);

    Memo findMemoById(String id);

    void updateMemo(Memo memo);

    void deleteMemoById(String id);
}
