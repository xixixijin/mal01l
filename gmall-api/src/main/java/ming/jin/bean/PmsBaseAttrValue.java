package ming.jin.bean;

import java.io.Serializable;

/**
 * @param
 * @return
 */
public class PmsBaseAttrValue implements Serializable {
    private String id;
    private String valueName;
    private String attrId;
    private String isEnabled;

    private String urlParam;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getValueName() {
        return valueName;
    }

    public void setValueName(String valueName) {
        this.valueName = valueName;
    }

    public String getAttrId() {
        return attrId;
    }

    public void setAttrId(String attrId) {
        this.attrId = attrId;
    }

    public String getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(String isEnabled) {
        this.isEnabled = isEnabled;
    }

    public String getUrlParam() {
        return urlParam;
    }

    public void setUrlParam(String urlParam) {
        this.urlParam = urlParam;
    }

    @Override
    public String toString() {
        return "PmsBaseAttrValue{" +
                "id='" + id + '\'' +
                ", valueName='" + valueName + '\'' +
                ", attrId='" + attrId + '\'' +
                ", isEnabled='" + isEnabled + '\'' +
                ", urlParam='" + urlParam + '\'' +
                '}';
    }
}
