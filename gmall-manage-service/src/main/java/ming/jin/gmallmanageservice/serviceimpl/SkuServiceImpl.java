package ming.jin.gmallmanageservice.serviceimpl;

import ming.jin.bean.PmsSkuAttrValue;
import ming.jin.bean.PmsSkuImage;
import ming.jin.bean.PmsSkuInfo;
import ming.jin.bean.PmsSkuSaleAttrValue;
import ming.jin.gmallmanageservice.mapper.SkuMapper;
import ming.jin.service.SkuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Haokun
 * @date 2019/12/9 20:51
 * <p>
 * mall01
 */
@Service
public class SkuServiceImpl implements SkuService {

    @Autowired
    SkuMapper skuMapper;
    @Override
    public void saveSkuInfo(PmsSkuInfo pmsSkuInfo) {
        skuMapper.saveSkuInfo(pmsSkuInfo);
    }

    @Override
    public void saveImage(PmsSkuImage pmsSkuImage) {
        skuMapper.saveImage(pmsSkuImage);
    }

    @Override
    public void saveAttrValue(PmsSkuAttrValue pmsSkuAttrValue) {
        skuMapper.saveAttrValue(pmsSkuAttrValue);
    }

    @Override
    public void saveSaleAttrValue(PmsSkuSaleAttrValue pmsSkuSaleAttrValue) {
        skuMapper.saveSaleAttrValue(pmsSkuSaleAttrValue);
    }
}
