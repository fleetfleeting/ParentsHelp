package org.westos.ph.service.cleaningservice.pzyservice;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.westos.ph.bean.cleaningbean.pzybean.Cleaners;
import org.westos.ph.dao.cleaningdao.pzydao.CleanersDao;

import java.util.List;

/**
 * CleanersServiceImplface的实现
 */
@Service
public class CleanersServiceimpl implements CleanersServiceInterface {
    @Autowired
    private CleanersDao cleanersDao;

    @Override
    public List<Cleaners> listAllCleaners() {
        return cleanersDao.listAllCleaners();
    }

    @Override
    public Cleaners saveSubject(Cleaners cleaners) {
        cleanersDao.saveSubject(cleaners);
        return cleaners;
    }

    @Override
    public Cleaners updateSubject(Cleaners cleaners) {
        cleanersDao.updateSubject(cleaners);
        return cleaners;
    }

    @Override
    public Cleaners removeSubject(Cleaners cleaners) {
        cleanersDao.removeSubject(cleaners);
        return cleaners;
    }
}
