package ming.jin.gmall.user.service.impl;


import ming.jin.bean.MemberAddress;
import ming.jin.gmall.user.mapper.MemberAddressMapper;
import ming.jin.gmall.user.service.MemberAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Haokun
 * @date 2019/12/5 0:34
 * <p>
 * mall01
 */

@Service("memberAddressService")
public class MemberAddressServiceImpl implements MemberAddressService {

    @Autowired
    MemberAddressMapper addressMapper;
    @Override
    public List<MemberAddress> selectByMemId(Integer id){
        return addressMapper.findByMemberId(id);
    }

    @Override
    public void addMemberAddress(MemberAddress memberAddress) {
        addressMapper.addMemberAddress(memberAddress);
    }

    @Override
    public void updateMemberAddress(MemberAddress memberAddress) {
        addressMapper.updateMemberAddress(memberAddress);
    }

    @Override
    public void deleteMemberAddress(Integer id) {
        addressMapper.deleteMemberAddress(id);
    }
}
