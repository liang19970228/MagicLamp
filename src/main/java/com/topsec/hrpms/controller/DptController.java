package com.topsec.hrpms.controller;

import com.topsec.hrpms.dto.DptDto;
import com.topsec.hrpms.entity.Dpt;
import com.topsec.hrpms.service.DptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Controller
@RequestMapping("/dpt")
public class DptController extends BaseController {
    @Autowired
    private DptService dptService;

    @RequestMapping(value = "/findAll",method = RequestMethod.GET)
    private ModelAndView findAll(){
        ModelAndView mav = new ModelAndView("dpt/list");
        List<Dpt> dptList = dptService.findAll();
        List<DptDto> dptDtos = new ArrayList<DptDto>();
        for (Dpt dpt : dptList){
            DptDto dptDto = new DptDto();
            dptDto.setDptid(dpt.getDptid());
            dptDto.setName(dpt.getName());
            if (null != dpt.getDptByParentid()){
                dptDto.setParentid(dpt.getDptByParentid().getDptid());
                dptDto.setParentName(dpt.getDptByParentid().getName());
            }
            if (null != dpt.getDptdesc()){
                dptDto.setDesc(dpt.getDptdesc());
            }
            dptDtos.add(dptDto);
        }
        mav.addObject("dptDtos",dptDtos);
        return mav;
    }

    @RequestMapping(value = "/toAddDpt",method = RequestMethod.GET)
    public ModelAndView toAddDpt(){
        List<Dpt> dpts = dptService.findAll();
        ModelAndView mav = new ModelAndView("dpt/add");
        mav.addObject("dpts",dpts);
        return mav;
    }

    @RequestMapping(value = "/addDpt",method = RequestMethod.POST)
    public String addDpt(DptDto dptDto){
        Dpt dpt = new Dpt();
        if (null != dptDto.getName()) dpt.setName(dptDto.getName());
        if (null != dptDto.getParentid()) dpt.setDptByParentid(dptService.getDptById(dptDto.getParentid()));
        if (null != dptDto.getDesc()) dpt.setDptdesc(dptDto.getDesc());
        dptService.createDpt(dpt);
        return "redirect:/dpt/findAll";
    }

    @RequestMapping(value = "/toUpdate")
    public ModelAndView toUpdate(@RequestParam("dptid") int dptid){
        Dpt dpt = dptService.getDptById(dptid);
        List<Dpt> dpts = dptService.findAll();
        Iterator<Dpt> it = dpts.iterator();
        while (it.hasNext()) {
            Dpt dpt1 = it.next();
            if (dpt == dpt1) {
                it.remove();
            }
        }
        ModelAndView mav = new ModelAndView("dpt/edit");
        mav.addObject("dpt",dpt);
        mav.addObject("dpts",dpts);
        return mav;
    }

    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public String update(DptDto dptDto){
        Dpt dpt = new Dpt();
        dpt.setDptid(dptDto.getDptid());
        dpt.setName(dptDto.getName());
        if (dptDto.getParentid() != null ){
            dpt.setDptByParentid(dptService.getDptById(dptDto.getParentid()));
        }
        dpt.setDptdesc(dptDto.getDesc());
        dptService.createDpt(dpt);
        return "redirect:/dpt/findAll";
    }

    @RequestMapping(value = "/deleteDptByDptid")
    public String deleteDptByDptid(@RequestParam("dptid")int dptid){
        dptService.deleteById(dptid);
        return "redirect:/dpt/findAll";
    }

    @RequestMapping(value = "quzzyQuery",method = RequestMethod.POST)
    public ModelAndView quzzyQuery(@RequestParam("quzzyName") String quzzyName){
        List<Dpt> dptList = dptService.quzzyQuery(quzzyName);
        ModelAndView mav = new ModelAndView("dpt/list");
        List<DptDto> dptDtos = new ArrayList<DptDto>();
        for (Dpt dpt : dptList){
            DptDto dptDto = new DptDto();
            dptDto.setDptid(dpt.getDptid());
            dptDto.setName(dpt.getName());
            if (null != dpt.getDptByParentid()){
                dptDto.setParentid(dpt.getDptByParentid().getDptid());
                dptDto.setParentName(dpt.getDptByParentid().getName());
            }
            if (null != dpt.getDptdesc()){
                dptDto.setDesc(dpt.getDptdesc());
            }
            dptDtos.add(dptDto);
        }
        mav.addObject("dptDtos",dptDtos);
        return mav;
    }

}
