
package bll;

public class CustomerBll {
    private String  OrderId;
    private String OrderName;
    private String OrderPrice;
    private int OrderQuantity;
    private String EmailofCustomer;
    private Double foodpayment;
    private String feedback;

    public CustomerBll(){};
    public CustomerBll(String OrderId, String OrderName, String OrderPrice, int OrderQuantity, String EmailofCustomer, Double foodpayment, String feedback) {
        this.OrderId = OrderId;
        this.OrderName = OrderName;
        this.OrderPrice = OrderPrice;
        this.OrderQuantity = OrderQuantity;
        this.EmailofCustomer = EmailofCustomer;
        this.foodpayment = foodpayment;
        this.feedback = feedback;
    }

    public String getOrderId() {
        return OrderId;
    }

    public void setOrderId(String OrderId) {
        this.OrderId = OrderId;
    }

    public String getOrderName() {
        return OrderName;
    }

    public void setOrderName(String OrderName) {
        this.OrderName = OrderName;
    }

    public String getOrderPrice() {
        return OrderPrice;
    }

    public void setOrderPrice(String OrderPrice) {
        this.OrderPrice = OrderPrice;
    }

    public int getOrderQuantity() {
        return OrderQuantity;
    }

    public void setOrderQuantity(int OrderQuantity) {
        this.OrderQuantity = OrderQuantity;
    }

    public String getEmailofCustomer() {
        return EmailofCustomer;
    }

    public void setEmailofCustomer(String EmailofCustomer) {
        this.EmailofCustomer = EmailofCustomer;
    }

    public Double getFoodpayment() {
        return foodpayment;
    }

    public void setFoodpayment(Double foodpayment) {
        this.foodpayment = foodpayment;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
    
    
}
