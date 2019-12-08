package ming.jin.gmall.user;

import ming.jin.bean.Member;
import ming.jin.bean.MemberAddress;



import ming.jin.gmall.user.controller.MemberAddressController;
import ming.jin.gmall.user.controller.MemberController;
import ming.jin.gmall.user.controller.MemberLevelController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class GmallUserApplicationTests {

    @Autowired
    MemberController memberController;

    @Autowired
    MemberLevelController mem;

    @Autowired
    MemberAddressController madd;
    @Test
    void contextLoads() {

List<Member> members=memberController.findAll();
for (Member member:members){
    System.out.println(member);
    System.out.println(member.getMemberLevel());
    List<MemberAddress> addresses=member.getMemberAddresses();
    for (MemberAddress address:addresses){
        System.out.println(address);
    }
}


    }


}
