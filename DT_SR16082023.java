package Java;

import java.util.Scanner;

public class DT_SR16082023 {
    public static void main(String[]args){
    try (Scanner sc = new Scanner(System.in)) {
        int n=sc.nextInt();
        for(int i=1;i<=n/2;i++){
            if((Math.pow(2,i)+1)==n||(Math.pow(2,i)-1)==n){
                System.out.print(i);
                return ;
            }
        }
    }
        System.out.print("No");
    }
}
