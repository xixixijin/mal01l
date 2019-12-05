package ming.jin.gmall.user.service;

import ming.jin.gmall.user.bean.MemberAddress;

import java.util.List;

/**
 * @author Haokun
 * @date 2019/12/5 0:34
 * <p>
 * mall01
 */
public interface MemberAddressService {
    List<MemberAddress> selectByMemId(Integer id);

    void addMemberAddress(MemberAddress memberAddress);

    void updateMemberAddress(MemberAddress memberAddress);

    void deleteMemberAddress(Integer id);
}
