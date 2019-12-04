package ming.jin.gmall.user.controller;

import ming.jin.gmall.user.bean.MemberAddress;
import ming.jin.gmall.user.service.MemberAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * @author Haokun
 * @date 2019/12/5 0:33
 * <p>
 * mall01
 */
@Controller
public class MemberAddressController {

    @Autowired
    MemberAddressService memberAddressService;

    public List<MemberAddress> findByMemId(Integer id){
        return memberAddressService.selectByMemId(id);
    }

}
