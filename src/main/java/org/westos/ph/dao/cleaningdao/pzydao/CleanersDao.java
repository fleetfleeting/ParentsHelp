package org.westos.ph.dao.cleaningdao.pzydao;

import org.westos.ph.bean.cleaningbean.pzybean.Cleaners;

import java.util.List;


/**
 * 保洁人员的Dao
 */
public interface CleanersDao {
    //查看所有的保洁人员信息
    List<Cleaners> listAllCleaners();
    //保存保洁人员信息
    Integer saveSubject(Cleaners cleaners);
    //更新保洁人员信息
    Integer updateSubject(Cleaners cleaners);
    //删除保洁人员信息
    Integer removeSubject(Cleaners cleaners);
}
