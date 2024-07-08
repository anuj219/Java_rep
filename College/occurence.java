// practice -   4-7-24
// Number of times a letter occured in the string

import java.util.Scanner;

public class occurence {
    public static void main(String[] args) {
        occurence a = new occurence();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter : ");
        String inp = sc.nextLine();
        a.occ(inp);
        
    }
    // anuj mehta
    void occ(String s){
        char [] arr = {};
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' '){
                continue;
            }
            int flag = 0;
            for (int j = 0; j <= arr.length; j++) {
                System.out.println(j);
                if(s.charAt(i) == arr[j]){
                    flag = 1;
                }   
            }
            if(flag == 0){
            arr[arr.length-1] = s.charAt(i);
            }
        }
        System.out.println(arr);
    }
}
