package coffeeShop_jin;

import javax.persistence.*;
import org.springframework.beans.BeanUtils;
import java.util.List;

@Entity
@Table(name="Cancelation_table")
public class Cancelation {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private String makeId;
    private String memberId;
    private String orderId;
    private String productId;
    private String status;

    @PostPersist
    public void onPostPersist(){
        MakeCanceled makeCanceled = new MakeCanceled();
        BeanUtils.copyProperties(this, makeCanceled);
        makeCanceled.publishAfterCommit();


    }


    public String getMakeId() {
        return makeId;
    }

    public void setMakeId(String makeId) {
        this.makeId = makeId;
    }
    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }




}
