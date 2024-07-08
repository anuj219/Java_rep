// code to add non diagonal elements of any square matrix

public class nondiagonal_add {
    public static void main(String[] args) {
        nondiagonal_add a = new nondiagonal_add();
        a.addd();
    }
    void addd(){
        int[][] A= {
            {1,2,1},  
            {4,1,6},
            {1,8,1}
        };

        int sum1 = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                if(i != j){
                    if(j != A[0].length-1-i){
                        sum1 = sum1 + A[i][j];
                    }
                }
            }
        }
        System.out.println("Sum of boundary elements : ");
        System.out.println(sum1);
    }
}
