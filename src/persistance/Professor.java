/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistance;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 1795162
 */
public class Professor extends Person {
    
    
    List<Student> students = new ArrayList<Student>();
    String photour1;
    
    public Professor(String lastname,String firstname){
        String  employeeId =FormatEmployeeId(lastname, firstname);
        
        System.out.println("new prof " + employeeId);



}

    private String FormatEmployeeId(String lastname1, String firstname) {
        return lastname1.toUpperCase().trim().substring(1, 3) + firstname.toUpperCase().trim().substring(1,3);
    }
    
    public void setPhotour(String photoName, String photoBath){
    
    
    this.photour1 = photoBath+photoName;
    }

    public void isSuperViseBy(Student student) {
        this.students.add(student);
    }
    
    
}
