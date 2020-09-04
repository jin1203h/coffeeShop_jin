package coffeeShop_jin;

public class MakeCanceled extends AbstractEvent {

    private String makeId;
    private String orderId;
    private String memberId;
    private String productId;
    private String makeStatus;

    public MakeCanceled(){
        super();
    }

    public String getMakeId() {
        return makeId;
    }

    public void setMakeId(String makeId) {
        this.makeId = makeId;
    }
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }
    public String getMakeStatus() {
        return makeStatus;
    }

    public void setMakeStatus(String makeStatus) {
        this.makeStatus = makeStatus;
    }
}
