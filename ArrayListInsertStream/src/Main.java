import java.util.ArrayList;
import java.util.stream.Collectors;

import static java.nio.file.Files.size;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    ArrayList<Integer>al = new ArrayList<>();
     public void lambdaFunction(){

         al.add(1);
         al.add(2);
         al.add(3);
         al.add(4);
         al.add(5);
         al.addFirst(0);
         System.out.println("iterating through the elements using streams:");
         al.stream().forEach(array->System.out.println("ArrayList:"+array));
         ArrayList<Integer> oddnums = (ArrayList<Integer>) al.stream().filter(al-> al %2 !=0 && al==3)
                 .collect(Collectors.toList());
         System.out.println("odd numbers from the list:");

         oddnums.forEach(System.out::println);
     }

    public static void main(String[] args) {
//        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
//        // to see how IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");
//
//        for (int i = 1; i <= 5; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i);
//        }

        Main mainclass= new Main();
        mainclass .lambdaFunction();
    }
}