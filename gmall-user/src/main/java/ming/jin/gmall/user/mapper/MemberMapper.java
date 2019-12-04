package ming.jin.gmall.user.mapper;

import ming.jin.gmall.user.bean.Member;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Haokun
 * @date 2019/12/4 22:36
 * <p>
 * mall01
 */

@Component
@Mapper
public interface MemberMapper {
    /**
     * 查找所有member数据
     * @return
     */
    @Select("select * from ums_member")
    List<Member> findAll();

    /**
     * 根据用户名查找
     * @param username
     * @return
     */
    @Select("select * from ums_member where username =#{username}")
    Member findByUsername( String username);

}
