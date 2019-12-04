package ming.jin.gmall.user.mapper;


import ming.jin.gmall.user.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.Mapping;

import java.util.List;


/**
 * @author Haokun
 * @date 2019/12/4 17:59
 * <p>
 * mall01
 */

@Mapper
@Component
public interface UserMapper {


    @Select("select * from ums_member")
    List<User> findAll();
}
