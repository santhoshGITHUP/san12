package COLLECTION;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Stack_Queue_using_StringCondition {
   public static void main(String[] args) {
	   Stack<String> stack = new Stack<>();
	   Queue<String> queue =new LinkedList<>();
	     stack.add("rajesh");
         stack.add("senthil");
         stack.add("sivaguru");
         stack.add("thiyagu");
         stack.add("mani");
         stack.add("shankar");  // pop condition apply shankar name removed
         
         
       
         queue.add("senthil");
         queue.add("sivaguru");
         queue.add("thiyagu");
         queue.add("mani");
         queue.add("shankar");
         queue.add("rajesh");   // poll condition apply  rajesh name removed
         
        	 System.out.println("Stack Condition------");
        System.out.println("Stack Peek:"+stack.peek());
        System.out.println("Stack Size:" +stack.size());
        System.out.println("Stack pop :"  +stack.pop());
        
        while(stack.size()>0){
        	System.out.println(stack.pop());
        }
        System.out.println("  ");
        System.out.println("Peek Condition-------");
        System.out.println("queu Peek:"+queue.peek());
        System.out.println("queue Size:" +queue.size());
        System.out.println("queu pop :"+ queue.poll());
        while(queue.size()>0){
        	System.out.println(queue.poll());
        }
}
}
