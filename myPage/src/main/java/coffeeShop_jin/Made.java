package coffeeShop_jin;

public class Made extends AbstractEvent {

    private String makeId;
    private String memberId;
    private String orderId;
    private String productId;
    private String status;

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
    public String getMakeStatus() {
        return status;
    }

    public void setMakeStatus(String status) {
        this.status = status;
    }
}