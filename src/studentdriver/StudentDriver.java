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

        Scanner input = new Scanner(System.in);
        

        System.out.println();
        
        System.out.print("Enter the No of UG Students: ");
        int UG = input.nextInt();
        
        System.out.print("Enter the No of Graduate Students: ");
        int Graduate = input.nextInt();
        
        System.out.print("Enter the No of Online Students: ");
        int Online = input.nextInt();
        
        
        
        
        StudentFee[] students = new StudentFee[12];
        File file = new File("input.csv");
        Scanner fileInput = new Scanner(file);

        String[] string = new String[6];
        int index = 0;
        while(fileInput.hasNext()) {
            string = fileInput.next().split(",");
            
            /*
            string[0] = (int)string[0];
            string[1] = (String)string[1];
            string[3] = (boolean)string[2];
            string[4] = (int)string[3];
            string[5] = (boolean)string[4];
            string[6] = (double)string[5];
            
            
            */
            
            if(string.length == 4){
                students[index] = new OnlineStudent(string[1],Integer.parseInt(string[0]),
                        Boolean.parseBoolean(string[2]),Integer.parseInt(string[3]));
            }
            else if(string.length == 6){
                if(string[5].charAt(0) < 48 && string[5].charAt(0) > 57){
                    
                    students[index] = new UGStudent(string[1], Integer.parseInt(string[0]), 
                            Boolean.parseBoolean(string[2]), Boolean.parseBoolean(string[4]),
                            Double.parseDouble(string[5]), Integer.parseInt(string[3]));
                }
                else{
                    students[index] = new GraduateStudent(string[1], Integer.parseInt(string[0]), 
                            Boolean.parseBoolean(string[2]), Boolean.parseBoolean(string[4]),
                            string[5], Integer.parseInt(string[3]));
                }
            }
            index += 1;
        }
        
        fileInput.close();  
        /*
        for (StudentFee s: students) {
            if(s instanceof UGStudent){
                System.out.println(s);
            }
            else if(s instanceof GraduateStudent){
                System.out.println(s);
            }
            else if(s instanceof OnlineStudent){
                System.out.println(s);
            }
        }
        */
        
        //Calculate and display average of UG students fee, number of students
        //who got scholarship, total no of courses enrolled by all UG students.
        UGStudent.class.toString();
        
        
        //Calculate and display average of graduate student’s fee, number of 
        //students who got graduate assistantship, total number of courses enrolled by graduate students.
        GraduateStudent.class.toString();
        
        
        //Calculate and display average of online student’s fee.
        OnlineStudent.class.toString();
    
    
    }
}
