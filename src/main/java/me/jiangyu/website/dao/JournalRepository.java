package me.jiangyu.website.dao;

import me.jiangyu.website.domain.Journal;
import me.jiangyu.website.domain.Memo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by jiangyukun on 2014/11/23.
 */
public interface JournalRepository extends CrudRepository<Journal, String> {

    @Query("select j from User u, Journal j where u.mobile = :mobile order by j.writeDate")
    List<Journal> findJournalsByMobile(@Param("mobile") String mobile);
}
