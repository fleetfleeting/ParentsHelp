package org.westos.ph.service.cleaningservice.pzyservice;

import org.westos.ph.bean.cleaningbean.pzybean.Cleaners;

import java.util.List;


/**
 * 这是保洁人员的操作接口
 */
public interface CleanersServiceInterface {
    //查看所有的保洁人员信息
     List<Cleaners> listAllCleaners();
    //保存保洁人员信息
    Cleaners saveSubject(Cleaners cleaners);
    //更新保洁人员信息
    Cleaners updateSubject(Cleaners cleaners);
    //删除保洁人员信息
    Cleaners removeSubject(Cleaners cleaners);
}
