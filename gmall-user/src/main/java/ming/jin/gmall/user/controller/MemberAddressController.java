package ming.jin.gmall.user.controller;

import ming.jin.bean.MemberAddress;

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

    public void addMemberAddress(MemberAddress memberAddress){
        memberAddressService.addMemberAddress(memberAddress);
    }
    public void updateMemberAddress(MemberAddress memberAddress){
        memberAddressService.updateMemberAddress(memberAddress);
    }
    public void deleteMemberAddress(Integer id){
        memberAddressService.deleteMemberAddress(id);
    }

}
