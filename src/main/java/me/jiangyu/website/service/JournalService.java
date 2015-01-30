package me.jiangyu.website.service;

import me.jiangyu.website.domain.Journal;
import me.jiangyu.website.domain.Memo;

import java.util.List;

/**
 * Created by jiangyukun on 2014/11/23.
 */
public interface JournalService {
    void saveJournal(Journal journal);

    Journal findJournalById(String id);

    List<Journal> findJournalsByMobile(String mobile);

    void updateJournal(Journal journal);

    void deleteJournalById(String id);
}
