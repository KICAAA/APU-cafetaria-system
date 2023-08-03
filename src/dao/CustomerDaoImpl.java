
package dao;

import bll.CustomerBll;
import form.CHomePage;
import form.CReview;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class CustomerDaoImpl implements CustomerDao{
    
 @Override
    public ArrayList<String> menutable(){
                ArrayList<String> fileData = new ArrayList<>();
                try{
        FileReader fr = new FileReader("src/datafiles/MenuDetails.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine()) != null) {
            fileData.add(line);
        }
        br.close();
                }
                catch (Exception e){
                    
                }
                
                return fileData;
    }

    @Override
    public void Order(CustomerBll item) {
        try{
       File file = new File("src/datafiles/OrderDetails.txt");
       BufferedWriter bw = new BufferedWriter( new FileWriter(file,true));
       bw.write(item.getEmailofCustomer()+","+item.getOrderName()+","+item.getOrderQuantity()+","+item.getOrderPrice());
       bw.newLine();
       bw.flush();
       bw.close();
       JOptionPane.showMessageDialog(null,"Item added to the cart","Confirmation",JOptionPane.INFORMATION_MESSAGE);
    }
       catch(IOException e){
           
       }
        }

    @Override
    public void TmpOrder(CustomerBll Temporary) {
        try{
            ArrayList<String> datalist = new ArrayList<>();
            datalist= menutable();
        Object[] linecount = datalist.toArray();
        int id = linecount.length;
       File file = new File("src/datafiles/TmpOrder.txt");
       BufferedWriter bw = new BufferedWriter( new FileWriter(file,true));
       bw.write(id+","+Temporary.getOrderName()+","+Temporary.getOrderQuantity()+","+Temporary.getOrderPrice());
       bw.newLine();
       bw.flush();
       bw.close();
       
    }
       catch(IOException e){
       }   
    }
    
    
    @Override
    public ArrayList<String> carttable(){
                ArrayList<String> fileData = new ArrayList<>();
                try{
        FileReader fr = new FileReader("src/datafiles/TmpOrder.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine()) != null) {
            fileData.add(line);
        }
        br.close();
                }
                catch (Exception e){
                    
                }
                
                return fileData;
    }

    @Override
    public Double TotalAmount() {
       ArrayList<String> fileData = new ArrayList<>();
                 String[] payment ;
                 Double finalpayment = 0.0;
                 Double totalpayment=0.0;
                try{
        FileReader fr = new FileReader("src/datafiles/TmpOrder.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine()) != null) {
            payment = line.split(",");
            Double quantity = Double.valueOf(payment[2]);
            Double price = Double.valueOf(payment[3]);
            System.out.println(quantity);
          finalpayment = quantity * price;
          totalpayment = totalpayment+finalpayment;
          
        }
        br.close();
        
                }
                catch (Exception e){
                    
                }
                return totalpayment; }
    
    
   @Override
    public void savepayment(CustomerBll payment) {
    try{
        File file = new File("src/datafiles/PaymentDetails.txt");
        BufferedWriter bw = new BufferedWriter( new FileWriter(file,true));
        bw.write(payment.getEmailofCustomer()+","+payment.getFoodpayment());
        bw.flush();
        bw.newLine();
        bw.close();
    }
    catch(IOException e){
    
}
    }
    
    @Override
    public void GiveFeedback(CustomerBll feedback) {
        try{
        File file = new File("src/datafiles/Feedback.txt");
        BufferedWriter bw = new BufferedWriter( new FileWriter(file,true));
        bw.write(feedback.getEmailofCustomer()+","+feedback.getFeedback());
        bw.flush();
        bw.newLine();
        bw.close();
        JOptionPane.showMessageDialog(null,"Feedback send","Feedback",JOptionPane.INFORMATION_MESSAGE);
        CReview CR = new CReview();
        CHomePage CP = new CHomePage();
        CR.setVisible(false);
        CP.setVisible(true);
        
    }
        catch(IOException e){
            
        }
    
}

}


