import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class nonRepeatingcharacter {
    public String firstNonRepeating(String s) {
        StringBuilder str=new StringBuilder();
        HashMap<Character,Integer> freq = new HashMap<>();
        Queue<Character> queue=new LinkedList<>();
        for(int i=0;i<s.length();i++){
            freq.put(s.charAt(i),freq.getOrDefault(s.charAt(i),0)+1);
            if(freq.get(s.charAt(i))<=1){
                queue.add(s.charAt(i));
            }
            else{
                while(freq.getOrDefault(queue.peek(),0)>1){
                queue.poll();
                }
            }
            if(queue.size()>0){
                str.append(queue.peek());
            }
            else
            str.append('#');
        }
        return str.toString();
    }
}
