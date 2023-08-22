package Java;

import java.util.Scanner;

public class SR_CHECKVALIDMIXORNOT{
    public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
            String s1=sc.nextLine();
            String s2=sc.nextLine();
            String s3=sc.nextLine();
            
            int h=0;
            int l=0;
            for(int i=0;i<s1.length();i++){
                char c=s1.charAt(i);
                for(int j=0;j<s3.length();j++){
                    if(c==s3.charAt(j)){
                        if(j>=h){
                            l=1;
                            h=j;
                            break;
                        }
                    }
                }
                if(l==0){
                    System.out.print("NO");
                    return;
                }
                l=0;
            }
            int x=0;
            int l1=0;
            for(int i=0;i<s2.length();i++){
                char c=s2.charAt(i);
                for(int j=0;j<s3.length();j++){
                    if(c==s3.charAt(j)){
                        if(j>=x){
                            l1=1;
                            x=j;
                            break;
                        }
                    }
                }
                if(l1==0){
                    System.out.print("NO");
                    return;
                }
                l1=0;
            }
        }
		System.out.print("YES");

	}

}
