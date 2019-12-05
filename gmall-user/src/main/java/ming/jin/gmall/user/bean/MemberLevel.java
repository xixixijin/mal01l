package ming.jin.gmall.user.bean;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author Haokun
 * @date 2019/12/5 0:09
 * <p>
 * mall01
 */
public class MemberLevel implements Serializable {

    private Integer id;
    private String name;
    private String growthPoint;
    private String defaultStatus;
    private BigDecimal freeFreightPoint;
    private String commentGrowthPoint;
    private String priviledgeFreeFreight;
    private String priviledgeSignIn;
    private String priviledgeComment;
    private String priviledgePromotion;
    private String priviledgeMemberPrice;
    private String priviledgeBirthday;
    private String note;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrowthPoint() {
        return growthPoint;
    }

    public void setGrowthPoint(String growthPoint) {
        this.growthPoint = growthPoint;
    }

    public String getDefaultStatus() {
        return defaultStatus;
    }

    public void setDefaultStatus(String defaultStatus) {
        this.defaultStatus = defaultStatus;
    }

    public BigDecimal getFreeFreightPoint() {
        return freeFreightPoint;
    }

    public void setFreeFreightPoint(BigDecimal freeFreightPoint) {
        this.freeFreightPoint = freeFreightPoint;
    }

    public String getCommentGrowthPoint() {
        return commentGrowthPoint;
    }

    public void setCommentGrowthPoint(String commentGrowthPoint) {
        this.commentGrowthPoint = commentGrowthPoint;
    }

    public String getPriviledgeFreeFreight() {
        return priviledgeFreeFreight;
    }

    public void setPriviledgeFreeFreight(String priviledgeFreeFreight) {
        this.priviledgeFreeFreight = priviledgeFreeFreight;
    }

    public String getPriviledgeSignIn() {
        return priviledgeSignIn;
    }

    public void setPriviledgeSignIn(String priviledgeSignIn) {
        this.priviledgeSignIn = priviledgeSignIn;
    }

    public String getPriviledgeComment() {
        return priviledgeComment;
    }

    public void setPriviledgeComment(String priviledgeComment) {
        this.priviledgeComment = priviledgeComment;
    }

    public String getPriviledgePromotion() {
        return priviledgePromotion;
    }

    public void setPriviledgePromotion(String priviledgePromotion) {
        this.priviledgePromotion = priviledgePromotion;
    }

    public String getPriviledgeMemberPrice() {
        return priviledgeMemberPrice;
    }

    public void setPriviledgeMemberPrice(String priviledgeMemberPrice) {
        this.priviledgeMemberPrice = priviledgeMemberPrice;
    }

    public String getPriviledgeBirthday() {
        return priviledgeBirthday;
    }

    public void setPriviledgeBirthday(String priviledgeBirthday) {
        this.priviledgeBirthday = priviledgeBirthday;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "MemberLevel{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", growthPoint='" + growthPoint + '\'' +
                ", defaultStatus='" + defaultStatus + '\'' +
                ", freeFreightPoint=" + freeFreightPoint +
                ", commentGrowthPoint='" + commentGrowthPoint + '\'' +
                ", priviledgeFreeFreight='" + priviledgeFreeFreight + '\'' +
                ", priviledgeSignIn='" + priviledgeSignIn + '\'' +
                ", priviledgeComment='" + priviledgeComment + '\'' +
                ", priviledgePromotion='" + priviledgePromotion + '\'' +
                ", priviledgeMemberPrice='" + priviledgeMemberPrice + '\'' +
                ", priviledgeBirthday='" + priviledgeBirthday + '\'' +
                ", note='" + note + '\'' +
                '}';
    }
}
