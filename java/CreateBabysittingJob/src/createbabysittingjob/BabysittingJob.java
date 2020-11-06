/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package createbabysittingjob;

/**
 *
 * @author Marc Pardee
 * Date 2020-06-20
 * 
 * Create a BabysittingJob class for Georgette's Babysitting Service. The
 * class contains fields to hold the following:
 * -Job number that contains six digits. First two digits represent the year
 * and the last four digits represent a sequential number. For example the 
 * first job in 2014 has a job number of 140001.
 * 
 * -Code representing the employee assigned to the job. Assume the code will
 * always be 1, 2, or 3.
 * 
 * -A name based on the babysitter code. Georgette has three sitters:
 *  1) Cindy, 2) Greg, and 3) Marcia
 * 
 * -Number of children to be watched. Assume the number is always >0.
 * 
 * -Number of hours on the job. Assume the hours are whole numbers.
 * 
 * -Fee for the job. Cindy is $7/hr per child, 
 *  Greg and Marcia $9/hr for the first child and $4 per additional hour
 *  for each additional child. For example, if Greg watches Three Children
 * for two hours, he makes $17 per hour for two hours or $34.
 * 
 * 
 * Create a constructor for the BabySittingJob class that accepts arguments
 * for the job number, babysitter code, number of children and hours.
 * 
 * The constructor determines the babysitter name and fee for the job.
 * Also include a method that displays every BabysittingJob object field.
 */
public class BabysittingJob {
    private final double CINDY_FEE = 7;
    private final double OTHERS_FEE = 9;
    private final double EXTRA_CHILD_FEE = 4;
    private int jobNo, babysitterCode, children, hours;
    private String name;
    private double fee;
    
    BabysittingJob(int job, int code, int childNo, int hrs){
        jobNo = job;
        babysitterCode = code;
        children = childNo;
        hours= hrs;
        
        switch(code){
            case 1:
                name = "Cindy";
                fee = CINDY_FEE * children * hours;
                break;
            case 2:
                name = "Greg";
                fee = getOthersFee(children, hours);
                break;
            case 3:
                name = "Marcia";
                fee = getOthersFee(children, hours);
                break;
            default:
                name="";                
        }
    }
    public void getBabysittingJob(){
        System.out.println("Babysitting Job Details:\n===========");
        System.out.println("Job Number: "+jobNo);
        System.out.println("Babysitter Code: "+babysitterCode);
        System.out.println("Babysitter Name: "+name);
        System.out.println("Children watched: "+children);
        System.out.println("Hours watched: "+ hours);
        System.out.println("Total Fee for the job: $"+fee);
    }

    private double getOthersFee(int children, int hours) {
        double totalFee = 0;
        for(int x=1; x<=children; ++x){
            if(x == 1){
              totalFee += OTHERS_FEE;  
            }else{
                totalFee+=EXTRA_CHILD_FEE;
            }
        }
        totalFee *= hours;
        return totalFee;
    }
}
