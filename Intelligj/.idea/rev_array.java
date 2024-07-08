public class rev_array {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int [] n = {0,0,0,0,0};
        for(int i = 0; i < arr.length; i++){
            n[i] = arr[arr.length-1-i];
            System.out.println(n[i]);
        }
        
    }
}
