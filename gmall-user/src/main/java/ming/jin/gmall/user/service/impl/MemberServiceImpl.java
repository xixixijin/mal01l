package ming.jin.gmall.user.service.impl;

import ming.jin.gmall.user.bean.Member;
import ming.jin.gmall.user.mapper.MemberMapper;
import ming.jin.gmall.user.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Haokun
 * @date 2019/12/4 22:36
 * <p>
 * mall01
 */

@Service("memberService")
public class MemberServiceImpl implements MemberService {


    @Autowired
    MemberMapper memberMapper;

    @Override
    public List<Member> selectAll() {

        return memberMapper.findAll();
    }

    @Override
    public Member selectByUsername(String username) {

        return memberMapper.findByUsername(username);
    }
}
