package com.topsec.hrpms.controller;

import com.topsec.hrpms.dto.EmpDto;
import com.topsec.hrpms.entity.Dpt;
import com.topsec.hrpms.entity.Duty;
import com.topsec.hrpms.entity.Emp;
import com.topsec.hrpms.service.DptService;
import com.topsec.hrpms.service.DutyService;
import com.topsec.hrpms.service.EmpService;
import com.topsec.hrpms.util.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/emp")
public class EmpController extends BaseController{

    @Autowired
    private EmpService empService;

    @Autowired
    private DutyService dutyService;

    @Autowired
    private DptService dptService;


    @RequestMapping(value = "/findAll",method = RequestMethod.GET)
    public ModelAndView findAll()throws ParseException{
        ModelAndView mav = new ModelAndView("emp/list");
        List<Emp> empList = empService.findAll();
        List<EmpDto> emps = new ArrayList<EmpDto>();
        for(Emp emp : empList){
            EmpDto empDto = new EmpDto();
            empDto.setEmpid(emp.getEmpid());
            empDto.setName(emp.getName());
            empDto.setSex(emp.getSex());
            empDto.setBirthday(DateUtils.fromDate2String(emp.getBirthday(),"yyyy-MM-dd"));
            empDto.setEntrytime(DateUtils.fromDate2String(emp.getEntrytime(),"yyyy-MM-dd"));
            empDto.setTelphone(emp.getTelphone());
            empDto.setEmail(emp.getEmail());
            empDto.setStatus(emp.getStatus());
            emps.add(empDto);
        }
        mav.addObject("emps",emps);
        return mav;
    }

    @RequestMapping(value = "/addEmp",method = RequestMethod.POST)
    public String addEmp(EmpDto empDto) throws ParseException {
        Emp emp = new Emp();
        emp.setName(empDto.getName());
        emp.setAddress(empDto.getAddress());
        emp.setBasesalary(empDto.getBasesalary());
        emp.setBirthday(DateUtils.fromStringToDate(empDto.getBirthday(),"yyyy-MM-dd"));
        emp.setBirthplace(empDto.getBirthplace());
        emp.setEducation(empDto.getEducation());
        emp.setEmail(empDto.getEmail());
        emp.setEntrytime(DateUtils.fromStringToDate(empDto.getEntrytime(),"yyyy-MM-dd"));
        emp.setGraduationschool(empDto.getGraduationschool());
        emp.setMajor(empDto.getMajor());
        emp.setNation(empDto.getNation());
        emp.setPolitical(empDto.getPolitical());
        emp.setSex(empDto.getSex());
        emp.setStatus(empDto.getStatus());
        emp.setTelphone(empDto.getTelphone());
        emp.setDptByDptid(dptService.getDptById(empDto.getDptid()));
        emp.setDutyByDutyid(dutyService.getDutyById(empDto.getDutyid()));
        empService.createEmp(emp);
        return "redirect:/emp/findAll";
    }

    @RequestMapping(value = "/toAddEmp",method = RequestMethod.GET)
    public ModelAndView toAddEmp(){
        List<Dpt> dpts = dptService.findAll();
        List<Duty> dutys = dutyService.findAll();
        ModelAndView mav = new ModelAndView("emp/add");
        mav.addObject("dpts",dpts);
        mav.addObject("dutys",dutys);
        return mav;
    }

    @RequestMapping(value = "/deleteEmpById",method = RequestMethod.DELETE)
    public ModelAndView deleteEmpById(@RequestParam("empid") int empid){
        empService.deleteById(empid);
        ModelAndView mav = new ModelAndView("emp/list");
        List<Emp> emps = empService.findAll();
        mav.addObject("emps",emps);
        return mav;
    }

