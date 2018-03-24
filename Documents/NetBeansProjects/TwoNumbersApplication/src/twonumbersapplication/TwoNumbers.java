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
public class TwoNumbers {
    private int a;
    private int b;

    public TwoNumbers(int a, int b) {
        this.a = a;
        this.b = b;
    }
    
   public int first(){
    return a;

} 
    public int second(){
    return b;
} 
     public int max(){
         if (a>b){return a;}
    return b;
}  public boolean  equal(){
    if (a==b)
    {return true;}
    return false;
} @Override
    public String toString() {
        return "FirstNumber" +a +"second Number"+b;
    }
}

   


   
    
 
    


