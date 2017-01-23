package com.openthinks.app.keecount.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.openthinks.app.keecount.entity.User;
import com.openthinks.app.keecount.service.IUserService;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author Dailey Dai
 * @since 2017-01-23
 */
@Controller
@RequestMapping("/user")
public class UserController {

  @Autowired
  IUserService userService;

  @ResponseBody
  @RequestMapping("/")
  public User index() {
    User user = new User().setName("dailey").setEmail("dailey.yet@outlook.com")
        .setPassword("123456").setPhone("123456789");
    boolean isSuccess = userService.insert(user);
    if (isSuccess) {
      // user = userService.selectOne(new EntityWrapper<>(user));
    }
    return user;
  }

}
