import java.util.Stack;

public class BracesProblem {
    public static void main(String[] args) {
        boolean test = isProperly(")");
        System.out.println(test);
    }

    public static boolean isProperly(String sequence) {
        Stack<Character> stack = new Stack<>();


        for(int i = 0; i < sequence.length(); i++) {
            char x = sequence.charAt(i);
               if(x == '(') {
                   stack.push(x);
               } else {
                   if(stack.isEmpty()) {
                       return false;
                   } else  {
                       char pop = stack.pop();
                       if(x == ')' && pop != '(') {
                           return false;
                       }
                   }
               }
        }

        if(stack.isEmpty()) {
            return true;
        } else {
            return false;
        }

    }

}
