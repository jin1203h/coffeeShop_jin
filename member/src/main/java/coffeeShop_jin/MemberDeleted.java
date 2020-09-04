package coffeeShop_jin;

public class MemberDeleted extends AbstractEvent {

    private String id;
    private String memberName;
    private String nickName;
    private String tel;
    private String grade;
    private String birth;
    private Integer orderCnt;

    public MemberDeleted(){
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }
    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }
    public Integer getOrderCnt() {
        return orderCnt;
    }

    public void setOrderCnt(Integer orderCnt) {
        this.orderCnt = orderCnt;
    }
}
