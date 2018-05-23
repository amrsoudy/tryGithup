/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistance;

import java.util.Date;

/**
 *
 * @author 1795162
 */
public class Student extends Person{
    
    
    String studenId;
    

    public Student(String nom, String prenom, Date dateNissance) {
        this.lastname = nom;
        this.firstName = prenom;
        this.dateBirth = dateNissance;
        
        this.studenId =createsStudent(nom,prenom,dateNissance);
    }

    private String createsStudent(String lname, String fname, Date date) {
        String end = date.getYear() + "-" + date.getMonth();
        return lname.substring(0,3)+fname.substring(0)+end;
        
        
    }


    public String getStudenId() {
        return studenId;
    }

    public void setStudenId(String studenId) {
        this.studenId = studenId;
    }

    public void study() {
        System.out.println("I Study");
    }
    
    
}
