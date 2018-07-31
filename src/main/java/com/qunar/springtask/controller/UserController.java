package com.qunar.springtask.controller;

import com.qunar.springtask.model.User;
import com.qunar.springtask.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author hongqin.luo
 * @date 2018/7/31 22:24
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "getUserList")
    public ModelAndView getUserList(ModelAndView mv) {
        List<User> userList = userService.queryUserList();
        mv.addObject("userList", userList);
        mv.setViewName("userList");
        return mv;
    }
}
