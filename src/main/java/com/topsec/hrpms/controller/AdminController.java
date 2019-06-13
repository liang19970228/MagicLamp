package com.topsec.hrpms.controller;


import com.sun.org.apache.xpath.internal.operations.Mod;
import com.topsec.hrpms.dto.AdminDto;
import com.topsec.hrpms.entity.Admin;
import com.topsec.hrpms.entity.Dpt;
import com.topsec.hrpms.entity.Duty;
import com.topsec.hrpms.service.AdminService;
import com.topsec.hrpms.service.DptService;
import com.topsec.hrpms.service.DutyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;


@Controller
@RequestMapping("/admin")
public class AdminController extends BaseController{

    @Autowired
    private AdminService adminService;

    @Autowired
    private DptService dptService;

    @Autowired
    private DutyService dutyService;


    @RequestMapping(value = "/loginAdmin",method = RequestMethod.POST)
    public ModelAndView loginAdmin(@RequestParam("username") String username,@RequestParam("password") String password,HttpSession session){
        Admin admin = adminService.login(username,password);
        ModelAndView mav = new ModelAndView();
        if (admin != null){
            mav.setViewName("/index");
            mav.addObject("admin",admin);
            session.setAttribute("admin",admin);
        }else {
            mav.setViewName("/login");
            mav.addObject("message","登陆失败，用户信息错误！");
        }
        return mav;
    }

    @RequestMapping(value = "/toAddAdmin",method = RequestMethod.GET)
    public ModelAndView toAddAdmin(){
        ModelAndView mav = new ModelAndView("admin/add");
        return mav;
    }

    @RequestMapping(value = "/findAdminByName",method = RequestMethod.GET)
    public String findAdminByName(@RequestParam("name") String name){
        ModelAndView mav = new ModelAndView("admin/edit");
        Admin admin = adminService.findAdminByName(name);
        mav.addObject("admin",admin);
        return "redirecy:admin/list";
    }

    @RequestMapping(value = "/findAll",method = RequestMethod.GET)
    public ModelAndView findAll(){
        ModelAndView mav = new ModelAndView("admin/list");
        List<Admin> admins = adminService.findAll();
        mav.addObject("admins",admins);
        return mav;
    }

    @RequestMapping(value = "/addAdmin",method = RequestMethod.POST)
    public ModelAndView addAdmin(Admin admin){
        adminService.createAdmin(admin);
        ModelAndView mav = new ModelAndView("admin/list");
        List<Admin> admins = adminService.findAll();
        mav.addObject("admins",admins);
        return mav;
    }
    @RequestMapping(value = "/toUpdate")
    public ModelAndView toUpdate(@RequestParam("id") int id){
        ModelAndView mav = new ModelAndView("admin/edit");
        Admin admin = adminService.getAdminById(id);
        mav.addObject("admin",admin);
        return mav;
    }

    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public String update(AdminDto adminDto){
        String username = adminDto.getUsername();
        String name = adminDto.getName();
        int id = adminDto.getId();
        adminService.update(id,username,name);
        return "redirect:/admin/findAll";
    }

    @RequestMapping(value = "/deleteAdminById")
    public String deleteAdminById(@RequestParam("id") int id){
        adminService.deleteAdmin(id);
        return "redirect:/admin/findAll";
    }

    @RequestMapping(value = "/quzzyQuery",method = RequestMethod.POST)
    public ModelAndView quzzyQuery(@RequestParam("quzzyName") String quzzyName){
        List<Admin> admins = adminService.quzzyQuery(quzzyName);
        ModelAndView mav = new ModelAndView("admin/list");
        mav.addObject("admins",admins);
        return mav;
    }

    @RequestMapping(value = "/toUpdatePwd")
    public ModelAndView toUpdatePwd(@RequestParam("id") int id){
        System.out.println("Asaaa");
        Admin admin = adminService.getAdminById(id);
        ModelAndView mav = new ModelAndView("admin/pwd");
        mav.addObject("admin",admin);
        return mav;
    }

    @RequestMapping(value = "/updatePwd",method = RequestMethod.POST)
    public ModelAndView updatePwd(AdminDto adminDto){
        ModelAndView mav = new ModelAndView();
        System.out.println(adminDto.getId());
        Admin admin = adminService.getAdminById(adminDto.getId());
        mav.addObject("admin",admin);
        if (admin.getPassword().equals(adminDto.getOldPwd()) && adminDto.getOldPwd().length() != 0){
            if (adminDto.getNewPwd1().equals(adminDto.getNewPwd2()) && adminDto.getNewPwd1().length() != 0 && adminDto.getNewPwd2().length() != 0){
                admin.setPassword(adminDto.getNewPwd1());
                adminService.createAdmin(admin);
                mav.setViewName("index");
            }else {
                mav.setViewName("admin/pwd");
                mav.addObject("message","两次输入的新密码有误，请重新输入！");
                return mav;
            }
        }else{
            mav.setViewName("admin/pwd");
            mav.addObject("message","旧密码错误，请重新输入旧密码！");
            return mav;
        }
        mav.setViewName("login");
        mav.addObject("message","修改成功，请重新登陆！");
        return mav;

    }

    @RequestMapping(value = "/quit")
    public ModelAndView quit(HttpServletRequest request, HttpServletResponse response){
        ModelAndView mav = new ModelAndView("login");
        //消除session
        HttpSession session = request.getSession();
        session.invalidate();
        //清除cookie，并且退出
        Cookie[] cookies = request.getCookies();
        for (Cookie cookie : cookies) {
            cookie.setMaxAge(0);
            response.addCookie(cookie);
        }
        mav.addObject("message","退出成功！");
        return mav;
    }

}
