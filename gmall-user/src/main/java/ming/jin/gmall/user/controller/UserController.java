package ming.jin.gmall.user.controller;

import ming.jin.gmall.user.bean.User;
import ming.jin.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author Haokun
 * @date 2019/12/4 17:57
 * <p>
 * mall01
 */

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @ResponseBody
    @RequestMapping("/hello")
    public List<User> findAll(){
        List<User> users =userService.selectAll();
        System.out.println(users);
        return users;
    }


}
