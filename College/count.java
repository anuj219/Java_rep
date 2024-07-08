// practice - 4th july
// take string input and return number of words

import java.util.Scanner;

public class count {
    public static void main(String[] args) {
        count a = new count();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter : ");
        String inp = sc.nextLine();
        int outp = a.count1(inp);
        System.out.println(outp);

    }
    int count1(String s){
        int cnt = 1;
        for(int i = 0; i < s.length(); i++){
            if((s.charAt(i) == ' ')){
                if(i != s.length()-1){
                    if((s.charAt(i+1) != ' ')){
                        System.out.println("a");
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }
}
