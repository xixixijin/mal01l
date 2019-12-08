package ming.jin.gmall.user.service;


import ming.jin.bean.MemberLevel;

/**
 * @author Haokun
 * @date 2019/12/5 0:16
 * <p>
 * mall01
 */
public interface MemberLevelService {

    /**
     * 根据id查询会员等级
     * @param id
     * @return
     */
    MemberLevel selectById(Integer id);

    /**
     * 增加会员等级
     * @param memberLevel
     */
    void addMemberLevel(MemberLevel memberLevel);

    /**
     * 更新会员等级
     * @param memberLevel
     */
    void updateMemberLevel(MemberLevel memberLevel);

    /**
     * 删除会员等级
     * @param
     */
    void deleteMemberLeverById(Integer id);
}
