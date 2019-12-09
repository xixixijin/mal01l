package ming.jin.gmallmanageservice.controller;

import ming.jin.bean.PmsBaseAttrInfo;
import ming.jin.bean.PmsBaseAttrValue;
import ming.jin.bean.PmsBaseSaleAttr;
import ming.jin.bean.PmsProductInfo;
import ming.jin.service.AttrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Haokun
 * @date 2019/12/8 16:43
 * <p>
 * mall01
 */
@RestController
@CrossOrigin
public class AttrController {
    @Autowired
    AttrService attrService;

    @RequestMapping("/attrInfoList")
    public List<PmsBaseAttrInfo> getAttrInfo(String catalog3Id){
        List<PmsBaseAttrInfo> pmsBaseAttrInfos=attrService.getAttrInfo(catalog3Id);

        for (PmsBaseAttrInfo pmsBaseAttrInfo:pmsBaseAttrInfos){
            String attrId=pmsBaseAttrInfo.getId();
            pmsBaseAttrInfo.setAttrValueList(attrService.getAttrvalue(attrId));
        }


        return pmsBaseAttrInfos;
    }

    @RequestMapping("/getAttrValueList")
    public List<PmsBaseAttrValue> getAttrValue(String attrId){
        return attrService.getAttrvalue(attrId);
    }

    @RequestMapping("/saveAttrInfo")
    public void updateAttrInfo(@RequestBody PmsBaseAttrInfo attrInfo){
        if(attrInfo.getId()==null){
            //新增属性
            attrService.addAttrInfo(attrInfo);
            String attrId=attrInfo.getId();
            List<PmsBaseAttrValue> attrValues=attrInfo.getAttrValueList();

            for(PmsBaseAttrValue attrValue:attrValues){
                attrValue.setAttrId(String.valueOf(attrId));
                attrService.addAttrValue(attrValue);
            }
        }else {
            //修改属性
            List<String> attrValueIds=new ArrayList<>();
            attrService.updateAttrInfo(attrInfo);
            String attrId=attrInfo.getId();
            List<PmsBaseAttrValue> attrValues=attrInfo.getAttrValueList();
            List<PmsBaseAttrValue> attrValues1=attrService.getAttrvalue(attrId);
            for (PmsBaseAttrValue attrValue:attrValues1){
                attrValueIds.add(attrValue.getId());
            }

            for(PmsBaseAttrValue attrValue:attrValues){
                /**
                 * value的属性值为空就增加一个attrvalue
                 * value的属性值不为空则更改这个attrvalue
                 */
                String attrValueId =attrValue.getId();
                if(attrValueId==null){
                    attrValue.setAttrId(attrId);
                    attrService.addAttrValue(attrValue);
                }else {
                    attrValueIds.remove(attrValueId);
                    attrService.updateAttrValue(attrValue);
                }
            }

            while (attrValueIds.size()!=0){
            attrService.deleteAttrValue(attrValueIds.get(0));
            attrValueIds.remove(0);
            }


        }


    }

    @RequestMapping("/baseSaleAttrList")
    public List<PmsBaseSaleAttr> getBaseSaleAttrList(){
        return attrService.getBaseSaleAttrList();
    }

}
