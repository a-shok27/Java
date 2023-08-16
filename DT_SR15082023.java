package Java;

import java.util.*;

public class DT_SR15082023 {
    public static boolean isVowel(char c){
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int c=0;
        for(int i=0;i<s.length();i++){
            if(isVowel(s.charAt(i))){
                c++;
            }
        }
        int z1=1;
        int z=0;
        for(int i=0;i<c;i++){
            for(int j=0;j<s.length();j++){
                if(isVowel(s.charAt(j)) && z!=z1){
                    System.out.print("["+s.charAt(j)+"]");
                    z++;
                }
                else{
                    System.out.print(s.charAt(j));
                }
            }
            System.out.println();
            z=0;
            z1++;
        }
    }
}
