package me.jiangyu.website.dao;

import me.jiangyu.website.domain.Memo;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jiangyukun on 2014/11/23.
 */
public interface MemoRepository extends CrudRepository<Memo, String> {

}
