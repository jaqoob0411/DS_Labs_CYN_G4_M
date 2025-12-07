package Array;

import java.security.PublicKey;
import java.util.Scanner;

public class Array {

    Scanner in = new Scanner(System.in);

    public void iputvalue(int[] num) {
        System.out.println("Enter " + num.length + " number : ");
        for (int i = 0; i < num.length; i++) {
            num[i] = in.nextInt();

        }
    }

    public void traversing(int[] a) {
        System.out.print("[");
        for (int i = 0; i < a.length; i++) {
//            System.out.print("a[" + i + "]= " + a[i] + " ");
            System.out.print(" " + a[i] + " ");
        }
        System.out.println("]");
    }

    public static void traversingSting(String[] a) {
        System.out.print("[");
        for (int i = 0; i < a.length; i++) {
//            System.out.print("a[" + i + "]= " + a[i] + " ");
            System.out.print(" " + a[i] + " ");
        }
        System.out.println("]");
    }

    public void printl(int[] num) {
        for (int i = num.length - 1; i >= 0; i--) {
            System.out.println("index [ " + i + "] elamin = " + num[i]);
        }
    }

    public void insert_3(int[] g, int v) {//v=7
        if (g.length == 0) {
            System.out.println("The Array is empty..!!");
            //{2,4,5,6,9}
            return;
        }
        if (g[0] > v) {//لتحقق ما إذا كانت الاضافة في البداية او لا
            for (int i = g.length - 1; i > 0; i--) {
                g[i] = g[i - 1];
            }
            g[0] = v;
            return;
        }// للبحث عن مكان الاضافة  وإضافته
        int index = 0;
        while (index < g.length && g[index] < v) { // 9<7
            index++;
        }

        for (int x = g.length - 1; x > index; x--) { // 4>4
            g[x] = g[x - 1];
        }
        if (index < g.length) {
            g[index] = v;
        } else {
            g[index - 1] = v;
        }
    }

    public void insert(int[] a, int valu) {
        //print masssge if the array is empty 
        if (a.length == 0) {
            System.out.println("the array is Empty");
            return;
        } //this if-condition will implement if the we add element at the beginning
        if (a[0] >= valu) {
            for (int i = a.length - 1; i > 0; i--) {// i = 3
//                traversing(a);
                a[i] = a[i - 1];
            }
            a[0] = valu;
            return;
        } // {2,4,5,6}
        /// v = 1
        // length = 4

        int j = 1;//3
        while (j <= a.length - 1) {// 3<3
            if (a[j] >= valu) {// 3 >= 9
                break;
            }
            j++;
        }
        for (int i = a.length - 1; i > j; i--) { // i = 3    3>1
            a[i] = a[i - 1];
        }
        if (j <= a.length - 1) {// 3<=3
            a[j] = valu;
        } else {
            a[j - 1] = valu;
        }
    }

    ////////////////////////////////Lab_2////////////////////////////
    public void updata(int a[], int index, int value) {
        if (index < 0 || index > a.length) {
            System.out.println("The Enter is output..!");
        } else {
            a[index] = value;
        }
    }

    public void deleteByValue(int[] g, int value) {
        if (g[0] == value) {
            int i = 0;
            for (; i < g.length - 1; i++) {
                g[i] = g[i + 1];
            }
            g[i] = 1000;
        } else {
            int j = 0;
            while (j < g.length - 1) {
                if (g[j + 1] == value) {
                    int i = j + 1;
                    for (; i < g.length - 1; i++) {
                        g[i] = g[i + 1];
                    }
                    g[i] = 1000;
                    break;
                }
                j++;
            }
            if (j == g.length - 1) {
                System.out.println("It is no found..!");
            }

        }
    }

    public void deleteByIndex(int a[], int index) {
        if (index < 0 || index > a.length - 1) {
            System.out.println("The Enter is output..!");
        } else {
            System.out.println("We delete : " + a[index]);
            a[index] = 0;
        }
    }

