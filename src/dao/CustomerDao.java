
package dao;

import bll.CustomerBll;
import java.util.ArrayList;

public interface CustomerDao {
    public ArrayList<String> menutable();
    public void Order(CustomerBll item);
    public void TmpOrder(CustomerBll Temporary);
    public ArrayList<String> carttable();
    public Double TotalAmount();
    public void savepayment(CustomerBll payment);
    public void GiveFeedback(CustomerBll feedback);
}
