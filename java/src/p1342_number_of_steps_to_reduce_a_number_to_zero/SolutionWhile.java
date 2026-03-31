package p1342_number_of_steps_to_reduce_a_number_to_zero;

public class SolutionWhile {
    public int numberOfSteps(int num) {
        int step = 0;
        while(num>0){
            if((num&1)==0){
                num >>= 1; 
            }else{
                num--;
            }
            step++;
        }
        return step;
    }
}
