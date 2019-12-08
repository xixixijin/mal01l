package ming.jin.gmall.user.mapper;


import ming.jin.bean.Member;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;
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
    @Results(id ="memberMap",value={
            @Result(id=true,column="id",property ="id"),
            @Result(column = "member_level_id",property = "memberLevelId"),
            @Result(column = "username",property = "username"),
            @Result(column = "password",property = "password"),
            @Result(column = "nickname",property = "nickname"),
            @Result(column = "phone",property = "phone"),
            @Result(column = "status",property = "status"),
            @Result(column = "create_time",property = "createTime"),
            @Result(column = "icon",property = "icon"),
            @Result(column = "gender",property = "gender"),
            @Result(column = "birthday",property = "birthday"),
            @Result(column = "city",property = "city"),
            @Result(column = "job",property = "job"),
            @Result(column = "personalized_signature",property = "personalizedSignature"),
            @Result(column = "source_type",property = "sourceType"),
            @Result(column = "integration",property = "integration"),
            @Result(column = "growth",property = "growth"),
            @Result(column = "luckey_count",property = "luckeyCount"),
            @Result(column = "history_integration",property = "history_integration"),
            @Result(column = "member_level_id",property = "memberLevel" ,one=@One(/* column 是数据库的名字  property是类的属性  select是mapper里的查询方法*/
                    select = "ming.jin.gmall.user.mapper.MemberLevelMapper.findById",fetchType = FetchType.LAZY
            )),
            @Result(column = "id",property = "memberAddresses",many = @Many(
                    select = "ming.jin.gmall.user.mapper.MemberAddressMapper.findByMemberId",fetchType = FetchType.LAZY
            ))

    })
    List<Member> findAll();

    /**
     * 根据用户名查找
     * @param username
     * @return
     */
    @Select("select * from ums_member where username =#{username}")
    @Results(id ="member",value={
            @Result(id=true,column="id",property ="id"),
            @Result(column = "member_level_id",property = "memberLevelId"),
            @Result(column = "username",property = "username"),
            @Result(column = "password",property = "password"),
            @Result(column = "nickname",property = "nickname"),
            @Result(column = "phone",property = "phone"),
            @Result(column = "status",property = "status"),
            @Result(column = "create_time",property = "createTime"),
            @Result(column = "icon",property = "icon"),
            @Result(column = "gender",property = "gender"),
            @Result(column = "birthday",property = "birthday"),
            @Result(column = "city",property = "city"),
            @Result(column = "job",property = "job"),
            @Result(column = "personalized_signature",property = "personalizedSignature"),
            @Result(column = "source_type",property = "sourceType"),
            @Result(column = "integration",property = "integration"),
            @Result(column = "growth",property = "growth"),
            @Result(column = "luckey_count",property = "luckeyCount"),
            @Result(column = "history_integration",property = "history_integration"),
            @Result(column = "member_level_id",property = "memberLevel" ,one=@One(
                    select = "ming.jin.gmall.user.mapper.MemberLevelMapper.findById",fetchType = FetchType.LAZY
            )),
            @Result(column = "id",property = "memberAddresses",many = @Many(
                    select = "ming.jin.gmall.user.mapper.MemberAddressMapper.findByMemberId",fetchType = FetchType.LAZY
            ))

    })
    Member findByUsername( String username);

    @Insert("insert into ums_member(member_level_id, username, password, nickname, phone, status, create_time, icon, gender, birthday, city, job, personalized_signature, source_type, integration, growth, luckey_count, history_integration) values(#{memberLevelId},#{username},#{password},#{nickname},#{phone},#{status},#{createTime},#{icon},#{gender},#{birthday},#{city},#{job},#{personalizedSignature},#{sourceType},#{integration},#{growth},#{luckeyCount},#{historyIntegration})")
    void addMember(Member member);

    @Update("update ums_member set member_level_id=#{memberLevelId},username=#{username},password=#{password},nickname=#{nickname},phone=#{phone},status=#{status},create_time=#{createTime},icon=#{icon},gender#{gender},birthday=#{birthday},city=#{city},job=#{job},personalized_signature=#{personalizedSignature},source_type=#{sourceType},integration=#{integration},growth=#{growth},luckey_count=#{luckeyCount},history_integration=#{historyIntegration} where id =#{id}")
    void updateMember(Member member);

    @Delete("delete from ums_member where username=#{username}")
    void deleteMember(String username);
}
