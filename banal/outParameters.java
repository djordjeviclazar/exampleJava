/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lazar
 */

//https://stackoverflow.com/questions/40480/is-java-pass-by-reference-or-pass-by-value
public class outParameters {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) 
    {
        // TODO code application logic here
        /*Double val = new Double(-1.0);
        method(val);
        System.out.println("OutValue: " + val);
        */
        double[] val = new double[1];
        val[0] = -1.0;
        normalMethod(val);
        System.out.println("OutValue: " + val[0]);
        
        // Java: refference is passed by value
    }
    
    public static void method(Double outArg)
    {
        outArg = Math.random();
    }
    
    public static void normalMethod(double[] outArgs)
    {
        outArgs[0] = Math.random();
    }
}
