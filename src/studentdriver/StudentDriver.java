/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdriver;
import java.util.*;
import java.io.*;
/**
 *
 * @author dianar
 */
public class StudentDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Project02");

        

        System.out.println();
        
        StudentFee[] students = new StudentFee[12];
        File file = new File("input.csv");
        Scanner fileInput = new Scanner(file);


      
        while(fileInput.hasNext()) {
            students = fileInput.next();
        }
                
        for (String s: students) {
            System.out.println(s);
        }
        
        //Calculate and display average of UG students fee, number of students
        //who got scholarship, total no of courses enrolled by all UG students.
        UGStudent.class.toString();
        
        
        //Calculate and display average of graduate student’s fee, number of 
        //students who got graduate assistantship, total number of courses enrolled by graduate students.
        GraduateStudent.class.toString();
        
        
        //Calculate and display average of online student’s fee.
        OnlineStudent.class.toString();
    
    fileInput.close();
    }
}
