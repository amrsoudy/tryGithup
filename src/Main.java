
import java.text.ParseException;
import java.text.SimpleDateFormat;
import persistance.Lab;
import persistance.Professor;
import persistance.Student;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 1795162
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
        
        Professor prof1 = new Professor("Seoudy","Amr");
        
        Lab lab1 = new Lab();
        lab1.setIdClass("101");
        lab1.setCapacity(10);
        lab1.setNbComputers(15);
        
        Student student1 = new Student("Alaoui","Asmaa",dt.parse("2017-05-02"));
        
   
        
        
     



    }
    
}
