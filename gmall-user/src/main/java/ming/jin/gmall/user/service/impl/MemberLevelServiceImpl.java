package ming.jin.gmall.user.service.impl;

import ming.jin.gmall.user.bean.MemberLevel;
import ming.jin.gmall.user.mapper.MemverLevelMapper;
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
    MemverLevelMapper memverLevelMapper;
    @Override
    public MemberLevel selectByid(Integer id) {
        return memverLevelMapper.findById(id);
    }
}
