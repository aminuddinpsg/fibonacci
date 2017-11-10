/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

/**
 *
 * @author Root
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
 int n1=0,n2=1,n3,i,count=33,total=0; // count=33 because values must not exceed 4 milion
 
 System.out.print(n1+"\n"+n2+"\n");//printing 0 and 1    
    
 for(i=2;i<=count;++i)//loop starts from 2 because 0 and 1 are already printed    
 {    
  n3=n1+n2;
    if((n3%2)==0){
  
      total+=n3;
      
      System.out.print(n3+" ="+" even"+"\n");
  }
  
    else{
  System.out.print(n3+" ="+" odd"+"\n");}

  n1=n2;    
  n2=n3;    
 } 
        System.out.println("Sum ot the even-valued = "+total);
  
}}  
        
        
        
        
        
    
    
