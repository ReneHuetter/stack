package ad.bbrz.stack;

import java.util.ArrayList;

import static ad.bbrz.stack.Runner.stackListe;

public class MyStack {

    private final ArrayList<Integer> stack = new ArrayList<>();

     public Integer push (Integer wert) {
        stack.add(wert);
        return wert;
    }

    public Integer pop () {
        return stack.remove(stack.size() - 1);
    }

    public Integer peek () {
        return stack.get(stack.size() - 1);
    }

    public Integer addTwo () {
        if (stack.isEmpty()){
           return 0;
        }
        if (stack.size() == 1){
            return peek();
        }

         /*
           Integer ergebnis = pop()+pop();
            push(ergebnis);
            return ergebnis;
          */
        return push(pop() + pop());
    }

    public void catchLastValue (MyStack stack) {
        push(stack.pop());
    }

    public void ausgabe () {
        for (Integer integer : stack) {
            System.out.print(integer + ",");
        }
        System.out.println();
    }

    public void mergeStack (MyStack mergeStack) {
         for (){
            push(mergeStack.pop());
         }
    }
}
