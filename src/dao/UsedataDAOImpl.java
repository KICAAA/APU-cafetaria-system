/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bll.Userdatabll;
import form.CHomePage;
import form.UserLogIn;
import java.io.*;
import javax.swing.JOptionPane;

/**
 *
 * @author dell
 */
public class UsedataDAOImpl implements UserdataDAO {

    /**
     *
     * @param data
     * @throws IOException
     */
    public void saveuserdata(Userdatabll data) throws IOException {
    FileWriter fw;
        fw = new FileWriter("src/datafiles/Userdata.txt",true);
    try(var bw = new BufferedWriter(fw)){
        bw.write(data.getFname() + ","+data.getLname()+","+data.getNum()+","+data.getEmail()+","+data.getPass()+","+data.getConfirmpass());
    bw.flush();
    bw.newLine();
    }
    }

    @Override
    public void saveuserdata() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

 @Override
    public void login(Userdatabll logindata) {
        try{
            int logincheck = 0;
        File file = new File("src/datafiles/Userdata.txt");
        BufferedReader br = new BufferedReader( new FileReader(file));
        String record;
        while( (record= br.readLine() )!= null){
            String [] data = record.split(",");
            String usernameinfile = data[3];
            String passwordinfile = data[4];
            
            if(usernameinfile.equals(logindata.getEmail())){
                if(passwordinfile.equals(logindata.getPass())){
                   logincheck=1;
                   break;
                }
                else{
                    logincheck =0; 
                }
            }
            else{
                logincheck =2;
            }
        
    }
        
        if(logincheck==1){
//            JOptionPane.showMessageDialog(null,"Login Successfull","Login",JOptionPane.INFORMATION_MESSAGE);
            CHomePage CH = new CHomePage();
           CH.email.setText(logindata.getEmail());
            UserLogIn UL = new UserLogIn();
                    CH.setVisible(true);
                    UL.setVisible(false);
                
        }
        else if(logincheck==0){
            JOptionPane.showMessageDialog(null,"Invalid Password","Login",JOptionPane.INFORMATION_MESSAGE);
        }
        else if (logincheck==2){
            JOptionPane.showMessageDialog(null,"Invalid Username /Password","Login",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    catch(IOException e){
    
}

   
}

}

  
