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
public class OnlineStudent extends StudentFee{
    private int noOfMonths;
    private double MONTHLY_FEE = 1245.25;
    
    public OnlineStudent(String studentName, int studentID, boolean isEnrolled, 
            int noOfMonths){
        //
        super(studentName, studentID, isEnrolled);
        this.noOfMonths = noOfMonths;
    }
    //
    public double getPayableAmount(){
        return MONTHLY_FEE * noOfMonths;
    }
    @Override
    public String toString(){
        return "*******Online students list*******"
                + "\nStudent Name: " + super.getStudentName() 
                + "\nStudent id: " + super.getStudentID() 
                + "\nEnrolled: " + super.isIsEnrolled() 
                + "\nNumber of months: " + noOfMonths 
                + "\nPayable amount: " + getPayableAmount();
    }
}
