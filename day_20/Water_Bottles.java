package day_20;

public class Water_Bottles {
    public int numWaterBottles(int numBottles, int numExchange) {
        int empty=0;
        int count=0;
        while(numBottles>=1){
            empty=numBottles+empty%numExchange;
            count=count+numBottles;
            numBottles=empty/numExchange;
        }
        return count;
    }
    
}
