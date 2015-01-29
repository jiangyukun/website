package me.jiangyu.website.service.impl;

import me.jiangyu.website.dao.MemoRepository;
import me.jiangyu.website.domain.Memo;
import me.jiangyu.website.service.MemoService;
import me.jiangyu.website.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by jiangyukun on 2014/11/23.
 */
@Service
public class MemoServiceImpl implements MemoService {
    @Autowired
    private MemoRepository memoRepository;

    @Override
    public void saveMemo(Memo memo) {
        memo.setPostData(DateUtil.getCurrentDateTimeString());
        memoRepository.save(memo);
    }

    @Override
    public Memo findMemoById(String id) {
        return memoRepository.findOne(id);
    }

    @Override
    public void updateMemo(Memo memo) {
    }

    @Override
    public void deleteMemoById(String id) {
    }
}
