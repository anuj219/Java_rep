// practice - 4-7-24
// Reverse Alternate words in the string

import java.util.Scanner;

public class rev_alt_string {
    public static void main(String[] args) {
        count a = new count();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter : ");
        String inp = sc.nextLine();
        String outp = rev(inp);
        System.out.println(outp);
    }

    static String rev(String s){
        String result = "";
        String [] arr = s.split("\\s+");
        for(int i = 0; i< arr.length; i++){
            if(i % 2 != 0){
                String temp = "";
                for(int j = 0; j < arr[i].length(); j++){
                    temp = temp + (arr[i].charAt((arr[i].length()-1) - j));
                }
                arr[i] = temp;
            }
            result = result + arr[i] + " ";
        }
        return result;
    }
}
