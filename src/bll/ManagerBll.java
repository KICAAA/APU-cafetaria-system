
package bll;

public class ManagerBll {
    private int Id;
    private String name;
    private Double Price;

    
    public ManagerBll(){};
    public ManagerBll(int Id, String name, Double Price) {
        this.Id = Id;
        this.name = name;
        this.Price = Price;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double Price) {
        this.Price = Price;
    }
    
    
    
    
}
