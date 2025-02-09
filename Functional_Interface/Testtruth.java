package Functional_Interface;

public class Testtruth {
    public static void main(String[] args) {
        Truth t1 = num->{
            for(int i=2;i<num;i++){
                if(num%i==0){
                    return false;
                }
            }
            return true;
        };
     System.out.println( t1.isCandidate(12));  
    }
}
