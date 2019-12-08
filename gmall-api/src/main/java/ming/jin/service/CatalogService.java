package ming.jin.service;

import ming.jin.bean.PmsBaseCatalog1;
import ming.jin.bean.PmsBaseCatalog2;
import ming.jin.bean.PmsBaseCatalog3;

import java.util.List;

/**
 * @author Haokun
 * @date 2019/12/8 10:59
 * <p>
 * mall01
 */
public interface CatalogService {

    List<PmsBaseCatalog1> getCatalog1();

    List<PmsBaseCatalog2> getCatalog2(String catalog1Id);

    List<PmsBaseCatalog3> getCatalog3(String catalog2Id);

}
