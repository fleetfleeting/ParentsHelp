package org.westos.ph.controller.cleaningcontroller.pzycontroller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.westos.ph.bean.cleaningbean.pzybean.Cleaners;
import org.westos.ph.service.cleaningservice.pzyservice.CleanersServiceInterface;

import java.util.List;

//这是保洁人员的控制层
@Controller
@RequestMapping("/cleanner")
public class CleanersController {

    @Autowired
    private CleanersServiceInterface cleanersserviceInterface;

    /**
     * 显示所有的保洁人员类别
     */
    @RequestMapping("/listcleaners")
    @ResponseBody
    public List<Cleaners> listAllCleaners(){
        System.out.println(cleanersserviceInterface.listAllCleaners());
        return cleanersserviceInterface.listAllCleaners();

    }
    public Cleaners saveSubject(Cleaners cleaners){
        return null;
    };
    public Cleaners updateSubject(Cleaners cleaners){
        return null;
    };
    public  Cleaners removeSubject(Cleaners cleaners){
        return null;
    };

}
