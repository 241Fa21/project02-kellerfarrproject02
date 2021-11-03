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
public class UGStudent {
    //Instance variables
    private double scholarshipAmount;
    private int coursesEnrolled;
    private boolean hasScholarship;
    private double ADDITIONAL_FEE = 820.70;
    //
    public UGStudent(String studentName, int studentID, boolean isEnrolled, 
           boolean hasScholarship, double scholarshipAmount, int coursesEnrolled){
        //
        super();
        
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
    public abstract getPayableAmount(){
        
    }
    @Override
    public String toString(){
        return "";
    }
}
