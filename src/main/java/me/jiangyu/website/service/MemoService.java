package me.jiangyu.website.service;

import me.jiangyu.website.domain.Memo;

import java.util.List;

/**
 * Created by jiangyukun on 2014/11/23.
 */
public interface MemoService {
    void saveMemo(Memo memo);

    Memo findMemoById(String id);

    List<Memo> findMemosByMobile(String mobile);

    void updateMemo(Memo memo);

    void deleteMemoById(String id);
}
