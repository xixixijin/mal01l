package ming.jin.gmall.user.mapper;

import ming.jin.gmall.user.bean.MemberAddress;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Haokun
 * @date 2019/12/5 0:34
 * <p>
 * mall01
 */
@Mapper
@Component
public interface MemberAddressMapper {

    @Select("select * from ums_member_receive_address where member_id =#{id}")
    List<MemberAddress> findByMemberId(Integer id);
}
