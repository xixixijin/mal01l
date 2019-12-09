package ming.jin.gmallmanageservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Haokun
 * @date 2019/12/9 18:15
 * <p>
 * mall01
 */
@Controller
public class ItemController {

    @RequestMapping("index")
    public String index(){
        return "item";
    }
}
