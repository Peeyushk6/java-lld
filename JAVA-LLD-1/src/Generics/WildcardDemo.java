package Generics;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.List;

public class WildcardDemo {

    //Producer -> Extends
    public static void printNumbers(List<? extends Number> list){
        for(Number n : list){
            System.out.println(n);
        }
    }

    //Consumer -> super
    public static void addNumbers(List<? super Integer> list){
        list.add(10);
        list.add(20);
    }

}

class WildCard{
     static void main(String[]args) {
        List<Integer> intList = new ArrayList<>();
        List<Number> numList = new ArrayList<>();


        WildcardDemo.addNumbers(intList);
        WildcardDemo.addNumbers(numList);

        System.out.println("------------------------------");

        WildcardDemo.printNumbers(intList);
        WildcardDemo.printNumbers(numList);

    }
}