    @RequestMapping(value = "/toUpdate")
    public ModelAndView toUpdate(@RequestParam("empid") int empid){
        Emp emp = empService.getEmpById(empid);
        List<Duty> dutys = dutyService.findAll();
        List<Dpt> dpts = dptService.findAll();
        ModelAndView mav = new ModelAndView("emp/edit");
        mav.addObject("emp",emp);
        mav.addObject("dutys",dutys);
        mav.addObject("dpts",dpts);
        return mav;
    }

    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public String update(EmpDto empDto) throws ParseException{
        System.out.println("Asdadadada");
        Emp emp = new Emp();
        emp.setEmpid(empDto.getEmpid());
        emp.setName(empDto.getName());
        emp.setSex(empDto.getSex());
        emp.setBirthday(DateUtils.fromStringToDate(empDto.getBirthday(),"yyyy-MM-dd"));
        emp.setBirthplace(empDto.getBirthplace());
        emp.setNation(empDto.getNation());
        emp.setPolitical(empDto.getPolitical());
        emp.setBasesalary(empDto.getBasesalary());
        emp.setDutyByDutyid(dutyService.getDutyById(empDto.getDutyid()));
        emp.setDptByDptid(dptService.getDptById(empDto.getDptid()));
        emp.setEntrytime(DateUtils.fromStringToDate(empDto.getEntrytime(),"yyyy-MM-dd"));
        emp.setEducation(empDto.getEducation());
        emp.setMajor(empDto.getMajor());
        emp.setAddress(empDto.getAddress());
        emp.setTelphone(empDto.getTelphone());
        emp.setEmail(empDto.getEmail());
        emp.setStatus(empDto.getStatus());
        if (empDto.getLeavetime() != null && empDto.getLeavetime().trim().length() != 0){
            emp.setLeavetime(DateUtils.fromStringToDate(empDto.getLeavetime(),"yyyy-MM-dd"));
        }
        emp.setGraduationschool(empDto.getGraduationschool());
        empService.createEmp(emp);
        return "redirect:/emp/findAll";
    }

    @RequestMapping(value = "quzzyQuery",method = RequestMethod.POST)
    public ModelAndView quzzyQuery(@RequestParam("quzzyName") String quzzyName){
        List<Emp> emps = empService.quzzyQuery(quzzyName);
        ModelAndView mav = new ModelAndView("emp/list");
        mav.addObject("emps",emps);
        return mav;
    }

    @RequestMapping(value = "getEmpByEmpid")
    public ModelAndView getEmpByEmpid(@RequestParam("empid")int empid)throws ParseException{
        Emp emp1 = empService.getEmpById(empid);
        List<Duty> dutys = dutyService.findAll();
        List<Dpt> dpts = dptService.findAll();
        ModelAndView mav = new ModelAndView("emp/detail");
        EmpDto emp = new EmpDto();
        emp.setEmpid(emp1.getEmpid());
        emp.setName(emp1.getName());
        emp.setSex(emp1.getSex());
        emp.setBirthday(DateUtils.fromDate2String(emp1.getBirthday(),"yyyy-MM-dd"));
        emp.setBirthplace(emp1.getBirthplace());
        emp.setPolitical(emp1.getPolitical());
        emp.setNation(emp1.getNation());
        emp.setBasesalary(emp.getBasesalary());
        emp.setDptid(emp1.getDptByDptid().getDptid());
        emp.setDutyid(emp1.getDutyByDutyid().getDutyid());
        emp.setEntrytime(DateUtils.fromDate2String(emp1.getEntrytime(),"yyyy-MM-dd"));
        emp.setEducation(emp1.getEducation());
        emp.setMajor(emp1.getMajor());
        emp.setAddress(emp1.getAddress());
        emp.setTelphone(emp1.getTelphone());
        emp.setEmail(emp1.getEmail());
        emp.setStatus(emp1.getStatus());
        emp.setDutyname(emp1.getDutyByDutyid().getName());
        emp.setDptname(emp1.getDptByDptid().getName());
        if (emp1.getLeavetime() != null){
            emp.setLeavetime(DateUtils.fromDate2String(emp1.getLeavetime(),"yyyy-MM-dd"));
        }
        emp.setGraduationschool(emp1.getGraduationschool());
        mav.addObject("emp",emp);
        return mav;
    }

}
