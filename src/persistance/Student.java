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
    
    
    String student_id;
    String lastname;
    String firstName;
    Date dateBirth;

    public Student(String n, String p, Date d) {
        this.lastname = n;
        this.firstName = p;
        this.dateBirth = d;
        
        this.student_id =createsStudent(n,p,d);
    }

    private String createsStudent(String lname, String fname, Date date) {
        String end = concate(date);
        return lname.substring(0,3)+fname.substring(0)+end;
        
        
    }

    private String concate(Date date) {
        return date.getYear()+ "-"+date.getMonth();
    }

    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }
    
    public void isSuperViseBy(Professor professor){
        professor.students.add(this);
    
    
    }
    
}
