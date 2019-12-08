package ming.jin.gmallmanageservice;

import ming.jin.bean.PmsBaseCatalog1;
import ming.jin.gmallmanageservice.controller.CatalogController;
import ming.jin.gmallmanageservice.serviceimpl.CatalogServiceImpl;
import ming.jin.service.CatalogService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class GmallManageServiceApplicationTests {

    @Autowired
    CatalogController catalogController;
    @Test
    void contextLoads() {
      List<PmsBaseCatalog1> catalog1s= catalogController.getCatalog1();
        System.out.println(catalog1s);
    }

}
