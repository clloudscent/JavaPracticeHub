package customerManage;

public class CustomerVO {
    private String id;
    private String name;
    private String grade;
    private int purchase;
    private String updatedDate;
    private String manager;

    public CustomerVO(String id, String name, String grade, int purchase, String updatedDate) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.purchase = purchase;
        this.updatedDate = updatedDate;
    }

    public CustomerVO(String customerId, String customerName, String today, String inputId) {
        this.id = customerId;
        this.name = customerName;
        this.updatedDate = today;
        this.manager = inputId;
    }

    public CustomerVO(String purchaseID, int purchaseAmount, String today) {
        this.id = purchaseID;
        this.purchase = purchaseAmount;
        this.updatedDate = today;
    }

    public CustomerVO(String updateInputId, int updatePurchase) {
        this.id = updateInputId;
        this.purchase = updatePurchase;
    }



    public String getId(){return id;}
    public String getName(){return name;}
    public String getGrade(){return  grade;}
    public int getPurchase(){return purchase;}
    public String getUpdatedDate(String today){return updatedDate;}
    public String getManager(){return manager;}

    public void setId(String id){this.id = id;}
    public void setName(String name){this.name = name;}
    public void setGrade(String grade){this.grade = grade;}
    public void setPurchase(int purchase){this.purchase = purchase;}
    public void setUpdatedDate(String updatedDate){this.updatedDate = updatedDate;}
    public void setManager(String manager){this.manager = manager;}
}
