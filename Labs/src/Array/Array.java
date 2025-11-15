
package lab_1;

import java.security.PublicKey;
import java.util.Scanner;
public class Array {
    Scanner in = new Scanner(System.in);
    public void iputvalue(int [] num){
        System.out.println("Enter "+num.length+" number : ");
    for(int i =  0 ; i< num.length ; i++ ){
        num[i]=in.nextInt();
       
    }}
    public void printl(int [] num ){
    for(int i = num.length-1; i>=0 ; i--)
    {
        System.out.println("index [ "+i+"] elamin = "+ num[i] );
    }}
//    public void stor(int [] num){
    //    for
//    }
}
    
