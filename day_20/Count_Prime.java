package day_20;

public class Count_Prime {
    public int countPrimes(int n) {
        int count=0;
        if(n<=2){
            return 0;
        }
        int[] notPrime= new int[n];
        for(int i=2;i<=(int)Math.sqrt(n);i++){
            if(notPrime[i]==0)
            for(int j=i*i;j<n;j+=i){
                notPrime[j]=1;
            }
        }
        for(int i=2;i<n;i++){
            if(notPrime[i]==0)
            count++;
        }
        return count;
    }
}
