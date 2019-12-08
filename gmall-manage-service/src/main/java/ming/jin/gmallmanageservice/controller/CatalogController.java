package ming.jin.gmallmanageservice.controller;

import ming.jin.bean.PmsBaseCatalog1;
import ming.jin.bean.PmsBaseCatalog2;
import ming.jin.bean.PmsBaseCatalog3;
import ming.jin.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Haokun
 * @date 2019/12/8 13:19
 * <p>
 * mall01
 */
@RestController
@CrossOrigin
public class CatalogController {

    @Autowired
    private CatalogService catalogService;

    @PostMapping("/getCatalog1")
    public List<PmsBaseCatalog1> getCatalog1(){
       return catalogService.getCatalog1();
    }

    @PostMapping("/getCatalog2")
    public List<PmsBaseCatalog2> getCatalog2(String catalog1Id){
        return catalogService.getCatalog2(catalog1Id);
    }

    @PostMapping("/getCatalog3")
    public List<PmsBaseCatalog3> getCatalog3(String catalog2Id){
        return catalogService.getCatalog3(catalog2Id);
    }


}
