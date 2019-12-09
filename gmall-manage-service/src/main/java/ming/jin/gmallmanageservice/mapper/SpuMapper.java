package ming.jin.gmallmanageservice.mapper;

import ming.jin.bean.PmsProductImage;
import ming.jin.bean.PmsProductInfo;
import ming.jin.bean.PmsProductSaleAttr;
import ming.jin.bean.PmsProductSaleAttrValue;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author Haokun
 * @date 2019/12/9 11:06
 * <p>
 * mall01
 */
@Mapper
@Component
public interface SpuMapper {


    @Select("select * from pms_product_info where catalog3_id=#{catalog3Id}")
    List<PmsProductInfo> getSpu(String catalog3Id);

    @Select("select *from pms_product_info where id = #{spuId}")
    PmsProductInfo getSpuById(String spuId);

    @Insert("insert into pms_product_info(product_name,description,catalog3_id) values(#{productName},#{description},#{catalog3Id})")
    @Options(useGeneratedKeys = true,keyProperty = "id" ,keyColumn = "id")
    void saveSpuInfo(PmsProductInfo pmsProductInfo);

    @Insert("insert into pms_product_sale_attr(product_id,sale_attr_id,sale_attr_name) values(#{productId},#{saleAttrId},#{saleAttrName})")
    void saveSaleAttr(PmsProductSaleAttr pmsProductSaleAttr);

    @Select("select * from pms_product_sale_attr where product_id=#{spuId}")
    List<PmsProductSaleAttr> getSpuSaleAttrBySpuId(String spuId);


    @Select("select * from pms_product_sale_attr_value where product_id=#{spuId} and sale_attr_id=#{saleAttrId}")
    List<PmsProductSaleAttrValue> getSaleAttrValue(String spuId,String saleAttrId);

    @Insert("insert into pms_product_sale_attr_value(product_id,sale_attr_id,sale_attr_value_name) values(#{productId},#{saleAttrId},#{saleAttrValueName})")
    void saveSaleAttrValue(PmsProductSaleAttrValue pmsProductSaleAttrValue);


    @Insert("insert into pms_product_image (product_id,img_name,img_url) values(#{productId},#{imgName},#{imgUrl})")
    void saveImage(PmsProductImage pmsProductImage);

    @Select("select * from pms_product_image where product_id=#{spuId}")
    List<PmsProductImage> getImage(String spuId);

}
