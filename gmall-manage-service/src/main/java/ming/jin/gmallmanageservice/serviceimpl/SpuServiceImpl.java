package ming.jin.gmallmanageservice.serviceimpl;

import ming.jin.bean.PmsProductImage;
import ming.jin.bean.PmsProductInfo;
import ming.jin.bean.PmsProductSaleAttr;
import ming.jin.bean.PmsProductSaleAttrValue;
import ming.jin.gmallmanageservice.mapper.SpuMapper;
import ming.jin.service.SpuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Haokun
 * @date 2019/12/9 11:08
 * <p>
 * mall01
 */
@Service
public class SpuServiceImpl implements SpuService {

    @Autowired
    SpuMapper spuMapper;
    @Override
    public List<PmsProductInfo> getSpu(String catalog3Id) {
        return spuMapper.getSpu(catalog3Id) ;
    }

    @Override
    public void saveSpuInfo(PmsProductInfo pmsProductInfo) {
        spuMapper.saveSpuInfo(pmsProductInfo);
    }

    @Override
    public void saveSaleAttr(PmsProductSaleAttr pmsProductSaleAttr) {
        spuMapper.saveSaleAttr(pmsProductSaleAttr);
    }

    @Override
    public void saveSaleAttrValue(PmsProductSaleAttrValue pmsProductSaleAttrValue) {
        spuMapper.saveSaleAttrValue(pmsProductSaleAttrValue);
    }

    @Override
    public void saveImage(PmsProductImage pmsProductImage) {
        spuMapper.saveImage(pmsProductImage);
    }

    @Override
    public List<PmsProductSaleAttr> getSpuSaleAttr(String spuId) {
        return spuMapper.getSpuSaleAttrBySpuId(spuId);
    }

    @Override
    public PmsProductInfo getSpuById(String spuId) {
        return spuMapper.getSpuById(spuId);
    }

    @Override
    public List<PmsProductSaleAttrValue> getSaleAttrValue(String spuId, String saleAttrId) {
        return spuMapper.getSaleAttrValue(spuId,saleAttrId);
    }

    @Override
    public List<PmsProductImage> getImage(String spuId) {
        return spuMapper.getImage(spuId);

    }

}
