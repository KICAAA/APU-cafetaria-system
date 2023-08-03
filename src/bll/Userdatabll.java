
package bll;


public class Userdatabll {
    private String fname;
    private String lname;
    private String num;
    private String Email;
    private String pass;
    private String confirmpass;
    public Userdatabll(){}
public Userdatabll(String fname, String lname, String num, String Email, String pass, String confirmpass) {
        this.fname = fname;
        this.lname = lname;
        this.num = num;
        this.Email = Email;
        this.pass = pass;
        this.confirmpass = confirmpass;
    }
    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getConfirmpass() {
        return confirmpass;
    }

    public void setConfirmpass(String confirmpass) {
        this.confirmpass = confirmpass;
    }
    
}
