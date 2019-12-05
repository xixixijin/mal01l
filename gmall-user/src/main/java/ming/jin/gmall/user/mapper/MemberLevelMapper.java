package ming.jin.gmall.user.mapper;

import ming.jin.gmall.user.bean.MemberLevel;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * @author Haokun
 * @date 2019/12/5 0:18
 * <p>
 * mall01
 */

@Mapper
@Component
public interface MemberLevelMapper {
    /**
     * 根据id搜索会员级别
     * @param id
     * @return
     */
    @Select("select * from ums_member_level where id =#{id}")
    MemberLevel findById(Integer id);

    /**
     * 增加会员级别
     * @param memberLevel
     */
    @Insert("insert into ums_member_level(id,name,growth_point,default_status,free_freight_point,comment_growth_point,priviledge_free_freight,priviledge_sign_in,priviledge_comment,priviledge_promotion,priviledge_member_price,priviledge_birthday,note) value(#{id},#{name},#{growthPoint},#{defaultStatus},#{freeFreightPoint},#{commentGrowthPoint},#{priviledgeFreeFreight},#{priviledgeSignIn},#{priviledgeComment},#{priviledgePromotion},#{priviledgeMemberPrice},#{priviledgeBirthday},#{note})")
    void addMemberLevel(MemberLevel memberLevel);

    /**
     * 更新会员
     * @param memberLevel
     */
    @Update("update ums_member_level set name=#{name},growth_point=#{growthPoint},default_status=#{defaultStatus},free_freight_point=#{freeFreightPoint},comment_growth_point=#{commentGrowthPoint},priviledge_free_freight=#{priviledgeFreeFreight},priviledge_sign_in=#{priviledgeSignIn},priviledge_comment=#{priviledgeComment},priviledge_promotion=#{priviledgePromotion},priviledge_member_price=#{priviledgeMemberPrice},priviledge_birthday=#{priviledgeBirthday},note=#{note} where id = #{id}")
    void updateMemberLevel(MemberLevel memberLevel);

    /**
     * 根据id删除
     * @param id
     */
    @Delete("delete from ums_member_level where id=#{id}")
    void deleteMemberLeverById(Integer id);
}

