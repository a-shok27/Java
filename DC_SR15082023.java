package Java;

import java.util.*;

public class DC_SR15082023{
    public static boolean isVowel(char c){
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)>='a'&&s.charAt(i)<='z')||(s.charAt(i)>='A'&&s.charAt(i)<='Z')||(s.charAt(i)=='.')||(s.charAt(i)=='@')||(s.charAt(i)=='_')){
                if(isVowel(s.charAt(i))){
                    System.out.print("*");
                }
                else{
                    System.out.print(s.charAt(i));
                }
            }
            else{
                System.out.print("*");
            }
        }
    }
}
