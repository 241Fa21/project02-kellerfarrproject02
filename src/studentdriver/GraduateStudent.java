/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdriver;

/**
 *
 * @author S536218
 */
public class GraduateStudent {
    private int coursesEnrolled;
    private boolean isGraduateAssistant;
    private String graduateAssistantType;
    private double ADDITIONAL_FEE = 654.45;
    
    public GraduateStudent(String studentName, int studentID, boolean isEnrolled,
            boolean isGraduateAssistant, String graduateAssistantType, int coursesEnrolled){
        //
        super();
    }
    public GraduateStudent(String studentName, int studentID, boolean isEnrolled,
            boolean isGraduateAssistant, int coursesEnrolled){
        //
        super();
    }
    
    public boolean isIsGraduateAssistant(){
        return isGraduateAssistant;
    }
    public int getCoursesEnrolled(){
        return coursesEnrolled;
    }
    //
    public abstract getPayableAmount(){
        return 34;
    }
    @Override
    public String toString(){
        return "";
    }
}    
