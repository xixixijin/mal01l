package ming.jin.gmallmanageservice.controller;

import ming.jin.bean.PmsSkuAttrValue;
import ming.jin.bean.PmsSkuImage;
import ming.jin.bean.PmsSkuInfo;
import ming.jin.bean.PmsSkuSaleAttrValue;
import ming.jin.service.SkuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Haokun
 * @date 2019/12/9 20:51
 * <p>
 * mall01
 */
@RestController
@CrossOrigin
public class SkuController {

    @Autowired
    SkuService skuService;

    @RequestMapping("/saveSkuInfo")
    public String getSkuInfo(@RequestBody PmsSkuInfo skuInfo){
        skuService.saveSkuInfo(skuInfo);
        String skuId=skuInfo.getId();
        String defaultImage=skuInfo.getSkuDefaultImg();
        List<PmsSkuImage> skuImages=skuInfo.getSkuImageList();
        List<PmsSkuAttrValue> skuAttrValues=skuInfo.getSkuAttrValueList();
        List<PmsSkuSaleAttrValue> skuSaleAttrValues=skuInfo.getSkuSaleAttrValueList();
        for (PmsSkuImage skuImage:skuImages){
            skuImage.setSkuId(skuId);
            skuService.saveImage(skuImage);
        }
        for(PmsSkuAttrValue skuAttrValue:skuAttrValues){
            skuAttrValue.setSkuId(skuId);
            skuService.saveAttrValue(skuAttrValue);
        }

        for (PmsSkuSaleAttrValue skuSaleAttrValue:skuSaleAttrValues){
            skuSaleAttrValue.setSkuId(skuId);
            skuService.saveSaleAttrValue(skuSaleAttrValue);
        }

        return "success";
    }

}
