package ming.jin.gmallmanageservice.controller;

import ming.jin.bean.PmsProductImage;
import ming.jin.bean.PmsProductInfo;
import ming.jin.bean.PmsProductSaleAttr;
import ming.jin.bean.PmsProductSaleAttrValue;
import ming.jin.service.SpuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * @author Haokun
 * @date 2019/12/9 11:07
 * <p>
 * mall01
 */
@RestController
@CrossOrigin
public class SpuController {

    @Autowired
    SpuService spuService;

    @RequestMapping("/spuList")
    public List<PmsProductInfo> getSpu(String catalog3Id){
        return spuService.getSpu(catalog3Id);
    }

    @RequestMapping("/fileUpload")
    public String saveFile(@RequestParam("file") MultipartFile multipartFile){

        return "success";
    }

    @RequestMapping("/spuImageList")
    public List<PmsProductImage> getImage(String spuId){
        return spuService.getImage(spuId);
    }


    @RequestMapping("/spuSaleAttrList")
    public List<PmsProductSaleAttr> getSpuSaleAttr(String spuId){
        List<PmsProductSaleAttr> pmsProductSaleAttrs=spuService.getSpuSaleAttr(spuId);
        for (PmsProductSaleAttr pmsProductSaleAttr:pmsProductSaleAttrs){
            String saleAttrId= pmsProductSaleAttr.getSaleAttrId();
            pmsProductSaleAttr.setSpuSaleAttrValueList(spuService.getSaleAttrValue(spuId,saleAttrId));
        }

        return pmsProductSaleAttrs;
    }

    @RequestMapping("/saveSpuInfo")
    public String saveSpuInfo(@RequestBody PmsProductInfo spuInfo){
        spuService.saveSpuInfo(spuInfo);
        String productId=spuInfo.getId();
        List<PmsProductSaleAttr> saleAttrs=spuInfo.getSpuSaleAttrList();
        List<PmsProductImage> pmsProductImages=spuInfo.getSpuImageList();
        for(PmsProductImage pmsProductImage:pmsProductImages){
            pmsProductImage.setProductId(productId);
            spuService.saveImage(pmsProductImage);
        }
        for (PmsProductSaleAttr saleAttr:saleAttrs){
            saleAttr.setProductId(productId);
            spuService.saveSaleAttr(saleAttr);
            List<PmsProductSaleAttrValue> saleAttrValues=saleAttr.getSpuSaleAttrValueList();
            for(PmsProductSaleAttrValue saleAttrValue:saleAttrValues){
                saleAttrValue.setProductId(productId);
                spuService.saveSaleAttrValue(saleAttrValue);
            }

        }


        return "nih";
    }




}
