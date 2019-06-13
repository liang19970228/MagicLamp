package com.topsec.hrpms.controller;

import com.topsec.hrpms.entity.Duty;
import com.topsec.hrpms.service.DutyService;
import org.eclipse.jdt.internal.compiler.lookup.MostSpecificExceptionMethodBinding;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/duty")
public class DutyController extends BaseController {
    @Autowired
    private DutyService dutyService;

    @RequestMapping(value = "/findAll",method = RequestMethod.GET)
    public ModelAndView findAll(){
        ModelAndView mav = new ModelAndView("duty/list");
        List<Duty> duties = dutyService.findAll();
        mav.addObject("duties",duties);
        return mav;
    }

    @RequestMapping(value = "/toAddDuty",method = RequestMethod.GET)
    public String toAddDuty(){
        return "duty/add";
    }

    @RequestMapping(value = "/addDuty",method = RequestMethod.POST)
    public String addDuty(Duty duty){
        dutyService.createDuty(duty);
        return "redirect:/duty/findAll";
    }

    @RequestMapping(value = "/toUpdate")
    public ModelAndView toUpdate(@RequestParam("dutyid") int dutyid){
        Duty duty = dutyService.getDutyById(dutyid);
        ModelAndView mav = new ModelAndView("duty/edit");
        mav.addObject("duty",duty);
        return mav;
    }

    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public String update(Duty duty){
        Duty duty1 = new Duty();
        duty1.setDutydesc(duty.getDutydesc());
        duty1.setDutyid(duty.getDutyid());
        duty1.setName(duty.getName());
        dutyService.createDuty(duty1);
        return "redirect:/duty/findAll";
    }

    @RequestMapping(value = "/deleteDuty")
    public String deleteDuty(@RequestParam("dutyid") int dutyid){
        dutyService.deleteById(dutyid);
        return "redirect:/duty/findAll";
    }

    @RequestMapping(value = "/quzzyQuery",method = RequestMethod.POST)
    public ModelAndView quzzyQuery(@RequestParam("quzzyName") String quzzyName){
        List<Duty> duties = dutyService.quzzyQuery(quzzyName);
        ModelAndView mav = new ModelAndView("duty/list");
        mav.addObject("duties",duties);
        return mav;
    }
}
