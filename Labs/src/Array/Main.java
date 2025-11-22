package Array;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
        Array a = new Array();
//        
////        int [] n = new int[3];
//        int [] n = {1,2,3,6,15,114,228,559};
//        
//      // a.iputvalue(n );
//       // a.printl(n);
////        a.updata(n, 1, 100);
////        a.delet(n, 1);
////        int unm = a.LinearSearch(n, 2);
////        if(unm <=0){
////            System.out.println("The index = "+unm);
////        }else{
////            System.out.println("not found ..!");
////        }
//System.out.println("Enter the value you want to search : ");
//int r = in.nextInt();
//          int x = a.binarysearch(n, 0, n.length-1, r);
//        System.out.println("the index is : "+x);
//        in.close();;
//    int []try1 =new int[5];
      int []try1 = {1,5,9,7,14};
      int []try2 = {4,3,885,90};
      
//    a.insert(try1,5);
//    a.insert_3(try1, 0);st
//        a.deleteByIndex(try1, 1);
//        System.out.println(5>4);
//        System.out.println(5>5);
       // a.deleteByValue(try1, 2);
       //a.traversing(try1);
//       a.traversing(try1);
//       Array.sort(try1);
//        System.out.println();
//       a.traversing(try1);
//        System.out.println("The Frst Array : ");
//        a.traversing(try1);
//        System.out.println("The Second Array : ");
//        a.traversing(try2);
    int [] try3=  a.merging(try1, try2);
//        System.out.println("Merging the first array and the scond array : ");
//      a.traversing(try3);
        System.out.println("The index of value 7 in array try3 is [By LinearSearch]: "+Array.LinearSearchStatic(try3, 5));
        System.out.println("The index of value 7 in array try3 is [By BinarySearch]: "+Array.binarysearchStatic(try3, 5));
      
       
      
       
       
        
        
       
        
        
    }
}
