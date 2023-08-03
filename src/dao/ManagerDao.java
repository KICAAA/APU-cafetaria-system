
package dao;

import bll.ManagerBll;
import java.io.IOException;
import java.util.ArrayList;

public interface ManagerDao {
    public void AddFoodItem(ManagerBll additem);
    ArrayList<String> GetMenuDetails() throws IOException;
    public void UpdateMenu(ManagerBll update);
    ArrayList<String> GetCustomerDetails() throws IOException;
    public ArrayList<String> viewpayment();
    public ArrayList<String> viewfeedback();
     public ArrayList<String> getAllOrder();
     public void DeleteFromMenu(ManagerBll delete);
}