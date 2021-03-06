package me.jiangyu.website.dao;

import me.jiangyu.website.domain.Memo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by jiangyukun on 2014/11/23.
 */
public interface MemoRepository extends CrudRepository<Memo, String> {

    @Query("select m from User u, Memo m where u.mobile=:mobile order by m.postDate")
    List<Memo> findMemosByMobile(@Param("mobile") String mobile);
}
