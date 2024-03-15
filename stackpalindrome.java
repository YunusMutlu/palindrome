import java.util.Scanner;
import java.util.Stack;

public class stackpalindrome {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String cumle =inp.nextLine();
        Stack<Character> palindrome = new Stack<Character>();
        for (int i =0;i<cumle.length()/2;i++){
            palindrome.push(cumle.charAt(i));
        }

        if (palindromemu(cumle,palindrome)){
            System.out.println("Cümle palindrom.");
        }
        else{
            System.out.println("Palindrom değil.");
        }
    }
    public static boolean palindromemu(String cumle,Stack<Character> a){
        boolean b=true;
        if (cumle.length()%2==0){
            for (int i=(cumle.length()/2);i<cumle.length();i++){
                if (cumle.charAt(i)!=a.pop()){
                    return false;
                }
            }
        }
        else {
            for (int i=(cumle.length()/2)+1;i<cumle.length();i++){
                if (cumle.charAt(i)!=a.pop()){
                    return false;
                }
            }
        }

        return b;
    }
}
