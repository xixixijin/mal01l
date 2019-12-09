package ming.jin.service;

import ming.jin.bean.PmsBaseAttrInfo;
import ming.jin.bean.PmsBaseAttrValue;
import ming.jin.bean.PmsBaseSaleAttr;

import java.util.List;

/**
 * @author Haokun
 * @date 2019/12/8 16:43
 * <p>
 * mall01
 */
public interface AttrService {

    List<PmsBaseAttrInfo> getAttrInfo(String catalog3Id);

    void deleteAttrInfo(String id);

    void updateAttrInfo(PmsBaseAttrInfo attrInfo);

    int addAttrInfo(PmsBaseAttrInfo attrInfo);



    List<PmsBaseAttrValue> getAttrvalue(String attrId);

    void deleteAttrValue(String id);

    void updateAttrValue(PmsBaseAttrValue attrValue);

    void addAttrValue(PmsBaseAttrValue attrValue);

    List<PmsBaseSaleAttr> getBaseSaleAttrList();
}
