package ming.jin.gmallmanageservice.serviceimpl;

import ming.jin.bean.PmsBaseAttrInfo;
import ming.jin.bean.PmsBaseAttrValue;
import ming.jin.bean.PmsBaseSaleAttr;
import ming.jin.gmallmanageservice.mapper.AttrMapper;
import ming.jin.service.AttrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Haokun
 * @date 2019/12/8 16:43
 * <p>
 * mall01
 */
@Service("attrService")
public class AttrServiceImpl implements AttrService {

    @Autowired
    AttrMapper attrMapper;
    @Override
    public List<PmsBaseAttrInfo> getAttrInfo(String catalog3Id) {
        return attrMapper.getAttrInfo(catalog3Id);
    }

    @Override
    public void deleteAttrInfo(String id) {
        attrMapper.deleteAttrInfo(id);
    }

    @Override
    public void updateAttrInfo(PmsBaseAttrInfo attrInfo) {
        attrMapper.updateAttrInfo(attrInfo);
    }

    @Override
    public int addAttrInfo(PmsBaseAttrInfo attrInfo) {
        return attrMapper.addAttrInfo(attrInfo);
    }



    @Override
    public List<PmsBaseAttrValue> getAttrvalue(String attrId) {
        return attrMapper.getAttrValue(attrId);
    }

    @Override
    public void deleteAttrValue(String id) {
        attrMapper.deleteAttrValue(id);
    }

    @Override
    public void updateAttrValue(PmsBaseAttrValue attrValue) {
        attrMapper.updateAttrValue(attrValue);
    }

    @Override
    public void addAttrValue(PmsBaseAttrValue attrValue) {
        attrMapper.addAttrValue(attrValue);
    }

    @Override
    public List<PmsBaseSaleAttr> getBaseSaleAttrList() {
        return attrMapper.getBaseSaleAttrList();
    }
}
