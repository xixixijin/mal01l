package ming.jin.gmall.user.controller;


import ming.jin.gmall.user.bean.MemberLevel;
import ming.jin.gmall.user.service.MemberLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author Haokun
 * @date 2019/12/5 0:08
 * <p>
 * mall01
 */
@Controller
public class MemberLevelController {

    @Autowired
    MemberLevelService memberLevelService;

    /**
     * 根据id查询会员等级
     * @param id
     * @return
     */
    public MemberLevel findById(Integer id){
        return memberLevelService.selectById(id);
    }

    /**
     * 增加会员等级
     * @param memberLevel
     */
    public void addMemberLevel(MemberLevel memberLevel){
        memberLevelService.addMemberLevel(memberLevel);

    }

    /**
     * 更新会员等级
     * @param memberLevel
     */
    public void updateMemberLevel(MemberLevel memberLevel){
        memberLevelService.updateMemberLevel(memberLevel);
    }

    /**
     * 删除会员等级
     * @param
     */
    public void deleteMemberLevel(Integer id){
        memberLevelService.deleteMemberLeverById(id);
    }

}
