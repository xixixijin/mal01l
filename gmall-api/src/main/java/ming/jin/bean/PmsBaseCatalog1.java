package ming.jin.bean;




import java.io.Serializable;
import java.util.List;

/**
 * @param
 * @return
 */
public class PmsBaseCatalog1 implements Serializable {

    private String id;

    private String name;


    private List<PmsBaseCatalog2> catalog2s;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PmsBaseCatalog1{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", catalog2s=" + catalog2s +
                '}';
    }
}

