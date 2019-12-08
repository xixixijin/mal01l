package ming.jin.gmall.user.service;

import ming.jin.bean.Member;



import java.util.List;

/**
 * @author Haokun
 * @date 2019/12/4 22:36
 * <p>
 * mall01
 */

public interface MemberService {

    List<Member> selectAll();

    Member selectByUsername(String username);

    void addMember(Member member);

    void updateMember(Member member);

    void deleteMember(String  username);

}
