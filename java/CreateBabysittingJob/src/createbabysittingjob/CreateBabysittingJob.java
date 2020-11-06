/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package createbabysittingjob;

import java.util.Scanner;

/**
 *
 * @author Marc Pardee
 * Date 2020-06-20
 * 
 * create an app that prompts the user for data for a babysitting job.
 * 
 * Keep prompting the user for the following values until valid:
 * 
 * - Four digit year between 2013 and 2025 (inclusive)
 * - Job number for the year between 1 and 9999 inclusive
 * - A babysitter code of 1, 2, or 3
 * - A number of children for the job between 1 and 9 (inclusive)
 * - Number of hours between 1 and 12 (inclusive)
 * 
 * When all data entries are valid, construct a job number from the
 * last two digits of the year and a four-digit sequential number 
 * which might require leading zeroes. Then construct a BabysittingJob
 * object and display its values.
 * 
 */
public class CreateBabysittingJob {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Get year
        System.out.println("Enter a year between 2013 and 2015: ");
        int year = input.nextInt();
        while(year < 2013 || year > 2015){
            System.out.println("Bad input. Enter a year between 2013 "
                    + "and 2015: ");
            year = input.nextInt();
        }
        
        //Job Num
        System.out.println("Enter a job number between 1 and 9999: ");
        int jobNum = input.nextInt();
        while(jobNum <1 || jobNum > 9999){
            System.out.println("Bad input. Enter a job number between "
                    + "1 and 9999: ");
            jobNum = input.nextInt();
        }
        
        //Final invoice Number/jobnumber
        int finalJobNum = getInvoice(year, jobNum);
        
        //Sitter code
        System.out.println("Enter babysitter code (1, 2, or 3): ");
        int sitterCode = input.nextInt();
        while(sitterCode<1 || sitterCode > 3){
            System.out.println("Bad input. Enter a babysitter code "
                    + "(1, 2, or 3): ");
            sitterCode = input.nextInt();
        }
        
        //Children
        System.out.println("How many children (1-9): ");
        int children = input.nextInt();
        while(children<1 || children > 9){
            System.out.println("Bad input. Enter number of children "
                    + "(1-9): ");
            children = input.nextInt();
        }
        
        //Hours
        System.out.println("How many hours? (1-12): ");
        int hours = input.nextInt();
        while(hours < 1 || hours > 12){
            System.out.println("Bad input. Enter a number of hours "
                    + "(1 - 12): ");
            hours = input.nextInt();
        }
        
        //Finally, create object
        BabysittingJob job = new BabysittingJob(finalJobNum, sitterCode,
                                children, hours);
        
        //Display output
        job.getBabysittingJob();
    }

    public static int getInvoice(int year, int jobNum) {
        int yrDigits = year % 100; // Mod 100 leaves two leftovers in a year.
        
        //combine, by making yrDigits a 6 digit number (i.e. 14*10000 =140000)
        //Then add the jobNum
        yrDigits *= 10000;
        int invoiceNum = yrDigits + jobNum;
        return invoiceNum;      
    }


}