    public static void sort(int[] g) {
        int n = g.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (g[j] > g[j + 1]) {
                    int temp = g[j];
                    g[j] = g[j + 1];
                    g[j + 1] = temp;
                }
            }

        }
    }

    public static void sortSting(String[] g) {
        int n = g.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (g[j].compareTo(g[j + 1]) > 0) {//if the frist is gerter than the another the method will return number is bager than 0 eles the method retrun number id smaller than 0
                    String temp = g[j];
                    g[j] = g[j + 1];
                    g[j + 1] = temp;
                }
            }

        }
    }

    public static int[] merging(int[] a1, int[] a2) {
        int[] temp_array = new int[a1.length + a2.length];
        int i = 0;/*X*/
        //int index =0;
        for (/*int i = 0*/; i < a1.length; i++) {
            temp_array[i/*index*/] = a1[i];
            //  index++;
        }

        for (/*int i = 0*/; i < temp_array.length/*a2.length*/; i++) {
            temp_array[i/*index*/] = a2[i - a1.length]/*a2[i]*/;
            // index++;
        }
        sort(temp_array);
        return temp_array;

    }

    public static String[] mergingString(String[] a1, String[] a2) {
        String[] temp_array = new String[a1.length + a2.length];
        int i = 0;/*X*/
        //int index =0;
        for (/*int i = 0*/; i < a1.length; i++) {
            temp_array[i/*index*/] = a1[i];
            //  index++;
        }

        for (/*int i = 0*/; i < temp_array.length/*a2.length*/; i++) {
            temp_array[i/*index*/] = a2[i - a1.length]/*a2[i]*/;
            // index++;
        }
        sortSting(temp_array);
        return temp_array;

    }

    public static int LinearSearchStatic(int[] g, int value) {
        for (int index = 0; index < g.length; index++) {
            if (g[index] == value) {
                return index;
            }
        }

        return -1;
    }

    public int LinearSearch(int[] a, int valu) {
        for (int i = 0; i < a.length; i++) {
            if (valu == a[i]) {
                return i;
            } else {
                return 0;
            }
        }
        return 0;
    }

    public static int binarysearchStatic(int[] g, int value) {
        int low = 0;
        int high = g.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (g[mid] == value) {
                return mid;

            } else if (g[mid] < value) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;

    }

    public static boolean binarysearchBoolean(int[] g, int value) {
        int low = 0;
        int high = g.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (g[mid] == value) {
                return true;

            } else if (g[mid] < value) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;

    }

    public int binarysearch(int[] a, int f, int l, int v) {
        while (f <= l) {
            int mid = (f + l) / 2;
            if (a[mid] == v) {
                return mid;

            } else if (v < a[mid]) {
                l = mid - 1;
            } else {
                f = mid + 1;
            }

        }
        return -1;
    }

    public static void compareTo(Integer[] a, Integer[] b) {
        for (Integer i : a) {
            for (int j = 0; j <= b.length - 1; j++) {
//                System.out.println(j);
//                System.out.println("b[j] = "+b[j]);
                if (i.compareTo(b[j]) == 0) {
                    System.out.println("the macht nmber is = " + b[j]);
                    break;
                }
            }
        }

    }

    public static void compareToInt(int[] a, int[] b) {
        for (int i : a) {
            for (int j = 0; j <= b.length - 1; j++) {
                if (b[j] == i) {
                    System.out.println("the macht nmber is = " + b[j]);
                    break;
                }
            }
        }

    }

    public static void compareTo_Stored(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            if (binarysearchBoolean(b, a[i])) {
                System.out.println("the macht nmber is = " + a[i]);
            }
        }
    }

    
    public static void StorTowlistString(String[] a, String[] b) {
        int j = 0;
        int i = 0;
        while(i<a.length && j<b.length){
        int com = a[i].compareTo(b[j]);
        if(com == 0){
            System.out.println(a[i]);
            j++;
            i++;
        }else if ( com < 0){
        i++;
        }else{
        j++;
        }
        }

    }
}






