package ming.jin.gmallmanageservice.mapper;

import ming.jin.bean.PmsBaseAttrInfo;
import ming.jin.bean.PmsBaseAttrValue;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Haokun
 * @date 2019/12/8 16:43
 * <p>
 * mall01
 */
@Mapper
@Component
public interface AttrMapper {

    @Select("select * from pms_base_attr_info where catalog3_id=#{catalog3Id}")
    List<PmsBaseAttrInfo> getAttrInfo(String catalog3Id);

    @Delete("delete from pms_base_attr_info where id=#{id}")
    void deleteAttrInfo(String id);

    @Update("update pms_base_attr_info set attr_name=#{attrName},catalog3_id=#{catalog3Id},is_enabled=#{isEnabled} where id=#{id}")
    void updateAttrInfo(PmsBaseAttrInfo attrInfo);

    @Insert("insert into pms_base_attr_info (id,attr_name,catalog3_id,is_enabled) values(#{id},#{attrName},#{catalog3Id},#{isEnabled})")
    @Options(useGeneratedKeys = true,keyProperty = "id",keyColumn = "id")
    int addAttrInfo(PmsBaseAttrInfo attrInfo);

    @Select("select * from pms_base_attr_value where attr_id=#{attrId}")
    List<PmsBaseAttrValue> getAttrValue(String attrId);

    @Delete("delete from pms_base_attr_value where id=#{id}")
    void deleteAttrValue(String id);

    @Update("update pms_base_attr_value set value_name=#{valueName},attr_id=#{attrId},is_enabled=#{isEnabled} where id=#{id}")
    void updateAttrValue(PmsBaseAttrValue attrValue);

    @Insert("insert into pms_base_attr_value (value_name,attr_id,is_enabled) values(#{valueName},#{attrId},#{isEnabled})")
    void addAttrValue(PmsBaseAttrValue attrValue);


}
