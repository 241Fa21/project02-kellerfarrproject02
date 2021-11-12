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
public class GraduateStudent extends StudentFee{
    private int coursesEnrolled;
    private boolean isGraduateAssistant;
    private String graduateAssistantType;
    private double ADDITIONAL_FEE = 654.45;
    
    public GraduateStudent(String studentName, int studentID, boolean isEnrolled,
            boolean isGraduateAssistant, String graduateAssistantType, int coursesEnrolled){
        //
        super(studentName, studentID, isEnrolled);
        this.isGraduateAssistant = isGraduateAssistant;
        this.graduateAssistantType = graduateAssistantType;
        this.coursesEnrolled = coursesEnrolled;
    }
    public GraduateStudent(String studentName, int studentID, boolean isEnrolled,
            boolean isGraduateAssistant, int coursesEnrolled){
        //
        super(studentName, studentID, isEnrolled);
        this.isGraduateAssistant = isGraduateAssistant;
        this.coursesEnrolled = coursesEnrolled;
    }
    
    public boolean isIsGraduateAssistant(){
        return isGraduateAssistant;
    }
    public int getCoursesEnrolled(){
        return coursesEnrolled;
    }
    //
    public double getPayableAmount(){
        double tuition = ((coursesEnrolled * super.getCREDITS_PER_COURSE()) 
                * super.getPER_CREDIT_FEE() + ADDITIONAL_FEE);
        if(graduateAssistantType.equals("Full")){
            tuition = 0;
        }
        else if(graduateAssistantType.equals("Half")){
            tuition = tuition / 2;
        }
        return tuition;
    }
    @Override
    public String toString(){
        return "*******Graduate students list*******"
                + "\nStudent Name: " + super.getStudentName() 
                + "\nStudent id: " + super.getStudentID() 
                + "\nEnrolled: " + super.isIsEnrolled() 
                + "\nGraduate assistant: "  +  isIsGraduateAssistant()
                + "\nGraduate assistant type: " + graduateAssistantType
                + "\nCouses enrolled: " + getCoursesEnrolled() 
                + "\nPayable amount: " + getPayableAmount();
    }
}    
