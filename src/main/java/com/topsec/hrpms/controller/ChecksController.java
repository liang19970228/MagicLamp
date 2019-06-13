package com.topsec.hrpms.controller;

import com.topsec.hrpms.dto.ChecksDto;
import com.topsec.hrpms.entity.Checks;
import com.topsec.hrpms.entity.Emp;
import com.topsec.hrpms.service.CheckService;
import com.topsec.hrpms.service.EmpService;
import com.topsec.hrpms.util.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.text.ParseException;
import java.util.List;

@Controller
@RequestMapping("/check")
public class ChecksController extends BaseController {

    @Autowired
    private CheckService checkService;

    @Autowired
    private EmpService empService;

    @RequestMapping(value = "/findAll",method = RequestMethod.GET)
    public ModelAndView findAll(){
        ModelAndView mav = new ModelAndView("check/list");
        List<Checks> checks = checkService.findAll();
        mav.addObject("checks",checks);
        return mav;
    }

    @RequestMapping(value = "/toAddCheck",method = RequestMethod.GET)
    public String toAddCheck(){
        return "check/add";
    }

    @RequestMapping(value = "/addCheck",method = RequestMethod.POST)
    public String addCheck(ChecksDto checksDto) throws ParseException {
        Checks checks = new Checks();
        if (null != checksDto.getEmpid()) checks.setEmpByEmpid(empService.getEmpById(checksDto.getEmpid()));
        if (null != checksDto.getCheckdate()) checks.setCheckdate(DateUtils.fromStringToDate(checksDto.getCheckdate(),"yyyy-MM-dd"));
        if (null != checksDto.getCheckdesc()) checks.setCheckdesc(checksDto.getCheckdesc());
        if (null != checksDto.getPunish()) checks.setPunish(checksDto.getPunish());
        if (null != checksDto.getReward()) checks.setReward(checksDto.getReward());
        checkService.createChecks(checks);
        return "redirect:/check/findAll";
    }

    @RequestMapping(value = "/toUpdate")
    public ModelAndView toUpdate(@RequestParam("checkid") int checkid){
        System.out.println("ASdada");
        Checks check = checkService.getChecksById(checkid);
        ModelAndView mav = new ModelAndView("check/edit");
        mav.addObject("check",check);
        return mav;
    }

    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public String update(ChecksDto checksDto) throws  ParseException{
        Checks checks = new Checks();
        checks.setCheckid(checksDto.getCheckid());
        checks.setCheckdate(DateUtils.fromStringToDate(checksDto.getCheckdate(),"yyyy-MM-dd"));
        checks.setCheckdesc(checksDto.getCheckdesc());
        checks.setEmpByEmpid(empService.getEmpById(checksDto.getEmpid()));
        checks.setPunish(checksDto.getPunish());
        checks.setReward(checksDto.getReward());
        checkService.createChecks(checks);
        return "redirect:/check/findAll";
    }

    @RequestMapping(value = "/deleteCheck")
    public String deleteCheck(@RequestParam("checkid") int checkid){
        checkService.deleteById(checkid);
        return "redirect:/check/findAll";
    }


    @RequestMapping(value = "quzzyQuery",method = RequestMethod.POST)
    public ModelAndView quzzyQuery(@RequestParam("quzzyName") String quzzyName){
        Emp emp = empService.getEmpByName(quzzyName);
        List<Checks> checks = checkService.quzzyQuery(emp);
        ModelAndView mav = new ModelAndView("check/list");
        mav.addObject("checks",checks);
        return mav;
    }


}
