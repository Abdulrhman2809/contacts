/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contact;
import java.util.regex.Pattern;
public class Client {
    private String Name;
    private String phone;
    private String email;
    private String messege;
    private boolean f;
    {
        messege = "";
        Name = "";
        email = "";
        phone = "";
        f = true;
    }
    public String getMessege() {
        return messege;
    }
   
    public Client(String Name, String phone, String email) {
        setName(Name);
        setPhone(phone);
        setemail(email);
    }
    public String getName() {//a s    [ ]   
        return Name.trim();
       
    }
    public void setName(String Name) {
        if ( !Name.isEmpty() && Name.trim().replaceAll("[ ]+"," ").length() >= 3) {
        
            this.Name = Name.trim().replaceAll("[ ]+", " ");
        
        }else {
            messege += "Name is invalid\n";
            f = false;
        } 
    }
    public String getPhone() {  
        return phone.trim();
    }
    public void setPhone(String phone) {    
        if (Pattern.matches("((\\+201)|(201)|(01))[0125]\\d{8}$", phone.trim())) { //Egyption number only
            this.phone = phone.trim();            
        } else {
            messege += "Phone number is invalid\n";
            f = false;
        }
    }
    public String getemail() {
        return email.trim();
        
    }
    public void setemail(String email) {
        if (Pattern.matches("[a-z0-9]{5,20}@[a-z]{3,7}\\.[a-z]{3,6}$", email.trim().toLowerCase())) { // simple regex for check email
            this.email = email.trim().toLowerCase();        
        } else {
            messege += "email is invalid\n";
            f = false;
        } 
    }
    
    
    public boolean flag(){
        return f;
    } 
}
