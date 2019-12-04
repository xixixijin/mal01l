package ming.jin.gmall.user.service.impl;

import ming.jin.gmall.user.bean.User;
import ming.jin.gmall.user.mapper.UserMapper;
import ming.jin.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Haokun
 * @date 2019/12/4 17:58
 * <p>
 * mall01
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper usermapper;
    @Override
    public List<User> selectAll() {
        List<User> users= usermapper.findAll();
        return users;
    }
}
