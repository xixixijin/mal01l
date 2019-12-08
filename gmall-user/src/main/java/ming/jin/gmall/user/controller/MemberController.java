package ming.jin.gmall.user.controller;


import ming.jin.bean.Member;
import ming.jin.gmall.user.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author Haokun
 * @date 2019/12/4 22:35
 * <p>
 * mall01
 */

@Controller
@RequestMapping("/member")
public class MemberController {

    @Autowired
    MemberService memberService;

    @RequestMapping("/hello")
    @ResponseBody
    public List<Member> findAll(){
        return memberService.selectAll();
    }

    @RequestMapping("/{username}")
    @ResponseBody
    public Member findByUsername(@PathVariable String username){
        return memberService.selectByUsername(username);
    }


    public void addMember(Member member){
        memberService.addMember(member);
    }

    public void updateMember(Member member){
        memberService.updateMember(member);
    }

    public void deleteMember(String username){
        memberService.deleteMember(username);
    }

}
