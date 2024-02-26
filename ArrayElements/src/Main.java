//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");
//
//        for (int i = 1; i <= 5; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i);
             Scanner sc =new Scanner(System.in);
             System.out.println("enter the size of array");
             int n = sc.nextInt();

             int [] arr= new int[n];
             System.out.println("enter the elements");
        for(int i=0;i<n;i++){
              System.out.print("the element is "+(i+1)+":");
              arr[i] = sc.nextInt();
        }

             int smallest_ele=arr[0];
             int largest_ele=arr[0];
             for(int i=1;i<arr.length;i++)
             {
                 if(arr[i]> largest_ele)
                     largest_ele = arr[i];
                 else if(arr[i] < smallest_ele)
                     smallest_ele=arr[i];
             }
             System.out.println("The largest element is ="+largest_ele);
             System.out.println("The smallest element is ="+smallest_ele);

        }
    }
//}