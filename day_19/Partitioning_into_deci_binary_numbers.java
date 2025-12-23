package day_19;
public class Partitioning_into_deci_binary_numbers {
        public int minPartitions(String n) {
        char prev='0';
        for(int i=0;i<n.length();i++){
            if(n.charAt(i)>prev){
                prev=n.charAt(i);
            }

        }
        return prev-'0';
    }
}