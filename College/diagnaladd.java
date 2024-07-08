// code to add both diagonal elements of any square matrix
// note : in odd order matrix, the middle element should be calculated only once so as to avoid the addition when doing the sencond dioagonal

public class diagnaladd {
    public static void main(String[] args) {
        diagnaladd a = new diagnaladd();
        
        int[][] A= {
            {1,2,1},  
            {4,1,6},
            {1,8,1}
        };

        a.add1(A);
        a.add2(A);
    }
    void add1(int[][] A)
    {
        int sum1 = 0;
        for (int i = 0; i < A[0].length; i++) {
            sum1 = sum1 + A[i][i];
            if(i!= (A[0].length-1-i)){
                sum1 = sum1 + A[i][ (A[0].length-1)-i ];
            }
        }
        System.out.println("Sum of Diagonal elements : ");
        System.out.println(sum1);
    }

    void add2(int[][] A)
    {
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
