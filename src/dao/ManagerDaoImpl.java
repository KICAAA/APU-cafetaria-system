
package dao;

import bll.ManagerBll;
import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



public class ManagerDaoImpl implements ManagerDao{

    @Override
    public void AddFoodItem(ManagerBll additem) {
        try{
        File f = new File("src/datafiles/MenuDetails.txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter(f,true));
        bw.write(additem.getId()+","+additem.getName()+","+additem.getPrice());
        bw.flush();
        bw.newLine();
        bw.close();
        
        }
    
    catch(IOException e){
     JOptionPane.showMessageDialog(null,"Unable to add item","Confirmation",JOptionPane.INFORMATION_MESSAGE);
}
    
}

    @Override
    public ArrayList<String> GetMenuDetails() throws IOException {
       ArrayList<String> Menuitem = new ArrayList<>();
       FileReader fr = new FileReader("src/datafiles/MenuDetails.txt");
        BufferedReader br = new BufferedReader(fr);
                try{
        
        String line;
        while ((line = br.readLine()) != null) {
            Menuitem.add(line);
        }
        
                }
                catch (Exception e){
                     JOptionPane.showMessageDialog(null,"Unable to load Menu","Confirmation",JOptionPane.INFORMATION_MESSAGE);
                }
                br.close();
                return Menuitem; 
    }
    
    @Override
    public ArrayList<String> GetCustomerDetails() throws IOException {
       ArrayList<String> Menuitem = new ArrayList<>();
                try{
        FileReader fr = new FileReader("src/datafiles/Userdata.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine()) != null) {
            Menuitem.add(line);
        }
        
                }
                catch (Exception e){
                     JOptionPane.showMessageDialog(null,"Unable to load Menu","Confirmation",JOptionPane.INFORMATION_MESSAGE);
                }
                return Menuitem; 
    }
    
    
    @Override
    public void UpdateMenu(ManagerBll update) {
        try{
            String[] updatedata ;
        File ToUpdateMenu = new File("src/datafiles/MenuDetails.txt");
        File Menu = new File("src/datafiles");
        File UpdatedMenu = new File("src/datafiles/TmpMenuDetails.txt");
        BufferedReader br = new BufferedReader(new FileReader(ToUpdateMenu));
        BufferedWriter bw = new BufferedWriter( new FileWriter(UpdatedMenu));
        String record;
        while( (record= br.readLine() )!= null){
            updatedata = record.split(",");
            int IdToUpdate = Integer.parseInt(updatedata[0]);
            if (IdToUpdate == update.getId()) {
                bw.write(update.getId()+","+update.getName()+","+update.getPrice());
            }
            else{
                bw.write(record);
            }
             bw.flush();
             bw.newLine();
        }
        bw.close();
        br.close();

        ToUpdateMenu.delete();
        boolean result = UpdatedMenu.renameTo(ToUpdateMenu);
              
        if(result == true){
            JOptionPane.showMessageDialog(null,"Item Updated Successfully","Confirmation",JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null,"Failure in Update","Confirmation",JOptionPane.INFORMATION_MESSAGE);
        }
        
        } catch (IOException ex) {
            Logger.getLogger(ManagerDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
        @Override
    public void DeleteFromMenu(ManagerBll update) {
        try{
            String[] updatedata ;
        File ToUpdateMenu = new File("src/datafiles/MenuDetails.txt");
        File Menu = new File("src/datafiles");
        File UpdatedMenu = new File("src/datafiles/TmpMenuDetails.txt");
        BufferedReader br = new BufferedReader(new FileReader(ToUpdateMenu));
        BufferedWriter bw = new BufferedWriter( new FileWriter(UpdatedMenu));
        String record;
        while( (record= br.readLine() )!= null){
            updatedata = record.split(",");
            int IdToUpdate = Integer.parseInt(updatedata[0]);
            if (IdToUpdate == update.getId()) {
                continue;
            }
            else{
                bw.write(record);
            }
             bw.flush();
             bw.newLine();
        }
        bw.close();
        br.close();

        ToUpdateMenu.delete();
        boolean result = UpdatedMenu.renameTo(ToUpdateMenu);
              
        if(result == true){
            JOptionPane.showMessageDialog(null,"Item Deleted Successfully","Confirmation",JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null,"Can't delete item","Confirmation",JOptionPane.INFORMATION_MESSAGE);
        }
        
        } catch (IOException ex) {
            Logger.getLogger(ManagerDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    @Override
    public ArrayList<String> viewpayment() {
       ArrayList<String> fileData = new ArrayList<>();
                try{
        FileReader fr = new FileReader("src/datafiles/paymentdetails.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine()) != null) {
            fileData.add(line);
        }}
                catch(IOException e){
                    
                }
        return fileData;
    }
    
    
     @Override
    public ArrayList<String> viewfeedback() {
      ArrayList<String> fileData = new ArrayList<>();
                try{
        FileReader fr = new FileReader("src/datafiles/Feedback.txt");
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
    public ArrayList<String> getAllOrder() {
                ArrayList<String> fileData = new ArrayList<>();
                try{
        FileReader fr = new FileReader("src/datafiles/OrderDetails.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine()) != null) {
            fileData.add(line);
        }}
                catch(IOException e){
                    
                }
        return fileData;
    }
}
