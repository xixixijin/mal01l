package ming.jin.gmall.user.service;

import ming.jin.gmall.user.bean.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Haokun
 * @date 2019/12/4 17:58
 * <p>
 * mall01
 */


public interface UserService {

    List<User> selectAll();

}
