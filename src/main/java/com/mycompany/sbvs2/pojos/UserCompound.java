package com.mycompany.sbvs2.pojos;
// Generated Aug 7, 2018 2:40:59 PM by Hibernate Tools 4.3.1



/**
 * UserCompound generated by hbm2java
 */
public class UserCompound  implements java.io.Serializable {


     private String compound;
     private String email;
     private String result;

    public UserCompound() {
    }

	
    public UserCompound(String compound) {
        this.compound = compound;
    }
    public UserCompound(String compound, String email, String result) {
       this.compound = compound;
       this.email = email;
       this.result = result;
    }
   
    public String getCompound() {
        return this.compound;
    }
    
    public void setCompound(String compound) {
        this.compound = compound;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getResult() {
        return this.result;
    }
    
    public void setResult(String result) {
        this.result = result;
    }




}


