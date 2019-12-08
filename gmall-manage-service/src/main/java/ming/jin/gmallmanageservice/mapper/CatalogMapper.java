package ming.jin.gmallmanageservice.mapper;

import ming.jin.bean.PmsBaseCatalog1;
import ming.jin.bean.PmsBaseCatalog2;
import ming.jin.bean.PmsBaseCatalog3;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;


import java.util.List;

/**
 * @author Haokun
 * @date 2019/12/8 11:34
 * <p>
 * mall01
 */
@Mapper
@Component
public interface CatalogMapper {

    @Select("select *from pms_base_catalog1")
    List<PmsBaseCatalog1> getCatalog1();

    @Select("select * from pms_base_catalog2 where catalog1_id=#{catalog1Id}")
    List<PmsBaseCatalog2> getCatalog2(String catalog1Id);

    @Select("select * from pms_base_catalog3 where catalog2_id=#{catalog2Id}")
    List<PmsBaseCatalog3> getCatalog3(String catalog2Id);

}
