package me.jiangyu.website.web.controller.account;

import me.jiangyu.website.domain.User;
import me.jiangyu.website.domain.UserSetting;
import me.jiangyu.website.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

/**
 * Created by jiangyukun on 2014/11/23.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public String addUser(@Valid User user) {
        UserSetting userSetting = new UserSetting();
        user.setUserSetting(userSetting);
        userService.saveUser(user);
        return "redirect:/user/login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return "/user/login";
    }

    @RequestMapping(value = "/userLogin", method = RequestMethod.POST, produces = {"application/text;charset=UTF-8"})
    @ResponseBody
    public String userLogin(HttpServletRequest request, String mobile, String password) {
        if (userService.loginByMobile(mobile, password)) {
            request.getSession().setAttribute(AccountUtils.ID_STRING, mobile);
            return "1";
        }
        return "0";
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String register() {
        return "/user/register";
    }

    @RequestMapping(value = "/checkMobile", produces = {"application/text;charset=UTF-8"})
    @ResponseBody
    public String checkMobile(String mobile) {
        User user = userService.findUserByMobile(mobile);
        return user != null ? "ok" : "手机号不存在";
    }
}
