package com.topsec.hrpms.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import com.sun.xml.internal.messaging.saaj.packaging.mime.internet.MimePartDataSource;
import com.topsec.hrpms.dto.PayDto;
import com.topsec.hrpms.entity.Checks;
import com.topsec.hrpms.entity.Emp;
import com.topsec.hrpms.entity.Pay;
import com.topsec.hrpms.pojo.PayPojo;
import com.topsec.hrpms.service.CheckService;
import com.topsec.hrpms.service.EmpService;
import com.topsec.hrpms.service.PayService;
import com.topsec.hrpms.util.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/pay")
public class PayController extends BaseController {
    @Autowired
    private PayService payService;
    @Autowired
    private EmpService empService;
    @Autowired
    private CheckService checkService;

    @RequestMapping(value = "/findAll",method = RequestMethod.GET)
    public ModelAndView findAll(){
        ModelAndView mav = new ModelAndView("pay/list");
        List<Pay> pays = payService.findAll();
        mav.addObject("pays",pays);
        return mav;
    }

    @RequestMapping(value = "/toSetPay",method = RequestMethod.GET)
    public String toSetPay(){
        return "pay/add";
    }

    @RequestMapping(value = "/addPay",method = RequestMethod.POST)
    public String addPay(PayDto payDto){
        Pay pay = new Pay();
        return "pay/findAll";
    }

    @RequestMapping(value = "/seePay",method = RequestMethod.POST)
    public ModelAndView seePay(@RequestParam("checkDate") String checkDate) throws Exception {
        ModelAndView mav = new ModelAndView("pay/add");
        Date chDate = DateUtils.fromStringToDate(checkDate,"yyyy-MM-dd");
        String date = new SimpleDateFormat("yyyy年MM月dd日").format(chDate);
        String year = date.substring(0,4);
        String month = date.substring(date.indexOf("年")+1,date.indexOf("月"));
        List<Emp> emps = empService.findAll();
        for (Emp emp : emps){
            Checks checks = new Checks();
            checks.setEmpByEmpid(emp);
            checks.setCheckdate(chDate);
            checks.setReward(0.0);
            checks.setPunish(0.0);
            checks.setCheckdesc("基础考勤");
            checkService.createChecks(checks);
        }
        List<PayPojo> payPojos = checkService.getCheckByYearAndMonth(year,month);
        mav.addObject("payPojos",payPojos);
        mav.addObject("checkTime",checkDate);
        return mav;
    }
    @RequestMapping(value = "/countPay")
    public ModelAndView countPay(@RequestParam("checkDate")String checkDate) throws Exception {
        ModelAndView mav = new ModelAndView();
        Date chDate = DateUtils.fromStringToDate(checkDate,"yyyy-MM-dd");
        String date = new SimpleDateFormat("yyyy年MM月dd日").format(chDate);
        String year = date.substring(0,4);
        String month = date.substring(date.indexOf("年")+1,date.indexOf("月"));
        List<PayPojo> payPojos = checkService.getCheckByYearAndMonth(year,month);
        for (PayPojo payPojo : payPojos){
            Pay pay = new Pay();
            pay.setEmpByEmpid(empService.getEmpById(payPojo.getEmpid()));
            pay.setMonth(payPojo.getCheckdate());
            pay.setPunishs(payPojo.getPunishes());
            pay.setReawrds(payPojo.getRewards());
            pay.setSalary(payPojo.getBasesalary()+payPojo.getRewards()-payPojo.getPunishes());
            payService.createPay(pay);
        }
        List<Pay> pays = payService.findAll();
        mav.setViewName("pay/list");
        mav.addObject("pays",pays);
        return mav;
    }

    @RequestMapping(value = "/getPayByMonth")
    public ModelAndView getPayByMonth(@RequestParam("payDate")String payDate)throws Exception{
        ModelAndView mav = new ModelAndView("pay/list");
        List<Pay> pays = payService.getPayByMonth(payDate);
        mav.addObject("pays",pays);
        return mav;

    }

    @RequestMapping(value = "/deletePayByPayid")
    public ModelAndView deletePayByPayid(@RequestParam("payid")int payid){
        ModelAndView mav = new ModelAndView("pay/list");
        payService.deleteById(payid);
        List<Pay> pays = payService.findAll();
        mav.addObject("pays",pays);
        return mav;
    }

}
