package ming.jin.service;

import ming.jin.bean.PmsProductImage;
import ming.jin.bean.PmsProductInfo;
import ming.jin.bean.PmsProductSaleAttr;
import ming.jin.bean.PmsProductSaleAttrValue;

import java.util.List;

/**
 * @author Haokun
 * @date 2019/12/9 11:06
 * <p>
 * mall01
 */
public interface SpuService {
    List<PmsProductInfo> getSpu(String catalog3Id);

    void saveSpuInfo(PmsProductInfo pmsProductInfo);

    void saveSaleAttr(PmsProductSaleAttr pmsProductSaleAttr);

    void saveSaleAttrValue(PmsProductSaleAttrValue pmsProductSaleAttrValue);

    void saveImage(PmsProductImage pmsProductImage);

    PmsProductInfo getSpuById(String spuId);

    List<PmsProductSaleAttr> getSpuSaleAttr(String spuId);

    List<PmsProductSaleAttrValue> getSaleAttrValue(String spuId,String saleAttrId);

    List<PmsProductImage> getImage(String spuId);

}
