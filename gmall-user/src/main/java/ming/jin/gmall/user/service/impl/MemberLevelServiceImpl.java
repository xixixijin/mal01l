package ming.jin.gmall.user.service.impl;


import ming.jin.bean.MemberLevel;
import ming.jin.gmall.user.mapper.MemberLevelMapper;
import ming.jin.gmall.user.service.MemberLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Haokun
 * @date 2019/12/5 0:16
 * <p>
 * mall01
 */
@Service("memberLevelService")
public class MemberLevelServiceImpl implements MemberLevelService {

    @Autowired
    MemberLevelMapper memberLevelMapper;

    @Override
    public void addMemberLevel(MemberLevel memberLevel) {
        memberLevelMapper.addMemberLevel(memberLevel);
    }

    @Override
    public void updateMemberLevel(MemberLevel memberLevel) {
        memberLevelMapper.updateMemberLevel(memberLevel);
    }

    @Override
    public void deleteMemberLeverById(Integer id) {
        memberLevelMapper.deleteMemberLeverById(id);
    }


    @Override
    public MemberLevel selectById(Integer id) {
        return memberLevelMapper.findById(id);
    }
}
