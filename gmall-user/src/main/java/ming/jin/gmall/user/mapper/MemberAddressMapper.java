package ming.jin.gmall.user.mapper;

import ming.jin.gmall.user.bean.MemberAddress;
import org.apache.ibatis.annotations.*;
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

    /**
     * 根据id查地址
     * @param id
     * @return
     */
    @Select("select * from ums_member_receive_address where member_id =#{id}")
    List<MemberAddress> findByMemberId(Integer id);

    /**
     * 增加用户地址
     * @param memberAddress
     */
    @Insert("insert into ums_member_receive_address(id,member_id,name,phone_number,default_status,post_code,province,city,region,detail_address) values(#{id},#{memberId},#{name},#{phoneNumber},#{defaultStatus},#{postCode},#{province},#{city},#{region},#{detailAddress})")
    void addMemberAddress(MemberAddress memberAddress);

    /**
     * 删除用户地址
     * @param id
     */
    @Delete("delete from ums_member_receive_address where id=#{id}")
    void deleteMemberAddress(Integer id);

    /**
     * 更新用户地址
     * @param memberAddress
     */
    @Update("update ums_member_receive_address set member_id=#{memberId},name=#{name},phone_number=#{phoneNumber},default_status=#{defaultStatus},post_code=#{postCode},province=#{province},city=#{city},region=#{region},detail_address=#{detailAddress} where member_id =#{memberId}")
    void updateMemberAddress(MemberAddress memberAddress);

}
