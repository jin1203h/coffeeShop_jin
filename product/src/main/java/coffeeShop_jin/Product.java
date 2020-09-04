package coffeeShop_jin;

import javax.persistence.*;
import org.springframework.beans.BeanUtils;
import java.util.List;

@Entity
@Table(name="Product_table")
public class Product {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private String productId;
    private String productName;
    private Long price;
    private Integer cnt;
    private String kind;

    @PostPersist
    public void onPostPersist(){
        Registered registered = new Registered();
        BeanUtils.copyProperties(this, registered);
        registered.publishAfterCommit();


    }

    @PostUpdate
    public void onPostUpdate(){
        Changed changed = new Changed();
        BeanUtils.copyProperties(this, changed);
        changed.publishAfterCommit();


    }


    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }
    public Integer getCnt() {
        return cnt;
    }

    public void setCnt(Integer cnt) {
        this.cnt = cnt;
    }
    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }




}
