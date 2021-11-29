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
public class UGStudent extends StudentFee{
    //Instance variables
    private double scholarshipAmount;
    private int coursesEnrolled;
    private boolean hasScholarship;
    private double ADDITIONAL_FEE = 820.70;
    //
    public UGStudent(String studentName, int studentID, boolean isEnrolled, 
           boolean hasScholarship, double scholarshipAmount, int coursesEnrolled){
        //
        super(studentName, studentID, isEnrolled);
        this.hasScholarship = hasScholarship;
        this.scholarshipAmount = scholarshipAmount;
        this.coursesEnrolled = coursesEnrolled;
        
    }
    
    public boolean isHasScholarship(){
        return hasScholarship;
    }
    public double getScholarshipAmount(){
        return scholarshipAmount;
    }
    public int getCoursesEnrolled(){
        return coursesEnrolled;
    }
    //
    public double getPayableAmount(){
        return ((coursesEnrolled * super.getCREDITS_PER_COURSE()) 
                * super.getPER_CREDIT_FEE()) - scholarshipAmount;
    }
    @Override
    public String toString(){
        return "Student Name: " + super.getStudentName() 
                + "\nStudent id: " + super.getStudentID() 
                + "\nEnrolled: " + super.isIsEnrolled() 
                + "\nScholarship: "  + isHasScholarship() 
                + "\nScholarship amount: " + getScholarshipAmount() 
                + "\nCouses enrolled: " + getCoursesEnrolled() 
                + "\nPayable amount: " + getPayableAmount();
    }
}
