package ming.jin.gmall.user;

import ming.jin.gmall.user.bean.Member;
import ming.jin.gmall.user.bean.MemberAddress;
import ming.jin.gmall.user.controller.MemberAddressController;
import ming.jin.gmall.user.controller.MemberLevelController;
import ming.jin.gmall.user.service.MemberService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class GmallUserApplicationTests {

    @Autowired
    MemberService ms;

    @Autowired
    MemberLevelController mem;

    @Autowired
    MemberAddressController madd;
    @Test
    void contextLoads() {
        List<MemberAddress> addresses= madd.findByMemId(1);
    for (MemberAddress address:addresses){
        System.out.println(address);
    }
    }

}
