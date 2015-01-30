package me.jiangyu.website.service.impl;

import me.jiangyu.website.dao.JournalRepository;
import me.jiangyu.website.dao.MemoRepository;
import me.jiangyu.website.domain.Journal;
import me.jiangyu.website.domain.Memo;
import me.jiangyu.website.service.JournalService;
import me.jiangyu.website.service.MemoService;
import me.jiangyu.website.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jiangyukun on 2014/11/23.
 */
@Service
public class JournalServiceImpl implements JournalService {
    @Autowired
    private JournalRepository journalRepository;

    @Override
    public void saveJournal(Journal journal) {
        journalRepository.save(journal);
    }

    @Override
    public Journal findJournalById(String id) {
        return journalRepository.findOne(id);
    }

    @Override
    public List<Journal> findJournalsByMobile(String mobile) {
        return journalRepository.findJournalsByMobile(mobile);
    }

    @Override
    public void updateJournal(Journal journal) {
        journalRepository.save(journal);
    }

    @Override
    public void deleteJournalById(String id) {
        journalRepository.delete(id);
    }
}
