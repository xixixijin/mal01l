package ming.jin.gmallmanageservice.mapper;

import ming.jin.bean.PmsSkuAttrValue;
import ming.jin.bean.PmsSkuImage;
import ming.jin.bean.PmsSkuInfo;
import ming.jin.bean.PmsSkuSaleAttrValue;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.springframework.stereotype.Component;

/**
 * @author Haokun
 * @date 2019/12/9 20:51
 * <p>
 * mall01
 */

@Mapper
@Component
public interface SkuMapper {


    @Insert("insert into pms_sku_info (product_id,price,sku_name,sku_desc,weight,catalog3_id,sku_default_img) values(#{spuId},#{price},#{skuName},#{skuDesc},#{weight},#{catalog3Id},#{skuDefaultImg}) ")
    @Options(useGeneratedKeys = true,keyColumn = "id",keyProperty = "id")
    void saveSkuInfo(PmsSkuInfo pmsSkuInfo);

    @Insert("insert into pms_sku_image (sku_id,img_name,img_url,product_img_id,is_default) values(#{skuId},#{imgName},#{imgUrl},#{spuImageId},#{isDefault})")
    void saveImage(PmsSkuImage pmsSkuImage);

    @Insert("insert into pms_sku_attr_value (attr_id,value_id,sku_id) values(#{attrId},#{valueId},#{skuId})")
    void saveAttrValue(PmsSkuAttrValue pmsSkuAttrValue);

    @Insert("insert into pms_sku_sale_attr_value(sku_id,sale_attr_id,sale_attr_value_id,sale_attr_name,sale_attr_value_name) values(#{skuId},#{saleAttrId},#{saleAttrValueId},#{saleAttrName},#{saleAttrValueName})")
    void saveSaleAttrValue(PmsSkuSaleAttrValue pmsSkuSaleAttrValue);
}
