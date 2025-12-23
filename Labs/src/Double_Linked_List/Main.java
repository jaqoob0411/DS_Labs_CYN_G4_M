
package Double_Linked_List;

public class Main {
    public static void main(String[] args) {
        Double_Linked_List<Integer> list = new Double_Linked_List<>() ;
        list.dispaly();
        System.out.println();
        list.Adding(1);
        list.Adding(2); 
        list.Adding(3); 
        list.Adding(4);
        System.out.println("Before deleting : ");
        list.dispaly();
        System.out.println();
        System.out.println("After deletin : ");
        list.Deleting(2);
        list.dispaly();
        System.out.println();
    }
}
