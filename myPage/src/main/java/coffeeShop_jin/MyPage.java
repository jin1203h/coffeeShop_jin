package coffeeShop_jin;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="MyPage_table")
public class MyPage {

        @Id
        @GeneratedValue(strategy=GenerationType.AUTO)
        private String memberId;
        private String orderId;
        private String productId;
        private Integer orderCnt;
        private Long orderPrice;
        private String orderDate;
        private String orderStatus;


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
        public Integer getOrderCnt() {
            return orderCnt;
        }

        public void setOrderCnt(Integer orderCnt) {
            this.orderCnt = orderCnt;
        }
        public Long getOrderPrice() {
            return orderPrice;
        }

        public void setOrderPrice(Long orderPrice) {
            this.orderPrice = orderPrice;
        }
        public String getOrderDate() {
            return orderDate;
        }

        public void setOrderDate(String orderDate) {
            this.orderDate = orderDate;
        }
        public String getOrderStatus() {
            return orderStatus;
        }

        public void setOrderStatus(String orderStatus) {
            this.orderStatus = orderStatus;
        }

}
