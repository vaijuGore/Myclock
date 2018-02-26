/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twonumbersapplication;

/**
 *
 * @author sudhi
 */
public class TwoNumbersApplication {

  
    public static void main(String[] args) {
        int a =234;
       int b =345;
       TwoNumbers myNumber = new TwoNumbers(a,b);
       TwoNumbers X =  new TwoNumbers(12,18);
        TwoNumbers Y =  new TwoNumbers(17,17);
      int result = myNumber.first();
        System.out.println(""+result);
       myNumber.max();
       myNumber.second();
       myNumber.equal();
       Boolean re2 = myNumber.equal();
        System.out.println(""+re2);
     // String re1= myNumber.toString();
      // System.out.println(""+re1);
    }
    
}
