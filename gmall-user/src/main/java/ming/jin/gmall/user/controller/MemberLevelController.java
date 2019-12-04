package ming.jin.gmall.user.controller;


import ming.jin.gmall.user.bean.MemberLevel;
import ming.jin.gmall.user.service.MemberLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Haokun
 * @date 2019/12/5 0:08
 * <p>
 * mall01
 */
@Controller
public class MemberLevelController {

    @Autowired
    MemberLevelService memberLevelService;


    public MemberLevel findById(Integer id){
        return memberLevelService.selectByid(id);
    }

}
