package com.nicole.hrms.controller;

import com.nicole.hrms.domain.Admin;
import com.nicole.hrms.service.AdminService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * 类中的所有响应方法都被映射到 /admin 路径下
 * 管理员登录，查询管理员，删除管理员，添加管理员，退出
 * Created by xl on 2017/6/22.
 */
@Controller
@RequestMapping("/admin")
public class AdminController {
    // 自动注入 adminService
    @Resource
    private AdminService adminService;
    @RequestMapping(path = {"/login"},method = RequestMethod.POST)
    public String login(Admin admin, HttpServletRequest request, HttpSession session){
        Admin resultAdmin = adminService.login(admin);
        // 如果该登录的管理员用户名或密码错误返回错误信息
        if(resultAdmin ==null){
            //将错误信息返回到前端
            request.setAttribute("admin",admin);
            request.setAttribute("errorMsg","Please check your username and password!");
            return "login";
        }else {
            // 登录成功， Session 保存该管理员的信息
            //前台${sessionScope.currentAdmin.username}
            session.setAttribute("currentAdmin", resultAdmin);
            session.setAttribute("username", resultAdmin.getUsername());
            return "redirect:main";
        }
    }


    /**处理跳转至主页请求
     *
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping(value="/main")
    public String test(Model model) throws Exception{
        return "home_page";
    }
    /**处理查询管理员请求
     *
     * @param admin
     * @param response
     * @return
     * @throws Exception
     */
    @RequestMapping("/list")
    public String list(Admin admin, HttpServletResponse response) throws Exception{
        Map<String,Object> map = new HashMap<String, Object>();
        // 判断查询条件是否为空，如果是，对条件做数据库模糊查询的处理
        if(admin.getUsername()!=null&& !"".equals(admin.getUsername().trim())){
            map.put("suername","%"+admin.getUsername()+"%");//根据名字进行模糊查询
        }


    }





}
