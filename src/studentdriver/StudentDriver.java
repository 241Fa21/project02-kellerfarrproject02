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
        
        StudentFees[] students = new StudentFees[12];
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
        System.out.println("Average of Undergraduate fees: " );
        System.out.println("Number of students who got a scholarship: ");
        System.out.println("Total number of classes enrolled: ");
        
        
        //Calculate and display average of graduate student’s fee, number of 
        //students who got graduate assistantship, total number of courses enrolled by graduate students.
        System.out.println("Average of Graduate Student fees: ");
        System.out.println("Number of students who got Graduate assistantship: ");
        System.out.println("Total number of classes enrolled: ");
        
        
        //Calculate and display average of online student’s fee.
        System.out.println("Average of Online Student fees: ");
    
    fileInput.close();
    }
}
