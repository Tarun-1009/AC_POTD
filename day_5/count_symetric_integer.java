package day_5;

public class count_symetric_integer {
        public int countSymmetricIntegers(int low, int high) {
       int n,size,count=0,uSum=0,lSum=0;
       for(int nums=low;nums<=high;nums++){
        n=nums;
        size=0;
        while(n>0){
            n=n/10;
            size++;
        }
        if(size%2==0){
          n=nums%((int)Math.pow(10,size/2));
          lSum=0;
          uSum=0;
          while(n>0){
            lSum=lSum+n%10;
            n=n/10;
          }
          n=nums/((int)Math.pow(10,size/2));
          while(n>0){
            uSum=uSum+n%10;
            n=n/10;
          }
          if(uSum==lSum) count++;
          
        }
        }

       return count;
    }
}
