package ad.bbrz.stack;

import java.util.ArrayList;
import java.util.List;

public class Runner {

   static List<MyStack> stackListe = new ArrayList<>();

    public static void main(String[] args) {

        MyStack stack = new MyStack();

        stack.push(80);
        stack.push(50);
        stack.push(170);

        Integer letzterWert = stack.pop();
        //System.out.println(letzterWert);

        letzterWert = stack.peek();
        //System.out.println(letzterWert);

        letzterWert = stack.addTwo();
        //System.out.println(letzterWert);


        MyStack stack1 = new MyStack();

        stack1.push(5);
        //System.out.println(stack1.addTwo());

        stack.catchLastValue(stack1);
        letzterWert = stack.peek();
        //System.out.println("\n"+letzterWert);

        stackListe.add(stack);
        stackListe.add(stack1);

        stack1.push(69);
        stack1.push(12);
        stack1.push(999);


        //stack1.ausgabe();
        //stack.ausgabe();

        for (MyStack element:stackListe) {
            element.ausgabe();
        }
    }

}
