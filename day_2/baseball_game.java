import java.util.Stack;

public class baseball_game {
    public int calPoints(String[] operations) {
     Stack<Integer> record =  new Stack<>();
     int top,sec;
     for(String c : operations){
        if(c.equals("+")){
            top=record.peek();
            record.pop();
            sec=record.peek();
            record.push(top);
            record.push(top+sec);

        }
        else if(c.equals("D")){
            record.push(2*record.peek());
        }
        else if(c.equals("C")){
            record.pop();
        }
        else{
            record.push(Integer.parseInt(c));
        }
     }
     int sum = 0;
    for (int element : record) {
            sum += element;
        }
    return sum;
    }  
}
