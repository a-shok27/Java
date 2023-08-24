package Java;

import java.util.Scanner;

public class DT_SR24082023 {
    public static void main(String[] args){
    	try (Scanner sc = new Scanner(System.in)) {
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            int s=0;
            for(int i=0;i<n-1;i++){
                int x=a[i];
                for(int j=i+1;j<n;j++){
                    if(a[j]<x){
                        s+=a[j];
                    }
                }
                System.out.print(s+" ");
                s=0;
            }
        }
		System.out.print("0");
    }
}
