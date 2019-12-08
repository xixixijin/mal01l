package ming.jin.gmallmanageservice.serviceimpl;

import ming.jin.bean.PmsBaseCatalog1;
import ming.jin.bean.PmsBaseCatalog2;
import ming.jin.bean.PmsBaseCatalog3;
import ming.jin.gmallmanageservice.mapper.CatalogMapper;
import ming.jin.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Haokun
 * @date 2019/12/8 11:33
 * <p>
 * mall01
 */
@Service("catalogService")
public class CatalogServiceImpl implements CatalogService {

    @Autowired
    CatalogMapper catalogMapper;

    @Override
    public List<PmsBaseCatalog2> getCatalog2(String catalog1Id) {
        return catalogMapper.getCatalog2(catalog1Id);

    }

    @Override
    public List<PmsBaseCatalog3> getCatalog3(String catalog2Id) {
        return catalogMapper.getCatalog3(catalog2Id);

    }



    @Override
    public List<PmsBaseCatalog1> getCatalog1() {
        return catalogMapper.getCatalog1();
    }
}
