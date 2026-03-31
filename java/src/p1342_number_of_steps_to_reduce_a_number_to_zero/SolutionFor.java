package p1342_number_of_steps_to_reduce_a_number_to_zero;

public class SolutionFor {
    public int numberOfSteps(int num) {
        int step = 0;
        int currentNum = num;
        for (int i = 0; i<num;i++) {
            if (currentNum%2==0){
                currentNum = currentNum/2;
            }else{
                currentNum--;
            }
            step++;
            if(currentNum==0){
                break;
            }
        }
        return step;
    }
    public static void main(String [] args){
        SolutionFor sol = new SolutionFor();
        int step = sol.numberOfSteps(8);
        System.out.println(step);
    }
}
