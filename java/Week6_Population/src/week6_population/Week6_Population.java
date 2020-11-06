/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6_population;

/**
 *
 * @author Marc Pardee
 * Date 2020-06-20
 * 
 * Assume the population of Mexico is 114 million and the population increase
 * 1.01 percent annually. Assume the US is 312 million and is reduced by
 * 0.15 percent annualy (0.85 growth). Write an app that displays the
 * populations of hte two countries every year until the population
 * of Mexico exceeds that of the United states and display the number 
 * of years it took.
 */
public class Week6_Population {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final double MEX_GROWTH = 1.01;
        final double US_GROWTH = 0.85;
        double mex_pop = 114; 
        double us_pop = 312;
        int year = 0;
        
        System.out.println("Starting point\n======");
        System.out.println("Year: "+year+"\n------");
        System.out.println("Mexican Popualtion (in millions): "+mex_pop);
        System.out.println("US Population (in millions): " + us_pop);
        while(mex_pop < us_pop){
            System.out.println();
            ++year;
            mex_pop *= MEX_GROWTH;
            us_pop *= US_GROWTH;
            System.out.println("Year: "+year+"\n------");
            System.out.println("Mexican Popualtion (in millions): "+mex_pop);
            System.out.println("US Population (in millions): " + us_pop);
        }
        System.out.println("\n\nIt took : "+ year + " years for MX population"
                + "to surpass US");
    }
    
}
