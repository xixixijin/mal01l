package ming.jin.service;

import ming.jin.bean.PmsSkuAttrValue;
import ming.jin.bean.PmsSkuImage;
import ming.jin.bean.PmsSkuInfo;
import ming.jin.bean.PmsSkuSaleAttrValue;

/**
 * @author Haokun
 * @date 2019/12/9 20:50
 * <p>
 * mall01
 */
public interface SkuService {

    void saveSkuInfo(PmsSkuInfo pmsSkuInfo);

    void saveImage(PmsSkuImage pmsSkuImage);

    void saveAttrValue(PmsSkuAttrValue pmsSkuAttrValue);

    void saveSaleAttrValue(PmsSkuSaleAttrValue pmsSkuSaleAttrValue);
}
