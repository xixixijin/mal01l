package ming.jin.gmall.user.mapper;

import ming.jin.gmall.user.bean.MemberLevel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

/**
 * @author Haokun
 * @date 2019/12/5 0:18
 * <p>
 * mall01
 */

@Mapper
@Component
public interface MemverLevelMapper {
    /**
     * 根据id搜索会员级别
     * @param id
     * @return
     */
    @Select("select * from ums_member_level where id =#{id}")
    MemberLevel findById(Integer id);
}
