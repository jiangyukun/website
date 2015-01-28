package me.jiangyu.website.web.controller;

import me.jiangyu.website.domain.User;
import me.jiangyu.website.service.UserService;
import me.jiangyu.website.web.controller.account.AccountUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.annotation.Resource;

/**
 * Created by jiangyukun on 2014/11/21.
 */
@Controller
@SessionAttributes(AccountUtils.ID_STRING)
public class IndexController {
    @Resource
    private UserService userService;

    @RequestMapping({"/", "/index", "home"})
    public String index(@ModelAttribute(AccountUtils.ID_STRING) String mobile, Model model) {
        User user = userService.findUserByMobile(mobile);
        model.addAttribute("username", user.getUsername());
        return "/index";
    }
}
